package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Role;
import pe.edu.upc.helpyou.repositories.IRoleRepository;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }
    @Override
    public Role listId(int id) {
        return rR.findById(id).orElse(new Role());
    }
    @Override
    public List<Role> findByNameRole(String nameRole) {
        return rR.findByNameRole(nameRole);
    }
}
