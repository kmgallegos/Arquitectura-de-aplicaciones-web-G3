package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.PostDTO;
import pe.edu.upc.helpyou.entities.Post;
import pe.edu.upc.helpyou.servicesinterfaces.IPostService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private IPostService pS;

    @PostMapping
    public void registrar(@RequestBody PostDTO p){
        ModelMapper m=new ModelMapper();
        Post po=m.map(p,Post.class);
        pS.insert(po);
    }

    @PutMapping
    public void modificar(@RequestBody PostDTO p){
        ModelMapper m=new ModelMapper();
        Post po=m.map(p,Post.class);
        pS.insert(po);
    }

    @GetMapping
    public List<PostDTO> list(){

        return pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,PostDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }
    @GetMapping("/{id}")
    public PostDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PostDTO dto=m.map(pS.listId(id),PostDTO.class);
        return dto;
    }
}
