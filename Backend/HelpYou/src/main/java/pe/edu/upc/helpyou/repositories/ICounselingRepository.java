package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Counseling;

import java.util.List;

@Repository
public interface ICounselingRepository extends JpaRepository<Counseling, Integer> {

    @Query(value = "SELECT username AS usuario, COUNT(id_counseling) AS cantidad\n" +
            "FROM users u\n" +
            "LEFT JOIN counseling c ON u.id = c.user_id\n" +
            "GROUP BY u.id\n" +
            "ORDER BY cantidad DESC\n" +
            "LIMIT 5;"
            ,nativeQuery = true)
    public List<String[]> CounselingByUser();
=======
import pe.edu.upc.helpyou.entities.Counseling;

public interface ICounselingRepository extends JpaRepository<Counseling, Integer> {
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
}
