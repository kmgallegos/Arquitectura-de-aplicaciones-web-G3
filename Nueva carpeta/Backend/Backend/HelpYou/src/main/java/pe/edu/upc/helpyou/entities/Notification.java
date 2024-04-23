package pe.edu.upc.helpyou.entities;


import jakarta.persistence.*;
@Entity
@Table(name = "Notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotification;
    @Column (name = "title", nullable = false,length=255)
    private String title;
    @Column (name = "description", nullable = false,length=255)
    private String description;
    @Column (name = "status", nullable = false)
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private Userr userr;
    public Notification() {}

    public Notification(int idNotification, String title, String description, Boolean status, Userr userr) {
        this.idNotification = idNotification;
        this.title = title;
        this.description = description;
        this.status = status;
        this.userr = userr;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getStatus() {
        return status;
    }

    public Userr getUserr() {
        return userr;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }
}
