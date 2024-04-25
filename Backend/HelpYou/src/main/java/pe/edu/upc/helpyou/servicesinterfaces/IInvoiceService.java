package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Invoice;

import java.util.List;

public interface IInvoiceService {
    public void insert(Invoice invoice);
    public List<Invoice> list();
}
