package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;


@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;
    @Column (name = "descriptionComment", nullable = false,length=255)
    private String descriptionComment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userr;

    public Comment() {}


    public Comment(int idComment, String descriptionComment, Users userr) {
        this.idComment = idComment;
        this.descriptionComment = descriptionComment;
        this.userr = userr;
    }

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
