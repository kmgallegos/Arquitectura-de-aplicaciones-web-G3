package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Users;

public class RoleDTO {
    private Long id;

    private String rol;

    private String descriptionR;


    private Users user;

    public Long getId() {
        return id;
    }

    public String getDescriptionR() {
        return descriptionR;
    }

    public void setDescriptionR(String descriptionR) {
        this.descriptionR = descriptionR;
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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
