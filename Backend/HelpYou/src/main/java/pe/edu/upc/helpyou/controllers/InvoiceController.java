package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.InvoiceDTO;
import pe.edu.upc.helpyou.entities.Invoice;
import pe.edu.upc.helpyou.servicesinterfaces.IInvoiceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    @Autowired
    private IInvoiceService iiS;

    @PostMapping
    public void registrar(@RequestBody InvoiceDTO i)
    {
        ModelMapper m= new ModelMapper();
        Invoice inv =m.map(i, Invoice.class);
        iiS.insert(inv);
    }

    @GetMapping
    public List<InvoiceDTO> list(){

        return iiS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,InvoiceDTO.class);
        }).collect(Collectors.toList());
    }
}
