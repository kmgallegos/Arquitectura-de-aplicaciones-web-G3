package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Notification;

public interface INotificationRepository extends JpaRepository<Notification, Integer> {
}
