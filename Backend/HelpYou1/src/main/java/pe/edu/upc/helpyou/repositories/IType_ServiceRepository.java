package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Type_Service;

public interface IType_ServiceRepository extends JpaRepository<Type_Service, Integer> {
}
