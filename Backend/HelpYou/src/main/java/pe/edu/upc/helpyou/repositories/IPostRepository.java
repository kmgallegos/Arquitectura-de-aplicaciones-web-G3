package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Post;

public interface IPostRepository extends JpaRepository<Post, Integer> {
}
