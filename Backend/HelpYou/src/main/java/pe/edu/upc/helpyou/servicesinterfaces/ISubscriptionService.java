package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.dtos.SubscriptionTypeCountDTO;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpyou.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    public void insert(Subscription subscription);
    public List<Subscription> list();
    List<String[]> findIncomesBySubscriptionStatusAndMonth();

    public List<SubscriptionTypeCountDTO> countUsersBySubscriptionType();


}
