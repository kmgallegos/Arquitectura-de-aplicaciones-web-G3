package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    public void insert(Subscription subscription);
    public List<Subscription> list();
    List<String[]> findIncomesBySubscriptionStatusAndMonth();
}
