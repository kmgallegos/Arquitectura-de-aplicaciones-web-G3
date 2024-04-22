package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.repositories.IServiceRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IServiceService;

import java.util.List;

@Service
public class ServiceServiceImplements implements IServiceService {
    @Autowired
    private IServiceRepository sR;

    @Override
    public void insert(pe.edu.upc.helpyou.entities.Service service) {
        sR.save(service);
    }

    @Override
    public List<pe.edu.upc.helpyou.entities.Service> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public pe.edu.upc.helpyou.entities.Service listId(int id) {
        return sR.findById(id).orElse(new pe.edu.upc.helpyou.entities.Service());
    }

    @Override
    public List<pe.edu.upc.helpyou.entities.Service> findByNameService(String nameService) {
        return null;
    }
}
