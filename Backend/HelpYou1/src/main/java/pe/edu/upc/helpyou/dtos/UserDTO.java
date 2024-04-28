package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Role;

import java.util.List;

public class UserDTO {
    private Long id;


    private String username;

    private String password;
    private Boolean enabled;

    private String firstNameUser;

    private String lastNameUser;

    private String phoneNumberUser;

    private String regionUser;

    private String dniUser;

    private String photoUser;

    private String emailUser;


    private List<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
