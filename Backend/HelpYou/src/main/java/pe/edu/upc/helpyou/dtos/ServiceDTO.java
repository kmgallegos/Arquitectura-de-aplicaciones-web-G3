package pe.edu.upc.helpyou.dtos;

import jakarta.persistence.Column;

public class ServiceDTO {
    private int idService;
    private String nameService;
    private String valuationService;
    private String addressService;
    private String stateService;
    private String descriptionService;
    private int demandService;


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

    public int getDemandService() {
        return demandService;
    }

    public void setDemandService(int demandService) {
        this.demandService = demandService;
    }
}