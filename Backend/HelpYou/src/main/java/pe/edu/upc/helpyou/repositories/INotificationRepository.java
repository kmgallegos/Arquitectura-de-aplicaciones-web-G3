package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Notification;

import java.util.List;

@Repository
public interface INotificationRepository extends JpaRepository<Notification, Integer> {


    @Query(value = "SELECT status, COUNT(user_id) AS cantidad\n" +
            "FROM notification\n" +
            "GROUP BY status;",nativeQuery = true)
    public List<String[]> NotificationsPerUser();
=======
import pe.edu.upc.helpyou.entities.Notification;

public interface INotificationRepository extends JpaRepository<Notification, Integer> {
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
}
