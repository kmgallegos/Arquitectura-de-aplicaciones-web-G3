package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.ForumDTO;
import pe.edu.upc.helpyou.entities.Forum;
import pe.edu.upc.helpyou.servicesinterfaces.IForumService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/forums")
public class ForumController {
    @Autowired
    private IForumService fS;
<<<<<<< HEAD



=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
    @PostMapping
    public void registrar(@RequestBody ForumDTO f){
        ModelMapper m=new ModelMapper();
        Forum fo=m.map(f,Forum.class);
        fS.insert(fo);
    }
<<<<<<< HEAD


=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
    @GetMapping
    public List<ForumDTO> list(){

        return fS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ForumDTO.class);
        }).collect(Collectors.toList());
    }
<<<<<<< HEAD

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        fS.delete(id);
    }

=======
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        fS.delete(id);
    }
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
    @GetMapping("/{id}")
    public ForumDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ForumDTO dto=m.map(fS.listId(id),ForumDTO.class);
        return dto;
    }
}
