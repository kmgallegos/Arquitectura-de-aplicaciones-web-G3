package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPost;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "queryDescription", nullable = false, length = 500)
    private String queryDescription;

    @Column(name = "datePost", nullable = false)
    private Date datePost;

    @ManyToOne
    @JoinColumn(name = "Forum_id")
    private Forum forum;

    public Post() {}

    public Post(int idPost, String name, String queryDescription, Date datePost, Forum forum) {
        this.idPost = idPost;
        this.name = name;
        this.queryDescription = queryDescription;
        this.datePost = datePost;
        this.forum = forum;
    }

    public int getIdPost() {
        return idPost;
    }

    public String getName() {
        return name;
    }

    public String getQueryDescription() {
        return queryDescription;
    }

    public Date getDatePost() {
        return datePost;
    }

    public Forum getForum() {
        return forum;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQueryDescription(String queryDescription) {
        this.queryDescription = queryDescription;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }
}
