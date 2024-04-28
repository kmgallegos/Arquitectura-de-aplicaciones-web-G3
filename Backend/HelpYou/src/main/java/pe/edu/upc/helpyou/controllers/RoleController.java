package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IRoleService rS;

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
    public RoleDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.listarId(id), RoleDTO.class);
        return dto;
    }

    @GetMapping

    public List<RoleDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/tiposRoles")

    public List<RoleTypeDTO> listRoleType() {

        List<String[]> filalista = rS.findTypeRoles();
        List<RoleTypeDTO> dtolista = new ArrayList<>();

        for (String[] columna : filalista) {
            RoleTypeDTO dto = new RoleTypeDTO();
            dto.setTipoRol((String) columna[0]);
            dto.setConteoROl(Integer.parseInt(columna[1]));
            dtolista.add(dto);
        }
        return dtolista;
    }

}
