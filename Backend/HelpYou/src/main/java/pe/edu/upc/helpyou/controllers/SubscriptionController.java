package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.SubscriptionDTO;
import pe.edu.upc.helpyou.dtos.SubscriptionIncomeDTO;
import pe.edu.upc.helpyou.dtos.SubscriptionTypeDTO;
import pe.edu.upc.helpyou.entities.Subscription;
import pe.edu.upc.helpyou.servicesinterfaces.ISubscriptionService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @Autowired
    private ISubscriptionService sS;

    @PostMapping
    public void registrar(@RequestBody SubscriptionDTO s)
    {
        ModelMapper m= new ModelMapper();
        Subscription ca =m.map(s, Subscription.class);
        sS.insert(ca);
    }

    @GetMapping
    public List<SubscriptionDTO> list(){

        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,SubscriptionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/incomes")
    @PreAuthorize("hasAnyAuthority('MOD', 'ADMIN')")
    public List<SubscriptionIncomeDTO> listSubscriptionIncomes() {

        List<String[]> filalista = sS.findIncomesBySubscriptionStatusAndMonth();
        List<SubscriptionIncomeDTO> dtolista = new ArrayList<>();

        for (String[] columna : filalista) {
            SubscriptionIncomeDTO dto = new SubscriptionIncomeDTO();
            dto.setEstadoSuscripcion((String) columna[0]);
            dto.setMes(Integer.parseInt(columna[1]));
            dto.setIngresosGenerados(Double.parseDouble(columna[2]));
            dtolista.add(dto);
        }

        return dtolista;
    }

    @GetMapping("/tipos")

    public List<SubscriptionTypeDTO> listSubscriptionIncomestype() {

        List<String[]> filalista = sS.findIncomesBySubscriptionType();
        List<SubscriptionTypeDTO> dtolista = new ArrayList<>();

        for (String[] columna : filalista) {
            SubscriptionTypeDTO dto = new SubscriptionTypeDTO();
            dto.setSuscripciónTipo((String) columna[0]);
            dto.setConteoTipo(Integer.parseInt(columna[1]));
            dtolista.add(dto);
        }
        return dtolista;
    }


}
