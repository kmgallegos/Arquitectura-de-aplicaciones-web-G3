package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotification;
    @Column (name = "title", nullable = false,length=255)
    private String titleNotification;
    @Column (name = "description", nullable = false,length=255)
    private String descriptionNotification;
    @Column (name = "status", nullable = false)
    private Boolean statusNotification;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;



    public Notification() {}

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public String getTitleNotification() {
        return titleNotification;
    }

    public String getDescriptionNotification() {
        return descriptionNotification;
    }

    public Boolean getStatusNotification() {
        return statusNotification;
    }



    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public void setTitleNotification(String titleNotification) {
        this.titleNotification = titleNotification;
    }

    public void setDescriptionNotification(String descriptionNotification) {
        this.descriptionNotification = descriptionNotification;
    }

    public void setStatusNotification(Boolean statusNotification) {
        this.statusNotification = statusNotification;
    }


}
