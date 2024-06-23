package pe.edu.upc.helpyou.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idService;
    @Column(name = "nameRole", nullable = false, length = 100)
    private String nameService;
    @Column(name = "valuationService", nullable = false, length = 20)
    private String valuationService;
    @Column(name = "addressService", nullable = false, length = 255)
    private String addressService;
    @Column(name = "stateService", nullable = false, length = 20)
    private String stateService;

    public Service(){}

    public Service(String stateService, String addressService, String valuationService, String nameService, int idService) {
        this.stateService = stateService;
        this.addressService = addressService;
        this.valuationService = valuationService;
        this.nameService = nameService;
        this.idService = idService;
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
}
