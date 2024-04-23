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
    @JoinColumn(name = "idUser")
    private Userr userr;
    public Notification() {}

    public Notification(int idNotification, String titleNotification, String descriptionNotification, Boolean statusNotification, Userr userr) {
        this.idNotification = idNotification;
        this.titleNotification = titleNotification;
        this.descriptionNotification = descriptionNotification;
        this.statusNotification = statusNotification;
        this.userr = userr;
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

    public Userr getUserr() {
        return userr;
    }

    public Userr getUser() {
        return userr;
    }

    public void setUser(Userr userr) {
        this.userr = userr;
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

    public void setUserr(Userr userr) {
        this.userr = userr;
    }
}
