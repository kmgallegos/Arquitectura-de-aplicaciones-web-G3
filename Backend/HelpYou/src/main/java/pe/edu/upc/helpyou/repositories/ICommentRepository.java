package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Comment;

public interface ICommentRepository extends JpaRepository<Comment, Integer> {
}
