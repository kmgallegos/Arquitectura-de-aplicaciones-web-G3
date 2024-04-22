package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Userr;

import java.util.List;

public interface IUserService {
    public void insert (Userr userr);
    public List<Userr> list();
}

