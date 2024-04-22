package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface IServiceRepository extends JpaRepository<Service, Integer> {
    public List<Service> findByNameService(String name);
}
