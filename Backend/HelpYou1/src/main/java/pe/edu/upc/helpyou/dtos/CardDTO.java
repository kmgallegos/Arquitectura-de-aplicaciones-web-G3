package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Users;

public class CardDTO {

    private int idCard;
    private String ownerCard;
    private String number_card;
    private String month_expirationCard;
    private String year_expirationCard;
    private int cvvCard;
    private Users userr;

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

    public Users getUserr() {
        return userr;
    }

    public void setUserr(Users userr) {
        this.userr = userr;
    }
}
