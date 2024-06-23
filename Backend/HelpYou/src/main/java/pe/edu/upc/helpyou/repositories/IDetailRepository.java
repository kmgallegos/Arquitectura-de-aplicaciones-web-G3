package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Detail;

@Repository
public interface IDetailRepository extends JpaRepository<Detail, Integer> {

=======
import pe.edu.upc.helpyou.entities.Detail;

public interface IDetailRepository extends JpaRepository<Detail, Integer> {
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
}
