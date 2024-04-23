package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "Forum")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idForum;
    @Column (name = "name", nullable = false,length=500)
    private String name;
    @Column (name = "description", nullable = false,length=500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private Userr userr;



    public Forum() {}

    public Forum(int idForum, String name, String description, Userr userr, Post post) {
        this.idForum = idForum;
        this.name = name;
        this.description = description;
        this.userr = userr;

    }

    public int getIdForum() {
        return idForum;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Userr getUserr() {
        return userr;
    }



    public void setIdForum(int idForum) {
        this.idForum = idForum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }


}
