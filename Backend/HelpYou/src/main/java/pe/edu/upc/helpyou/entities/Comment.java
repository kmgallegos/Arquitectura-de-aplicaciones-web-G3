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
    @JoinColumn(name = "idUser")

    @Column (name = "description", nullable = false,length=255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private Userr userr;

    public Comment() {}


    public Comment(int idComment, String descriptionComment, Userr userr) {
        this.idComment = idComment;
        this.descriptionComment = descriptionComment;

    public Comment(int idComment, String description, Userr userr) {
        this.idComment = idComment;
        this.description = description;
        this.userr = userr;
    }

    public int getIdComment() { return idComment; }
    public void setIdComment(int idComment) { this.idComment = idComment; }
    public String getDescriptionComment() { return descriptionComment; }
    public void setDescriptionComment(String descriptionComment) { this.descriptionComment = descriptionComment; }

    public Userr getUser() {
        return userr;
    }

    public void setUser(Userr userr) {
        this.userr = userr;
    }

  public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Userr getUserr() { return userr; }
    public void setUserr(Userr userr) { this.userr = userr; }

}
