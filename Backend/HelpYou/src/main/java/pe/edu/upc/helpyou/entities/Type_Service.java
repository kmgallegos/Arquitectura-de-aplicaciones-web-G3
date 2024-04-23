package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Type_Service")
public class Type_Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeService;
    @Column(name = "descriptionTService", nullable = false,length = 255)
    private String descriptionTService;

    @OneToOne
    @JoinColumn (name = "idService")
    private Service service;
    public Type_Service() {}

    public Type_Service(String descriptionTService, Service service) {
        this.descriptionTService = descriptionTService;
        this.service = service;
    }
    public int getIdTypeService() { return idTypeService; }
    public void setIdTypeService(int idTypeService) { this.idTypeService = idTypeService; }
    public String getDescriptionTService() { return descriptionTService; }
    public void setDescriptionTService(String descriptionTService) { this.descriptionTService = descriptionTService;}
    public Service getService() { return service;}
    public void setService(Service service) { this.service = service;}

}
