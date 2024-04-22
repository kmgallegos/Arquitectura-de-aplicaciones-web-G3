package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Role;

import java.util.List;

public interface IRoleRepository extends JpaRepository<Role, Integer> {
    public List<Role> findByNameRole(String nameRole);
}
