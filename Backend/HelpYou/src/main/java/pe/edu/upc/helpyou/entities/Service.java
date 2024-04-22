package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idService;

    @Column(name = "nameService", nullable = false, length = 100)
    private String nameService;

    @Column(name = "valuationService", nullable = false, length = 20)
    private String valuationService;

    @Column(name = "addressService", nullable = true, length = 255)
    private String addressService;

    @Column(name = "stateService", nullable = false, length = 20)
    private String stateService;

    @Column(name = "descriptionService", nullable = true, length = 500)
    private String descriptionService;

    @Column(name = "demand", nullable = true)
    private int demand;

    public Service() {
    }

    public Service(int idService, String nameService, String valuationService, String addressService, String stateService, String descriptionService, int demand) {
        this.idService = idService;
        this.nameService = nameService;
        this.valuationService = valuationService;
        this.addressService = addressService;
        this.stateService = stateService;
        this.descriptionService = descriptionService;
        this.demand = demand;
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

    public String getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(String descriptionService) {
        this.descriptionService = descriptionService;
    }

    public int getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }
}