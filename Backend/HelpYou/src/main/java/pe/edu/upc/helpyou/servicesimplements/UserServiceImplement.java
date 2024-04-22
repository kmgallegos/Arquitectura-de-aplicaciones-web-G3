package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Userr;
import pe.edu.upc.helpyou.repositories.IUserRepository;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Userr userr) {uR.save(userr);}

    @Override
    public List<Userr> list() {return uR.findAll();}

    @Override
    public void delete(int id)  {uR.deleteById(id);}

    @Override
    public Userr listId(int id) {return uR.findById(id).orElse(new Userr());}

    @Override
    public List<Userr> findByDniUser(String dni) {
        return uR.findByDniUser(dni);
    }


}

