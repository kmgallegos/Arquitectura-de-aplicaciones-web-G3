package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi63.dtos.SubscriptionTypeCountDTO;
import pe.edu.upc.helpyou.entities.Subscription;
import pe.edu.upc.helpyou.repositories.ISubscriptionRepository;
import pe.edu.upc.helpyou.servicesinterfaces.ISubscriptionService;

import java.util.List;
import java.util.ArrayList;
@Service
public class SubscriptionServiceImplement implements ISubscriptionService {
    @Autowired
    private ISubscriptionRepository sR;
    @Override
    public void insert(Subscription subscription) {
        sR.save(subscription);
    }

    @Override
    public List<Subscription> list() {
        return sR.findAll();
    }

    @Override
    public List<String[]> findIncomesBySubscriptionStatusAndMonth() {
        return sR.findIncomesBySubscriptionStatusAndMonth();
    }

      @Override
    public List<SubscriptionTypeCountDTO> countUsersBySubscriptionType() {
        List<Object[]> results = sR.countUsersBySubscriptionType();
        List<SubscriptionTypeCountDTO> dtos = new ArrayList<>();

        for (Object[] result : results) {
            SubscriptionTypeCountDTO dto = new SubscriptionTypeCountDTO();
            dto.setSubscriptionType((String) result[0]);
            dto.setUserCount(((Number) result[1]).intValue());
            dtos.add(dto);
        }

        return dtos;
    }

}
