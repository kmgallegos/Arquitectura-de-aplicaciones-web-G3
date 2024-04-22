package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column (name = "nameRole", nullable = false, length = 200)
    private String nameRole;
    @Column(name = "descriptionR",nullable = false)
    private String descriptionR;

    public Role() {
    }

    public Role(int idRole, String nameRole, String descriptionR) {
        this.idRole = idRole;
        this.nameRole = nameRole;
        this.descriptionR = descriptionR;
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
}
