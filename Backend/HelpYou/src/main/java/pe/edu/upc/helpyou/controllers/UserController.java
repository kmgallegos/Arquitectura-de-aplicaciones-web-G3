package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.edu.upc.helpyou.dtos.*;
import pe.edu.upc.helpyou.entities.Users;
import pe.edu.upc.helpyou.servicesinterfaces.IUserService;

import java.util.ArrayList;
=======
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.UserDTO;
import pe.edu.upc.helpyou.entities.Userr;
import pe.edu.upc.helpyou.servicesinterfaces.IUserService;

>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
import java.util.List;
import java.util.stream.Collectors;

@RestController
<<<<<<< HEAD
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private IUserService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        try {
            uS.insert(u);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping("/comentarios-por-usuario")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<CommentByUserDTO> cantidadComentariosPorUsuario() {
        List<String[]> filaLista = uS.quantityCommentsByUser();
        List<CommentByUserDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            CommentByUserDTO dto = new CommentByUserDTO();
            dto.setUsername(columna[0]);
            dto.setQuantityComments(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/cantidadusers")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<UserByForumDTO> cantidadUsersForo() {
        List<String[]> filaLista = uS.quantityForum();
        List<UserByForumDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            UserByForumDTO dto = new UserByForumDTO();
            dto.setForo(columna[0]);
            dto.setUsuarios(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }


    @GetMapping("/usuarios-por-suscripcion")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<UserBySubscriptionDTO> cantidadUsersPorSuscripcion() {
        List<String[]> filaLista = uS.quantityUsersBySubscription();
        List<UserBySubscriptionDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            UserBySubscriptionDTO dto = new UserBySubscriptionDTO();
            dto.setSubscriptionType(columna[0]);
            dto.setQuantityUser(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    @PutMapping
    public void modificar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
=======
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
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
        uS.delete(id);
    }

    @GetMapping("/{id}")
<<<<<<< HEAD
    public UserDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listarId(id), UserDTO.class);
        return dto;
    }

    @GetMapping
    public List<UserListDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserListDTO.class);
        }).collect(Collectors.toList());
    }
    
=======
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
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
}
