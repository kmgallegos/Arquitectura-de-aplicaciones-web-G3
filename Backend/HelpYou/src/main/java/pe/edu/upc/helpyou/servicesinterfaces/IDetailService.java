package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Detail;

import java.util.List;

public interface IDetailService {
    public void insert(Detail detail);
    public List<Detail> list();
}
