package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
<<<<<<< HEAD
=======

>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
import pe.edu.upc.helpyou.entities.Users;
=======

import pe.edu.upc.helpyou.entities.Userr;

>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
import pe.edu.upc.helpyou.repositories.IUserRepository;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD

=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
//Clase 2
@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
<<<<<<< HEAD
    private IUserRepository repo;

    /*@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Aqui lógica para buscar el usuario en BD
        //Usuario defecto web:password

        if ("web".equals(username)) {
            return new User("web", "$2a$12$CTtjF8P3IJVK6pP4w9pTxuldMqQRrfrLbLLIlasdu2K6ii2vWGly2",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
        }
    }*/
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
=======
    private IUserRepository uR;


    @Override
    public UserDetails loadUserByUsername(String dni) throws UsernameNotFoundException {
        Userr user = (Userr) uR.findByDniUser(dni);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", dni));
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
        }

        List<GrantedAuthority> roles = new ArrayList<>();

<<<<<<< HEAD
        user.getRoles().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getRol()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, roles);

        return ud;
    }
}
=======
        user.getRol().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getNameRole()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getDniUser(), user.getPasswordUser(), user.getEnabled(), true, true, true, roles);

        return ud;
    }
}
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
