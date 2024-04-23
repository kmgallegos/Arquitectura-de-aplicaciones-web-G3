package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pe.edu.upc.helpyou.entities.Userr;

import pe.edu.upc.helpyou.repositories.IUserRepository;

import java.util.ArrayList;
import java.util.List;

//Clase 2
@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserRepository uR;


    @Override
    public UserDetails loadUserByUsername(String firstNameUser) throws UsernameNotFoundException {
        Userr user = uR.findByfirstNameUser(firstNameUser);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", firstNameUser));
        }

        List<GrantedAuthority> roles = new ArrayList<>();

        user.getRol().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getNameRole()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getFirstNameUser(), user.getPasswordUser(), user.getEnabled(), true, true, true, roles);

        return ud;
    }
}
