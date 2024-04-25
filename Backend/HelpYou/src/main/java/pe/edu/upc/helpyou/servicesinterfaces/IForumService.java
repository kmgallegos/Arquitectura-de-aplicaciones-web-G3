package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Forum;

import java.util.List;

public interface IForumService {

    public void insert(Forum forum);
    public List<Forum> list();
    public void delete(int id);
    public Forum listId(int id);
}
