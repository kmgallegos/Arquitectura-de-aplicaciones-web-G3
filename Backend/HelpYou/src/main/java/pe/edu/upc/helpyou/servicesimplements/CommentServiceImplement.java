package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.dtos.UserCommentCountDTO;
import pe.edu.upc.helpyou.entities.Comment;
import pe.edu.upc.helpyou.repositories.ICommentRepository;
import pe.edu.upc.helpyou.servicesinterfaces.ICommentService;

import java.util.List;

@Service
public class CommentServiceImplement implements ICommentService {
    @Autowired
    private ICommentRepository cR;

    @Override
    public void insert(Comment comment) {
        cR.save(comment);
    }

    @Override
    public List<Comment> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Comment listId(int id) {
        return cR.findById(id).orElse(new Comment());
    }
    
    @Override
    public List<UserCommentCountDTO> countCommentsByUser() {
        List<Object[]> results = cR.countCommentsByUser();
        List<UserCommentCountDTO> dtos = new ArrayList<>();

        for (Object[] result : results) {
            UserCommentCountDTO dto = new UserCommentCountDTO();
            dto.setUsername((String) result[0]);
            dto.setCommentCount(((Number) result[1]).intValue());
            dtos.add(dto);
        }

        return dtos;
    }
}
