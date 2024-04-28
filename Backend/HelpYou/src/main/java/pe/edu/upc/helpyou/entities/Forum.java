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
    @JoinColumn(name = "idUser")
    private Userr userr;

    public Forum() {}


    public Forum(int idForum, String nameForum, String descriptionForum, Userr userr) {
        this.idForum = idForum;
        this.nameForum = nameForum;
        this.descriptionForum = descriptionForum;
        this.userr = userr;
    }

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

    public Userr getUserr() {
        return userr;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }
}
