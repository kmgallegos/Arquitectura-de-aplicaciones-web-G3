package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.dtos.UserCommentCountDTO;
import pe.edu.upc.helpyou.entities.Comment;

import java.util.List;

public interface ICommentService {
    public void insert(Comment comment);
    public List<Comment> list();
    public void delete(int id);
    public Comment listId(int id);
    public List<UserCommentCountDTO> countCommentsByUser();
}
