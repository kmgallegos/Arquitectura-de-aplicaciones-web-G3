package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Role;

import java.util.List;

<<<<<<< HEAD
@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    //un conteo de la columna "rol" que como valor tenga "MOD" , "ADMIN" y "CLIENT" de la tabla roles
    @Query(value = "SELECT \n" +
            "            rol, \n" +
            "            COUNT(*) AS rol_count \n" +
            "            FROM roles \n" +
            "            WHERE rol IN ('MODERADOR', 'ADMINISTRADOR', 'CLIENTE') \n" +
            "            GROUP BY rol;",nativeQuery = true)
    public List<String[]> findTypeRoles();
}
=======
public interface IRoleRepository extends JpaRepository<Role, Integer> {
    public List<Role> findByNameRole(String nameRole);
}
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
