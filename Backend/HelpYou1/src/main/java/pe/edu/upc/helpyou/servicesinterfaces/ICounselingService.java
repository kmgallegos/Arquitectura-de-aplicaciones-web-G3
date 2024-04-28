package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Counseling;

import java.util.List;

public interface ICounselingService {
    public void insert(Counseling counseling);
    public List<Counseling> list();
    public void delete(int id);
    public Counseling listId(int id);
}
