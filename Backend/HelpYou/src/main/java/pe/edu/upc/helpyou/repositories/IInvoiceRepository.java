package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Invoice;

public interface IInvoiceRepository extends JpaRepository<Invoice, Integer> {

}
