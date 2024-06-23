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
    public void registrar(@RequestBody SubscriptionDTO s) {
        ModelMapper m = new ModelMapper();
        Subscription ca = m.map(s, Subscription.class);
        sS.insert(ca);
    }

    @GetMapping
    public List<SubscriptionDTO> list() {
        return sS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, SubscriptionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public SubscriptionDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        SubscriptionDTO dto = m.map(sS.listId(id), SubscriptionDTO.class);
        return dto;
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody SubscriptionDTO s) {
        ModelMapper m = new ModelMapper();
        Subscription ca = m.map(s, Subscription.class);
        ca.setIdSubscription(id);  // Asegúrate de establecer el ID del objeto actualizado
        sS.update(ca);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        sS.delete(id);
    }

    @GetMapping("/incomes")
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

    @GetMapping("/activo-por-suscripcion")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<SubscriptionTypeDTO> estadotipoPorSuscripcion() {
        List<String[]> filaLista = sS.findIncomesBySubscriptionType();
        List<SubscriptionTypeDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            SubscriptionTypeDTO dto = new SubscriptionTypeDTO();
            dto.setStatusSubscription(columna[0]);
            dto.setSubscriptionCount(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}
