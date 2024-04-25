package pe.edu.upc.helpyou.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpyou.entities.Card;
import pe.edu.upc.helpyou.servicesinterfaces.ICardService;

import java.util.List;
@Service
public class CardServiceImplement implements ICardService {
    @Autowired
    private ICardRepository cR;

    @Override
    public void insert(Card card) {
        cR.save(card);
    }

    @Override
    public List<Card> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {cR.deleteById(id);}

    @Override
    public Card listId(int id) {
        return cR.findById(id).orElse(new Card());
    }
}
