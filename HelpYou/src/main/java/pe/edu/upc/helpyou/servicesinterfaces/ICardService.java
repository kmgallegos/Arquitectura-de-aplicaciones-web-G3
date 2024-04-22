package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Card;

import java.util.List;

public interface ICardService {
    public void insert(Card card);
    public List<Card> list();
    public void delete(int id);
    public Card listId(int id);
}
