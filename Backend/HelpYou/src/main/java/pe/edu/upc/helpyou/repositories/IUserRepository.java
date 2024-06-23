package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.helpyou.entities.Users;

import java.util.List;


@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);

    //Buscar Numero de comentarios por usuario
    @Query(value = "select u.username, count(*) as Comentarios from Users u inner join Comment c on u.id=c.user_id group by u.username", nativeQuery = true)
    public List<String[]> quantityCommentsByUser();

    @Query(value = "SELECT s.type_Subscription, COUNT(u.id) AS Usuarios\n" +
            "FROM Users u\n" +
            "INNER JOIN Subscription s ON s.id_subscription = u.id\n" +
            "GROUP BY s.type_Subscription;", nativeQuery = true)
    public List<String[]> quantityUsersBySubscription();

    @Query(value = "select f.name as Foro ,count(*) as Usuarios \n" +
            "                              from Forum f inner join Users u \n" +
            "                                 on f.id_forum=u.id\n" +
            "                                 group by f.name", nativeQuery = true)
    public List<String[]> quantityForum();


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);

}