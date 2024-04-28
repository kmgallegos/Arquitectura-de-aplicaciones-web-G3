package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Post;
import pe.edu.upc.helpyou.repositories.IPostRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IPostService;

import java.util.List;
@Service
public class PostServiceImplement implements IPostService {
    @Autowired
    private IPostRepository pR;
    @Override
    public void insert(Post post) {
        pR.save(post);
    }

    @Override
    public List<Post> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public Post listId(int id) {
        return pR.findById(id).orElse(new Post());
    }
}
