package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Userr;

public class CommentDTO {
    private int idComment;
    private String descriptionComment;
    private Userr userr;


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

    public Userr getUserr() {
        return userr;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }
}
