package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Role;

import java.util.List;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    //un conteo de la columna "rol" que como valor tenga "MOD" , "ADMIN" y "CLIENT" de la tabla roles
    @Query(value = "SELECT \n" +
            "  rol, \n" +
            "  COUNT(*) AS rol_count \n" +
            "FROM roles \n" +
            "WHERE rol IN ('MOD', 'ADMIN', 'CLIENT') \n" +
            "GROUP BY rol;",nativeQuery = true)
    public List<String[]> findTypeRoles();
}
