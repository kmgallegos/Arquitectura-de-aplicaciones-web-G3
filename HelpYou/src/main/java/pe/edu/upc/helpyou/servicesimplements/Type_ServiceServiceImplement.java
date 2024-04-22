package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.helpyou.entities.Type_Service;
import pe.edu.upc.helpyou.repositories.IType_ServiceRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IType_ServiceService;

import java.util.List;
@org.springframework.stereotype.Service
public class Type_ServiceServiceImplement implements IType_ServiceService {
    @Autowired
    private IType_ServiceRepository tR;
    @Override
    public void insert(Type_Service service) {
        tR.save(service);
    }

    @Override
    public List<Type_Service> list() {
        return tR.findAll();
    }
}
