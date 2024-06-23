package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;
    @Column (name = "descriptionComment", nullable = false)
    private String descriptionComment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public Comment() {}

    public Comment(Users user, String descriptionComment, int idComment) {
        this.user = user;
        this.descriptionComment = descriptionComment;
        this.idComment = idComment;
    }

    public int getIdComment() { return idComment; }
    public void setIdComment(int idComment) { this.idComment = idComment; }
    public String getDescriptionComment() { return descriptionComment; }
    public void setDescriptionComment(String descriptionComment) { this.descriptionComment = descriptionComment; }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
