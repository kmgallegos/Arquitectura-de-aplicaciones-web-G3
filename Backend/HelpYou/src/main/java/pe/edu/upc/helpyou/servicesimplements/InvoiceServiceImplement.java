package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Invoice;
import pe.edu.upc.helpyou.repositories.IInvoiceRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IInvoiceService;

import java.util.List;
@Service
public class InvoiceServiceImplement implements IInvoiceService {
    @Autowired
    private IInvoiceRepository iR;
    @Override
    public void insert(Invoice invoice) {
        iR.save(invoice);
    }

    @Override
    public List<Invoice> list() {
        return iR.findAll();
    }
}
