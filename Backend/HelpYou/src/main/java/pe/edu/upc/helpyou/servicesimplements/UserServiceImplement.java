package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Role;
import pe.edu.upc.helpyou.entities.Users;
import pe.edu.upc.helpyou.repositories.IRoleRepository;
import pe.edu.upc.helpyou.repositories.IUserRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IUserService;
<<<<<<< HEAD
=======

>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Autowired
    private IRoleRepository rR;

    @Override
    public Users insert(Users user) {
        if (uR.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("El nombre de usuario ya existe");
        }
        if (user.getId() != null && uR.existsById(user.getId())) {
            throw new RuntimeException("El usuario con este ID ya existe");
        }

        // Guarda el usuario
        Users savedUser = uR.save(user);

        // Asigna el rol de CLIENTE
        Role role = new Role("CLIENTE", "Client", savedUser);
        rR.save(role);

        return savedUser;
    }

    @Override
    public List<String[]> quantityCommentsByUser() {
        return uR.quantityCommentsByUser();
    }
    @Override
    public List<String[]> quantityUsersBySubscription() {
        return uR.quantityUsersBySubscription();
    }

    @Override
    public List<String[]> quantityForum() {
        return uR.quantityForum();
    }


<<<<<<< HEAD
    @Override
    public List<Users> list() {
        return uR.findAll();
    }
=======

}
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4

    @Override
    public void delete(Long idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Users listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Users());
    }
}
