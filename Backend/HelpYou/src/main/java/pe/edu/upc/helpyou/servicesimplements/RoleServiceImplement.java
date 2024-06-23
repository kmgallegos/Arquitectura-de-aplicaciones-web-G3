package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Role;
import pe.edu.upc.helpyou.entities.Users;
import pe.edu.upc.helpyou.repositories.IRoleRepository;
<<<<<<< HEAD
import pe.edu.upc.helpyou.repositories.IUserRepository;
=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
import pe.edu.upc.helpyou.servicesinterfaces.IRoleService;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Autowired
    private IUserRepository rRu;

    @Override
    public void insert(Role rol) {
        rR.save(rol);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Role> roleOptional = rR.findById(id);
        if (roleOptional.isPresent()) {
            Role role = roleOptional.get();
            Users user = role.getUser();
            if (user != null) {
                user.getRoles().remove(role);
                rRu.save(user);
            }
            rR.delete(role);
}

    }

    @Override
    public Role listarId(Long id) {
        return rR.findById(id).orElse(new Role());
    }

    @Override
    public List<String[]> findTypeRoles() {
        return rR.findTypeRoles();
    }
}
