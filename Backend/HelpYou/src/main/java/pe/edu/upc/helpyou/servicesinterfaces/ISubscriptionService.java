package pe.edu.upc.helpyou.servicesinterfaces;

import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
<<<<<<< HEAD
    void insert(Subscription subscription);
    List<Subscription> list();
    Subscription listId(int id);
    void delete(int id);
    void update(Subscription subscription);
    List<String[]> findIncomesBySubscriptionStatusAndMonth();
    List<String[]> findIncomesBySubscriptionType();
=======
    public void insert(Subscription subscription);
    public List<Subscription> list();
    List<String[]> findIncomesBySubscriptionStatusAndMonth();

>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
}
