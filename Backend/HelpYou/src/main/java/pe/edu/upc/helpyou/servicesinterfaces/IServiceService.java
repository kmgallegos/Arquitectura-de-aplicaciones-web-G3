package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Service;

import java.util.List;

public interface IServiceService {
    public void insert(Service service);
    public List<Service>list();
    public void delete(int id);
    public Service listId(int id);
    public List<Service> findByNameService(String nameService);
    List<String[]> UserByService();

}
