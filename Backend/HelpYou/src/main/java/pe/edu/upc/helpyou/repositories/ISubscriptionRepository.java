package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Subscription;

import java.util.List;

@Repository
public interface ISubscriptionRepository extends JpaRepository<Subscription, Integer> {
    @Query(value="SELECT s.status_subscription AS estado_suscripcion, \n" +
            "       EXTRACT(MONTH FROM s.subscription_end_date) AS mes, \n" +
            "       SUM(CAST(s.price_subscription AS numeric)) AS ingresos_generados \n" +
            "FROM subscription s \n" +
            "WHERE EXTRACT(MONTH FROM s.subscription_end_date) = EXTRACT(MONTH FROM CURRENT_DATE) \n" +
            "AND EXTRACT(YEAR FROM s.subscription_end_date) = EXTRACT(YEAR FROM CURRENT_DATE) \n" +
            "GROUP BY s.status_subscription, EXTRACT(MONTH FROM s.subscription_end_date)",nativeQuery = true)
    public List<String[]> findIncomesBySubscriptionStatusAndMonth();
}
