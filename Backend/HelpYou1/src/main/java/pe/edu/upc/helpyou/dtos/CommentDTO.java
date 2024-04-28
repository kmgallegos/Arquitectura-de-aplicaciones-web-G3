package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Users;

public class CommentDTO {
    private int idComment;
    private String descriptionComment;
    private Users userr;


    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getDescriptionComment() {
        return descriptionComment;
    }

    public void setDescriptionComment(String descriptionComment) {
        this.descriptionComment = descriptionComment;
    }

    public Users getUserr() {
        return userr;
    }

    public void setUserr(Users userr) {
        this.userr = userr;
    }
}
