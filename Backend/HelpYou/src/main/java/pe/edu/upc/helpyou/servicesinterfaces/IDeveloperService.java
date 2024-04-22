package pe.edu.upc.helpyou.servicesinterfaces;
import pe.edu.upc.helpyou.entities.Developer;

import java.util.List;
public interface IDeveloperService {
    public void insert(Developer developer);
    public List<Developer> list();
    public void delete(int id);
    public Developer listID(int id);
    public List<Developer> findByfirstName(String firstName);


}
