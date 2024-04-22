package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.DeveloperDTO;
import pe.edu.upc.helpyou.entities.Developer;
import pe.edu.upc.helpyou.servicesinterfaces.IDeveloperService;


import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/Developer")
public class DeveloperController {

 @Autowired
    private IDeveloperService dD;
 @PostMapping
    public void registrarDeveloper(@RequestBody DeveloperDTO dto)
 {
     ModelMapper m=new ModelMapper();
     Developer d=m.map(dto, Developer.class);
     dD.insert(d);
 }

 @GetMapping
    public List<DeveloperDTO> list(){
     return dD.list().stream().map(y->{
         ModelMapper m=new ModelMapper();
         return m.map(y,DeveloperDTO.class);
     }).collect(Collectors.toList());
 }


 @DeleteMapping ("/{id}")
    public void delete(@PathVariable("id") Integer id){
     dD.delete(id);
 }


 @GetMapping("/{id}")
    public DeveloperDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DeveloperDTO dto=m.map(dD.listID(id),DeveloperDTO.class);
        return dto;
    }


    @GetMapping("/buscar")
    public List<DeveloperDTO> FindFirstName(@RequestParam String firstName)
    {
        return dD.findByfirstName(firstName).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,DeveloperDTO.class);
        }).collect(Collectors.toList());
    }

}
