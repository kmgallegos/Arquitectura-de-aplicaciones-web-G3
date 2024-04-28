package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Users;

public class ForumDTO {

    private int idForum;
    private String nameForum;
    private String descriptionForum;
    private Users userr;


    public int getIdForum() {
        return idForum;
    }

    public void setIdForum(int idForum) {
        this.idForum = idForum;
    }

    public String getNameForum() {
        return nameForum;
    }

    public void setNameForum(String nameForum) {
        this.nameForum = nameForum;
    }

    public String getDescriptionForum() {
        return descriptionForum;
    }

    public void setDescriptionForum(String descriptionForum) {
        this.descriptionForum = descriptionForum;
    }

    public Users getUserr() {
        return userr;
    }

    public void setUserr(Users userr) {
        this.userr = userr;
    }
}
