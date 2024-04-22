package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Userr;

import java.util.Date;

public class SubscriptionDTO {

    private int idSubscription;
    private Date dataStartSubscription;
    private Date subscriptionEndDate;
    private String typeSubscription;
    private String statusSubscription;
    private String priceSubscription;
    private Userr userr;
    private Service service;

    public int getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(int idSubscription) {
        this.idSubscription = idSubscription;
    }

    public Date getDataStartSubscription() {
        return dataStartSubscription;
    }

    public void setDataStartSubscription(Date dataStartSubscription) {
        this.dataStartSubscription = dataStartSubscription;
    }

    public Date getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    public void setSubscriptionEndDate(Date subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public String getTypeSubscription() {
        return typeSubscription;
    }

    public void setTypeSubscription(String typeSubscription) {
        this.typeSubscription = typeSubscription;
    }

    public String getStatusSubscription() {
        return statusSubscription;
    }

    public void setStatusSubscription(String statusSubscription) {
        this.statusSubscription = statusSubscription;
    }

    public String getPriceSubscription() {
        return priceSubscription;
    }

    public void setPriceSubscription(String priceSubscription) {
        this.priceSubscription = priceSubscription;
    }

    public Userr getUserr() {
        return userr;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
