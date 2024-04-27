package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Service;

public class Type_ServiceDTO {

    private int idTypeService;
    private String descriptionTService;
    private Service service;

    public int getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(int idTypeService) {
        this.idTypeService = idTypeService;
    }

    public String getDescriptionTService() {
        return descriptionTService;
    }

    public void setDescriptionTService(String descriptionTService) {
        this.descriptionTService = descriptionTService;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
