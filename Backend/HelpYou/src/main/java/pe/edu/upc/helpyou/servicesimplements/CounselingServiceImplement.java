package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Counseling;
import pe.edu.upc.helpyou.repositories.ICounselingRepository;
import pe.edu.upc.helpyou.servicesinterfaces.ICounselingService;

import java.util.List;

@Service
public class CounselingServiceImplement implements ICounselingService {
    @Autowired
    private ICounselingRepository coR;

    @Override
    public void insert(Counseling counseling) {
        coR.save(counseling);
    }

    @Override
    public List<Counseling> list() {
        return coR.findAll();
    }

    @Override
    public void delete(int id) {
        coR.deleteById(id);
    }

    @Override
    public Counseling listId(int id) {
        return coR.findById(id).orElse(new Counseling());
    }

    @Override
    public void update(Counseling counseling) {
        coR.save(counseling);
    }

    @Override
    public List<String[]> CounselingByUser() {
        return coR.CounselingByUser();
    }
}
