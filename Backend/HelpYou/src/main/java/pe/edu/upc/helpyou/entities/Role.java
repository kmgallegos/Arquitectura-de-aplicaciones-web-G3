package pe.edu.upc.helpyou.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "rol"})})
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rol;

    @Column(name = "descriptionR", nullable = false)
    private String descriptionR;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public Role() {
    }

    // Constructor que acepta rol, descriptionR y user, sin id
    public Role(String rol, String descriptionR, Users user) {
        this.rol = rol;
        this.descriptionR = descriptionR;
        this.user = user;
    }

    // Constructor que acepta todos los campos, incluido id
    public Role(Long id, String rol, String descriptionR, Users user) {
        this.id = id;
        this.rol = rol;
        this.descriptionR = descriptionR;
        this.user = user;
    }

    // Getters y setters...
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescriptionR() {
        return descriptionR;
    }

    public void setDescriptionR(String descriptionR) {
        this.descriptionR = descriptionR;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
