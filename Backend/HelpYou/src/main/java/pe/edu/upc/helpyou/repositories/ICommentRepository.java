package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.helpyou.entities.Comment;

import java.util.List;

public interface ICommentRepository extends JpaRepository<Comment, Integer> {

    @Query(value = "SELECT u.username AS username," +
            " COUNT(c.idComment) AS comment_count " +
            "FROM Users u JOIN Comment c ON u.id = c.userr.id " +
            "GROUP BY u.username", nativeQuery = true)
    List<Object[]> countCommentsByUser();

}
