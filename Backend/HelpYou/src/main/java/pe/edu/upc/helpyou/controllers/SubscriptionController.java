package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.SubscriptionDTO;
import pe.edu.upc.helpyou.entities.Subscription;
import pe.edu.upc.helpyou.servicesinterfaces.ISubscriptionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @Autowired
    private ISubscriptionService sS;

    @PostMapping
    public void registrar(@RequestBody SubscriptionDTO s)
    {
        ModelMapper m= new ModelMapper();
        Subscription ca =m.map(s, Subscription.class);
        sS.insert(ca);
    }

    @GetMapping
    public List<SubscriptionDTO> list(){

        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,SubscriptionDTO.class);
        }).collect(Collectors.toList());
    }
}
