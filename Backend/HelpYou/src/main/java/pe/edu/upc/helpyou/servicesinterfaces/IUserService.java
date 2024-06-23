package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Users;

import java.util.List;

public interface IUserService {
    Users insert(Users user);
    public List<String[]> quantityCommentsByUser();
    public List<Users> list();
    public List<String[]> quantityUsersBySubscription();
    public List<String[]> quantityForum();
    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);
}
