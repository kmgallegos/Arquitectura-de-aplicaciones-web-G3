package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Developer;
import pe.edu.upc.helpyou.repositories.IDeveloperRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IDeveloperService;

import java.util.List;

@Service

public class DeveloperServiceImplements implements IDeveloperService {
    @Autowired
    private IDeveloperRepository dD;
    @Override
    public void insert(Developer developer) {
        dD.save(developer);
    }

    @Override
    public List<Developer> list() {
        return dD.findAll();
    }

    @Override
    public void delete(int id) {
      dD.deleteById(id);
    }

    @Override
    public Developer listID(int id) {
        return dD.findById(id).orElse(new Developer());
    }




    @Override
    public List<Developer> findByfirstName(String firstName) {
        return dD.findByfirstName(firstName);
    }


}
