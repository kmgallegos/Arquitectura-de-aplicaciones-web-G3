package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idService;
    @Column(name = "nameService", nullable = false,length = 100)
    private String nameService;
    @Column(name = "descriptionService", length = 500)
    private String descriptionService;
    @Column(name ="valuationService", length = 20)
    private String valuationService;
    @Column(name = "addressService", length = 255)
    private String addressService;
    @Column(name = "stateService", length = 20)
    private String stateService;
    @Column(name = "demandService")
    private int demandService;


    public Service() {
    }

    public Service(int idService, String nameService, String descriptionService, String valuationService, String addressService, String stateService, int demandService) {
        this.idService = idService;
        this.nameService = nameService;
        this.descriptionService = descriptionService;
        this.valuationService = valuationService;
        this.addressService = addressService;
        this.stateService = stateService;
        this.demandService = demandService;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getValuationService() {
        return valuationService;
    }

    public void setValuationService(String valuationService) {
        this.valuationService = valuationService;
    }

    public String getAddressService() {
        return addressService;
    }

    public void setAddressService(String addressService) {
        this.addressService = addressService;
    }

    public String getStateService() {
        return stateService;
    }

    public void setStateService(String stateService) {
        this.stateService = stateService;
    }

    public String getDescriptionService() {return descriptionService;}
    public void setDescriptionService(String descriptionService) { this.descriptionService = descriptionService;}

    public int getDemandService() {
        return demandService;
    }

    public void setDemandService(int demandService) {
        this.demandService = demandService;
    }
}
