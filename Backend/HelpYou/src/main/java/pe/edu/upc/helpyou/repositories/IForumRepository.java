package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Forum;

public interface IForumRepository extends JpaRepository<Forum, Integer> {
}
