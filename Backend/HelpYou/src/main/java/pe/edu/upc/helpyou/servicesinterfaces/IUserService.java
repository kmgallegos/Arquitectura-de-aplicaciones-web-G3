package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Users;

import java.util.List;

public interface IUserService {
<<<<<<< HEAD
    Users insert(Users user);
    public List<String[]> quantityCommentsByUser();
    public List<Users> list();
    public List<String[]> quantityUsersBySubscription();
    public List<String[]> quantityForum();
    public void delete(Long idUsuario);
=======
    public void insert(Userr userr);
    public List<Userr> list();
    public void delete(int id);
    public Userr listId(int id);
    public List<Userr> findByDniUser(String dni);


   
}
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4

    public Users listarId(Long idUsuario);
}
