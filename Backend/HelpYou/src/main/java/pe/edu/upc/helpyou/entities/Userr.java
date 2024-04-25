package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Userr")
public class Userr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "firstNameUser", nullable = false, length = 100)
    private String firstNameUser;
    @Column(name = "lastNameUser", nullable = false, length = 100)
    private String lastNameUser;
    @Column(name = "phoneNumberUser", nullable = false, length = 9)
    private String phoneNumberUser;
    @Column(name = "regionUser", nullable = false, length = 50)
    private String regionUser;
    @Column(name = "dniUser", nullable = false, length = 50)
    private String dniUser;
    @Column(name = "photoUser") //puede ser nulo
    private String photoUser;
    @Column(name = "passwordUser", nullable = false, length = 50)
    private String passwordUser;
    @Column(name = "emailUser", nullable = false, length = 50)
    private String emailUser;

    @ManyToOne
    @JoinColumn(name = "idRole")
    private Role role;

    public Userr(int idUser, String firstNameUser, String lastNameUser, String phoneNumberUser, String regionUser, String dniUser, String photoUser, String passwordUser, String emailUser, Role role) {
        this.idUser = idUser;
        this.firstNameUser = firstNameUser;
        this.lastNameUser = lastNameUser;
        this.phoneNumberUser = phoneNumberUser;
        this.regionUser = regionUser;
        this.dniUser = dniUser;
        this.photoUser = photoUser;
        this.passwordUser = passwordUser;
        this.emailUser = emailUser;
        this.role = role;
    }

    public Userr(){}

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFirstNameUser() {
        return firstNameUser;
    }

    public void setFirstNameUser(String firstNameUser) {
        this.firstNameUser = firstNameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public String getPhoneNumberUser() {
        return phoneNumberUser;
    }

    public void setPhoneNumberUser(String phoneNumberUser) {
        this.phoneNumberUser = phoneNumberUser;
    }

    public String getRegionUser() {
        return regionUser;
    }

    public void setRegionUser(String regionUser) {
        this.regionUser = regionUser;
    }

    public String getDniUser() {
        return dniUser;
    }

    public void setDniUser(String dniUser) {
        this.dniUser = dniUser;
    }

    public String getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(String photoUser) {
        this.photoUser = photoUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }
}
