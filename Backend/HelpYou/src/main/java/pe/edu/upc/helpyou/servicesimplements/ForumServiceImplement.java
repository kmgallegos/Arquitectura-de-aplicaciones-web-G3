package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Forum;
import pe.edu.upc.helpyou.repositories.IForumRepository;
import pe.edu.upc.helpyou.servicesinterfaces.IForumService;

import java.util.List;
@Service
public class ForumServiceImplement implements IForumService {

@Autowired
private IForumRepository fR;

    @Override
    public void insert(Forum forum) {
        fR.save(forum);
    }

    @Override
    public List<Forum> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int id) {
        fR.deleteById(id);
    }

    @Override
    public Forum listId(int id) {
        return fR.findById(id).orElse(new Forum());
    }
}
