package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Type_Service;

import java.util.List;

public interface IType_ServiceService {
    public void insert(Type_Service service);
    public List<Type_Service> list();
}
