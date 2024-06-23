package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.CardDTO;
<<<<<<< HEAD
import pe.edu.upc.helpyou.dtos.CardListDTO;
=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
import pe.edu.upc.helpyou.entities.Card;
import pe.edu.upc.helpyou.servicesinterfaces.ICardService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/cards")
public class CardController {
    @Autowired
    private ICardService cS;

    @PostMapping
    public void registrar(@RequestBody CardDTO c)
    {
        ModelMapper m= new ModelMapper();
        Card ca =m.map(c, Card.class);
        cS.insert(ca);
    }

    @GetMapping
<<<<<<< HEAD
    public List<CardListDTO> list(){

        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CardListDTO.class);
        }).collect(Collectors.toList());
    }

=======
    public List<CardDTO> list(){

        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CardDTO.class);
        }).collect(Collectors.toList());
    }
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CardDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        CardDTO dto=m.map(cS.listId(id),CardDTO.class);
        return dto;
    }
}
