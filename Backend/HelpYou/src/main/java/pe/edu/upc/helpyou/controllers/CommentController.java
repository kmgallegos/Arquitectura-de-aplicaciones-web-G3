package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.CommentDTO;
import pe.edu.upc.helpyou.entities.Comment;
import pe.edu.upc.helpyou.servicesinterfaces.ICommentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private ICommentService cS;

    @PostMapping
<<<<<<< HEAD
    public void registrar(@RequestBody CommentDTO d)
    {
        ModelMapper m=new ModelMapper();
        Comment dt=m.map(d,Comment.class);
        cS.insert(dt);
        //dS.insert(d);
    }
    @PutMapping
    public void modificarr(@RequestBody CommentDTO c) {
=======
    public void registrar(@RequestBody CommentDTO c) {
        ModelMapper m = new ModelMapper();
        Comment co = m.map(c, Comment.class);
        cS.insert(co);
    }
    @PutMapping
    public void modificar(@RequestBody CommentDTO c) {
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
        ModelMapper m = new ModelMapper();
        Comment co = m.map(c, Comment.class);
        cS.insert(co);
    }

    @GetMapping
<<<<<<< HEAD
    public List<CommentDTO> list(){

        //return dS.list().stream().map(y->{
        //    ModelMapper m=new ModelMapper();
        //   return m.map(y,DetailDTO.class);
        //}).collect(Collectors.toList());

        List<CommentDTO> lista = cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CommentDTO.class);
        }).collect(Collectors.toList());

        return lista;
=======
    public List<CommentDTO> list() {
        return cS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, CommentDTO.class);
        }).collect(Collectors.toList());
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CommentDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        CommentDTO dto = m.map(cS.listId(id), CommentDTO.class);
        return dto;
    }
}