package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Detail;

public interface IDetailRepository extends JpaRepository<Detail, Integer> {
}
