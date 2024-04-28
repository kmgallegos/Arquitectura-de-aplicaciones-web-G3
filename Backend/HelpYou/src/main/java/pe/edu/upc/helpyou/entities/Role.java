package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Role", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "nameRole"})})

public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column (name = "nameRole", nullable = false, length = 200)
    private String nameRole;
    @Column(name = "descriptionR",nullable = false)
    private String descriptionR;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Userr user;
    public Role() {
    }

    public Role(int idRole, String nameRole, String descriptionR, Userr user) {
        this.idRole = idRole;
        this.nameRole = nameRole;
        this.descriptionR = descriptionR;
        this.user = user;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public String getDescriptionR() {
        return descriptionR;
    }

    public void setDescriptionR(String descriptionR) {
        this.descriptionR = descriptionR;
    }

    public Userr getUser() {
        return user;
    }

    public void setUser(Userr user) {
        this.user = user;
    }
}
