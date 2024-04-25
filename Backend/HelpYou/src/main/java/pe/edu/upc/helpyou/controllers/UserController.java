package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.UserDTO;
import pe.edu.upc.helpyou.entities.Userr;
import pe.edu.upc.helpyou.servicesinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;

    @PostMapping
    public void registrar(@RequestBody UserDTO u)
    {
        ModelMapper m= new ModelMapper();
        Userr userr =m.map(u, Userr.class);
        uS.insert(userr);
    }

    @PutMapping
    public void modificar(@RequestBody UserDTO u)
    {
        ModelMapper m= new ModelMapper();
        Userr userr =m.map(u, Userr.class);
        uS.insert(userr);
    }

    @GetMapping
    public List<UserDTO> list(){

        return uS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UserDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','MODERADOR') and !hasAnyAuthority('USER')" )
    public UserDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UserDTO dto=m.map(uS.listId(id),UserDTO.class);
        return dto;
    }

    @GetMapping("/buscar por dni")
    @PreAuthorize("hasAnyAuthority('ADMIN','MODERADOR') and !hasAnyAuthority('USER')" )
    public List<UserDTO> findByDniUser(@RequestParam String dni){
        return uS.findByDniUser(dni).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UserDTO.class);
        }).collect(Collectors.toList());
    }
}
