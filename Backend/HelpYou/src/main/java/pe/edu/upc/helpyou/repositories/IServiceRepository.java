package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Service;

import java.util.List;

@Repository
public interface IServiceRepository extends JpaRepository<Service, Integer> {
    List<Service> findByNameService(String name);
}
