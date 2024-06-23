package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Detail;
import pe.edu.upc.helpyou.repositories.IDetailRepository;
import pe.edu.upc.helpyou.repositories.IInvoiceRepository;
import pe.edu.upc.helpyou.repositories.ISubscriptionRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IDetailService;

import java.util.List;
@Service
public class DetailServiceImplement implements IDetailService {
    @Autowired
    private IDetailRepository dR;

    @Autowired
    private ISubscriptionRepository sR;

    @Autowired
    private IInvoiceRepository iR;

    @Override
    public void insert(Detail detail /*DetailDTO dto*/ ) {
        /*Detail detail = new Detail();
        detail.setIdDetail(dto.getIdDetail());
        detail.setQuantityDetail(dto.getQuantityDetail());
        detail.setSubTotalDetail(dto.getSubTotalDetail());
        detail.setSubscription(sR.getReferenceById(dto.getSubscription()));
        detail.setInvoice(iR.getReferenceById(dto.getInvoice()));
        dR.save(detail);*/
        dR.save(detail);
    }

    @Override
    public List<Detail> list() {
        return dR.findAll();
    }
}
