package pe.edu.upc.helpyou.entities;


import jakarta.persistence.*;

@Entity
@Table(name="Developer")

public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDeveloper;
    @Column (name = "firstName", nullable = false, length = 100)
    private String firstName;
    @Column (name = "lastName", nullable = false, length = 100)
    private String lastName;
    @Column (name = "mail", nullable = false, length = 100)
    private String mail;
    @Column (name = "description", nullable = false, length = 500)
    private String description;
    @Column (name = "photo", nullable = false, length = 500)
    private String photo;
    public Developer() {}
    public Developer(String firstName, String lastName, String mail, String description, String photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.description = description;
        this.photo = photo;
    }
    public int getIdDeveloper() { return idDeveloper; }
    public void setIdDeveloper(int idDeveloper) { this.idDeveloper = idDeveloper; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName;}
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

}
