package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCard;
    @Column(name = "ownerCard", nullable = false, length = 100)
    private String ownerCard;
    @Column(name = "number_card", nullable = false, length = 16)
    private String number_card;
    @Column(name = "month_expirationCard", nullable = false, length = 2)
    private String month_expirationCard;
    @Column(name = "year_expirationCard", nullable = false, length = 4)
    private String year_expirationCard;
    @Column(name = "nameCard", nullable = false)
    private String nameCard;
    @Column(name = "cvvCard", nullable = false)
    private int cvvCard;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public Card() {}




    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }
    
    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getOwnerCard() {
        return ownerCard;
    }

    public void setOwnerCard(String ownerCard) {
        this.ownerCard = ownerCard;
    }

    public String getNumber_card() {
        return number_card;
    }

    public void setNumber_card(String number_card) {
        this.number_card = number_card;
    }

    public String getMonth_expirationCard() {
        return month_expirationCard;
    }

    public void setMonth_expirationCard(String month_expirationCard) {
        this.month_expirationCard = month_expirationCard;
    }

    public String getYear_expirationCard() {
        return year_expirationCard;
    }

    public void setYear_expirationCard(String year_expirationCard) {
        this.year_expirationCard = year_expirationCard;
    }

    public int getCvvCard() {
        return cvvCard;
    }

    public void setCvvCard(int cvvCard) {
        this.cvvCard = cvvCard;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
