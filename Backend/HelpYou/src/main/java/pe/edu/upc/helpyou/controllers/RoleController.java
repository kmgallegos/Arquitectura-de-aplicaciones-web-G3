package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.RoleDTO;
import pe.edu.upc.helpyou.entities.Role;
import pe.edu.upc.helpyou.servicesinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Role")
public class RoleController {

    @Autowired
    private IRoleService rR;
    @PostMapping

    public void registrar(@RequestBody RoleDTO r){
        ModelMapper m=new ModelMapper();
        Role ro=m.map(r,Role.class);
        rR.insert(ro);
    }
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN','MODERADOR') and !hasAnyAuthority('USER')" )
    public List<RoleDTO> list(){

        return rR.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        rR.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','MODERADOR') and !hasAnyAuthority('USER')" )
    public RoleDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        RoleDTO dto=m.map(rR.listId(id),RoleDTO.class);
        return dto;
    }

    @GetMapping("/buscar")
    @PreAuthorize("hasAnyAuthority('ADMIN','MODERADOR') and !hasAnyAuthority('USER')" )
    public List<RoleDTO> FindNameRole(@RequestParam String name){

        return rR.findByNameRole(name).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RoleDTO.class);
        }).collect(Collectors.toList());
    }
}