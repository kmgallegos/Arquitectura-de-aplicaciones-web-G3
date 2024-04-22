package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.ServiceDTO;
import pe.edu.upc.helpyou.entities.Service;
import pe.edu.upc.helpyou.servicesinterfaces.IServiceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/services")
public class ServiceController {
    @Autowired
    private IServiceService sS;

    @PostMapping
    public void register(ServiceDTO s)
    {
        ModelMapper m =new ModelMapper();
        Service srv=m.map(s,Service.class);
        sS.insert(srv);
    }

    @GetMapping
    public List<ServiceDTO> list()
    {
        return sS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ServiceDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable("id")Integer id)
    {
        sS.delete(id);
    }

    @GetMapping("/{id}")
    public ServiceDTO ListId(@PathVariable("id") Integer id)
    {
        ModelMapper m = new ModelMapper();
        ServiceDTO dto=m.map(sS.listId(id),ServiceDTO.class);
        return dto;
    }

    @GetMapping("/Buscar")
    public List<ServiceDTO> FindNameService(@RequestParam String name)
    {
        return sS.findByNameService(name).stream().map(y->
        {
            ModelMapper m = new ModelMapper();
            return m.map(y,ServiceDTO.class);
        }).collect(Collectors.toList());
    }
}
