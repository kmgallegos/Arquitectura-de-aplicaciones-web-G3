package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Subscription;
import pe.edu.upc.helpyou.exceptions.DuplicateSubscriptionException;
import pe.edu.upc.helpyou.repositories.ISubscriptionRepository;
import pe.edu.upc.helpyou.servicesinterfaces.ISubscriptionService;

import java.util.List;

@Service
public class SubscriptionServiceImplement implements ISubscriptionService {
    @Autowired
    private ISubscriptionRepository sR;

    @Override
    public void insert(Subscription subscription) {
        try {
            sR.save(subscription);
        } catch (DataIntegrityViolationException ex) {
            throw new DuplicateSubscriptionException("El usuario ya tiene una suscripción.");
        }
    }

    @Override
    public List<Subscription> list() {
        return sR.findAll();
    }

    @Override
    public List<String[]> findIncomesBySubscriptionStatusAndMonth() {
        return sR.findIncomesBySubscriptionStatusAndMonth();
    }
<<<<<<< HEAD

    @Override
    public List<String[]> findIncomesBySubscriptionType() {
        return sR.findIncomesBySubscriptionType();
    }

    @Override
    public Subscription listId(int id) {
        return sR.findById(id).orElse(new Subscription());
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public void update(Subscription subscription) {
        sR.save(subscription);
    }
=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
}
