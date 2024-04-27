package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Detail;
import pe.edu.upc.helpyou.repositories.IDetailRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IDetailService;

import java.util.List;
@Service
public class DetailServiceImplement implements IDetailService {
    @Autowired
    private IDetailRepository dR;

    @Override
    public void insert(Detail detail) {
        dR.save(detail);
    }

    @Override
    public List<Detail> list() {
        return dR.findAll();
    }
}
