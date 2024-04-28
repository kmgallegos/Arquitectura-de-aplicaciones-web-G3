package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "Forum")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idForum;
    @Column (name = "name", nullable = false,length=500)
    private String nameForum;
    @Column (name = "description", nullable = false,length=500)
    private String descriptionForum;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userr;

    public Forum() {}

    public Forum(int idForum, String nameForum, String descriptionForum, Users userr) {
        this.idForum = idForum;
        this.nameForum = nameForum;
        this.descriptionForum = descriptionForum;
        this.userr = userr;
    }

    public Users getUserr() {
        return userr;
    }

    public void setUserr(Users userr) {
        this.userr = userr;
    }
}
