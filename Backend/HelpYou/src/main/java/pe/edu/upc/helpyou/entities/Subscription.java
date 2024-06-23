package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubscription;
    @Column (name = "dataStartSubscrition", nullable = false)
    private Date dataStartSubscription;
    @Column (name = "subscriptionEndDate", nullable = false)
    private Date subscriptionEndDate;
    @Column (name = "typeSubscription", nullable = false, length = 30)
    private String typeSubscription;
    @Column (name = "statusSubscription", nullable = false, length = 40)
    private String statusSubscription;
    @Column (name = "priceSubscription", nullable = false,length = 50)
    private String priceSubscription;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    public Subscription(){}

    public Subscription(int idSubscription, Date dataStartSubscription, Date subscriptionEndDate, String typeSubscription, String statusSubscription, String priceSubscription, Users user, Service service) {
        this.idSubscription = idSubscription;
        this.dataStartSubscription = dataStartSubscription;
        this.subscriptionEndDate = subscriptionEndDate;
        this.typeSubscription = typeSubscription;
        this.statusSubscription = statusSubscription;
        this.priceSubscription = priceSubscription;
        this.user = user;
        this.service = service;
    }

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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
