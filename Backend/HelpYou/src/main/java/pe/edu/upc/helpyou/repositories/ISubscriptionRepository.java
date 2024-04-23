package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Subscription;

public interface ISubscriptionRepository extends JpaRepository<Subscription, Integer> {
}
