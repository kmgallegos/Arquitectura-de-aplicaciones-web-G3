package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Userr;

@Repository
public interface IUserRepository extends JpaRepository<Userr, Integer> {
}
