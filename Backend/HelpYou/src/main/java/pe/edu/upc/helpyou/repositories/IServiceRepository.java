package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Service;

import java.util.List;

@Repository
public interface IServiceRepository extends JpaRepository<Service, Integer> {
    public List<Service> findByNameService(String name);

    @Query(value="SELECT ts.descriptiontservice AS tipo_servicio, COUNT(DISTINCT u.id_user) AS cantidad_usuarios \n" +
            "FROM subscription s\n" +
            "INNER JOIN type_service ts ON s.id_service = ts.id_service \n" +
            "INNER JOIN userr u ON s.id_user = u.id_user \n" +
            "GROUP BY  ts.descriptiontservice; \n",nativeQuery = true)
    public List<String[]> UserByServiceDTO();

}
