package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Counseling;

public interface ICounselingRepository extends JpaRepository<Counseling, Integer> {
}
