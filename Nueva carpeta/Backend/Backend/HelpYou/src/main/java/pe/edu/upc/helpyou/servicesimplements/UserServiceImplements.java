package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Userr;
import pe.edu.upc.helpyou.repositories.IUserRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplements implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Userr userr) {
        uR.save(userr);
    }

    @Override
    public List<Userr> list() {
        return uR.findAll();
    }
}
