package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.RoleDTO;
import pe.edu.upc.helpyou.entities.Role;
import pe.edu.upc.helpyou.servicesinterfaces.IRoleService;
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.RoleDTO;
import pe.edu.upc.helpyou.dtos.RoleTypeDTO;
import pe.edu.upc.helpyou.entities.Role;
import pe.edu.upc.helpyou.servicesinterfaces.IRoleService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
<<<<<<< HEAD
    private IRoleService rS;
=======
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
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4

    @PostMapping
    public void registrar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        rS.delete(id);
    }

    @GetMapping("/{id}")
<<<<<<< HEAD
    public RoleDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.listarId(id), RoleDTO.class);
        return dto;
    }

    @GetMapping
=======
    @PreAuthorize("hasAnyAuthority('ADMIN','MODERADOR') and !hasAnyAuthority('USER')" )
    public RoleDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        RoleDTO dto=m.map(rR.listId(id),RoleDTO.class);
        return dto;
    }

    @GetMapping("/buscar")
    @PreAuthorize("hasAnyAuthority('ADMIN','MODERADOR') and !hasAnyAuthority('USER')" )
    public List<RoleDTO> FindNameRole(@RequestParam String name){
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4

    public List<RoleDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/tiposRoles")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<RoleTypeDTO> listRoleType() {

        List<String[]> filalista = rS.findTypeRoles();
        List<RoleTypeDTO> dtolista = new ArrayList<>();

        for (String[] columna : filalista) {
            RoleTypeDTO dto = new RoleTypeDTO();
            dto.setRol((String) columna[0]);
            dto.setRolCount(Integer.parseInt(columna[1]));
            dtolista.add(dto);
        }
        return dtolista;
    }
}