package pe.edu.upc.helpyou.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Developer;

import java.util.List;
public interface IDeveloperRepository extends JpaRepository<Developer, Integer> {
    public List<Developer> findByfirstName(String firstName);
}
