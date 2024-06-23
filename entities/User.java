package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "nameUser", nullable = false, length = 255)
    private String nameUser;
    @Column(name = "phoneNumberUser", nullable = false, length = 9)
    private String phoneNumberUser;
    @Column(name = "regionUser", nullable = false, length = 60)
    private String regionUser;
    @Column(name = "dniUser", nullable = false, length = 8)
    private int dniUser;
    @Column(name = "photoUser", nullable = false, length = 255)
    private String photoUser;
    @Column(name ="password", nullable = false, length = 100)
    private String password;
    @Column(name ="email", nullable = false, length = 255)
    private String email;
    public User() {

    }

    public User(int idUser, String nameUser, String phoneNumberUser, String regionUser, int dniUser, String photoUser, String password, String email) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.phoneNumberUser = phoneNumberUser;
        this.regionUser = regionUser;
        this.dniUser = dniUser;
        this.photoUser = photoUser;
        this.password = password;
        this.email = email;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String User) {
        this.nameUser = nameUser;
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

    public int getDniUser() {
        return dniUser;
    }

    public void setDniUser(int dniUser) {
        this.dniUser = dniUser;
    }

    public String getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(String photoUser) {
        this.photoUser = photoUser;

    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}