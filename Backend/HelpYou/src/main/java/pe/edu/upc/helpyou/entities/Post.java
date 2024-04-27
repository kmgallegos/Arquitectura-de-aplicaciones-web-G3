package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPost;
    @Column(name = "namePost", nullable = false)
    private String namePost;
    @Column(name = "queryDescription", nullable = false, length = 500)
    private String queryDescription;
    @Column(name = "datePost", nullable = false)
    private LocalDate datePost;

    @ManyToOne
    @JoinColumn(name = "idForum")
    private Forum forum;

    public Post(){}

    public Post(int idPost, String namePost, String queryDescription, LocalDate datePost, Forum forum) {
        this.idPost = idPost;
        this.namePost = namePost;
        this.queryDescription = queryDescription;
        this.datePost = datePost;
        this.forum = forum;
    }

    public int getIdPost() {
        return idPost;
    }

    public String getNamePost() {
        return namePost;
    }

    public String getQueryDescription() {
        return queryDescription;
    }

    public LocalDate getDatePost() {
        return datePost;
    }

    public Forum getForum() {
        return forum;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }
    public void setQueryDescription(String queryDescription) {
        this.queryDescription = queryDescription;
    }

    public void setDatePost(LocalDate datePost) {
        this.datePost = datePost;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }
}
