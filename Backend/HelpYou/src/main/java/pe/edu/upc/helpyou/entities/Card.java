package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;


import java.io.Serializable;

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
    @Column(name = "cvvCard", nullable = false)
    private int cvvCard;

    @ManyToOne
    @JoinColumn(name = "idUser")

  
    @Column(name = "owner", nullable = false, length = 100)
    private String owner;
    @Column(name = "number_card", nullable = false, length = 16)
    private String number_card;
    @Column(name = "month_expiration", nullable = false, length = 2)
    private String month_expiration;
    @Column(name = "year_expiration", nullable = false, length = 4)
    private String year_expiration;
    @Column(name = "cvv", nullable = false)
    private int cvv;

    @ManyToOne
    @JoinColumn(name = "User_id")

  private Userr userr;

    public Card() {}

    public Card(int idCard, String ownerCard, String number_card, String month_expirationCard, String year_expirationCard, int cvvCard, Userr userr) {
        this.idCard = idCard;
        this.ownerCard = ownerCard;
        this.number_card = number_card;
        this.month_expirationCard = month_expirationCard;
        this.year_expirationCard = year_expirationCard;
        this.cvvCard = cvvCard;

    public Card(int idCard, String owner, String number_card, String month_expiration, String year_expiration, int cvv, Userr userr) {
        this.idCard = idCard;
        this.owner = owner;
        this.number_card = number_card;
        this.month_expiration = month_expiration;
        this.year_expiration = year_expiration;
        this.cvv = cvv;
        this.userr = userr;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public Userr getUser() {
        return userr;
    }

    public void setUser(Userr userr) {

    public String getMonth_expiration() {
        return month_expiration;
    }

    public void setMonth_expiration(String month_expiration) {
        this.month_expiration = month_expiration;
    }

    public String getYear_expiration() {
        return year_expiration;
    }

    public void setYear_expiration(String year_expiration) {
        this.year_expiration = year_expiration;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Userr getUserr() {
        return userr;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }
}
