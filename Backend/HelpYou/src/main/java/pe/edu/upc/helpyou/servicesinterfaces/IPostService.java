package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Post;

import java.util.List;

public interface IPostService {

    public void insert(Post post);
    public List<Post> list();
    public void delete(int id);
    public Post listId(int id);
}
