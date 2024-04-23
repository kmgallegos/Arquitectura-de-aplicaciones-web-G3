package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPost;
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Column(name = "queryDescriptio", nullable = false, length = 500)
    private String queryDescriptio;
    @Column(name = "datePost", nullable = false)
    private Date datePost;

    @ManyToOne
    @JoinColumn(name = "Forum_id")
    private Forum forum;

    public Post(){}

    public Post(int idPost, String name, String queryDescriptio, Date datePost, Forum forum) {
        this.idPost = idPost;
        this.name = name;
        this.queryDescriptio = queryDescriptio;
        this.datePost = datePost;
        this.forum = forum;
    }

    public int getIdPost() {
        return idPost;
    }

    public String getName() {
        return name;
    }

    public String getQueryDescriptio() {
        return queryDescriptio;
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

    public void setQueryDescriptio(String queryDescriptio) {
        this.queryDescriptio = queryDescriptio;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }
}
