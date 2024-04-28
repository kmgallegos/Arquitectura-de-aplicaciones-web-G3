package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.DetailDTO;
import pe.edu.upc.helpyou.entities.Detail;
import pe.edu.upc.helpyou.servicesinterfaces.IDetailService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/details")
public class DetailController {
    @Autowired
    private IDetailService dS;

    @PostMapping
    public void registrar(@RequestBody DetailDTO d)
    {
        ModelMapper m= new ModelMapper();
        Detail det =m.map(d, Detail.class);
        dS.insert(det);
    }

    @GetMapping
    public List<DetailDTO> list(){

        return dS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,DetailDTO.class);
        }).collect(Collectors.toList());
    }
}
