package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    void insert(Subscription subscription);
    List<Subscription> list();
    Subscription listId(int id);
    void delete(int id);
    void update(Subscription subscription);
    List<String[]> findIncomesBySubscriptionStatusAndMonth();
    List<String[]> findIncomesBySubscriptionType();
}
