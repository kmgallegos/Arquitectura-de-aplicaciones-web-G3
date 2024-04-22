package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Userr")
public class Userr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "nameUser", nullable = false, length = 100)
    private String nameUser;

    @Column(name = "phoneNumberUser", nullable = false, length = 9)
    private String phoneNumberUser;

    @Column(name = "regionUser", nullable = false, length = 50)
    private String regionUser;

    @Column(name = "dniUser", nullable = false, length = 8)
    private int dniUser;

    @Column(name = "photoUser")
    private String photoUser;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @ManyToOne
    @JoinColumn(name = "Role_id")
    private Role role;

    public Userr() {
    }

    public Userr(int idUser, String nameUser, String phoneNumberUser, String regionUser, int dniUser, String photoUser, String password, String email, Role role) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.phoneNumberUser = phoneNumberUser;
        this.regionUser = regionUser;
        this.dniUser = dniUser;
        this.photoUser = photoUser;
        this.password = password;
        this.email = email;
        this.role = role;
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

    public void setNameUser(String nameUser) {
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
