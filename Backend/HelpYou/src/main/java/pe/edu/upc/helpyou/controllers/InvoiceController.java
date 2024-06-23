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

<<<<<<< HEAD
        //return iiS.list().stream().map(y->{
        //    ModelMapper m=new ModelMapper();
        //    return m.map(y, InvoiceDTO.class);
        //}).collect(Collectors.toList());

        List<InvoiceDTO> lista = iiS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,InvoiceDTO.class);
        }).collect(Collectors.toList());
        for (InvoiceDTO dto : lista) {
            System.out.println(dto.getUser().getUsername());
            System.out.println(dto.getIdInvoice());
        }
        return lista;
=======
        return iiS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,InvoiceDTO.class);
        }).collect(Collectors.toList());
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
    }
}
