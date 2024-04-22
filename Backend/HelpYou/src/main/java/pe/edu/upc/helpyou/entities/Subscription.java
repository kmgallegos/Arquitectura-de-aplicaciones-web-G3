package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;
import org.springdoc.core.converters.models.MonetaryAmount;

import java.util.Date;

@Entity
@Table(name="Role")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubscription;
    @Column (name = "dataStartSubscrition", nullable = false)
    private Date dataStartS;
    @Column (name = "subscriptionEndDate", nullable = false)
    private Date subscriptionEndDate;
    @Column (name = "typeS", nullable = false, length = 30)
    private String typeS;
    @Column (name = "statusS", nullable = false, length = 40)
    private String statusS;
    @Column (name = "priceS", nullable = false,length = 50)
    private String priceS;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private Userr userr;

    public Subscription(){}


    public Subscription(int idSubscription, Date dataStartS, Date subscriptionEndDate, String typeS, String statusS, String priceS, Userr userr) {
        this.idSubscription = idSubscription;
        this.dataStartS = dataStartS;
        this.subscriptionEndDate = subscriptionEndDate;
        this.typeS = typeS;
        this.statusS = statusS;
        this.priceS = priceS;
        this.userr = userr;
    }

    public Userr getUserr() {
        return userr;
    }

    public String getPriceS() {
        return priceS;
    }

    public String getStatusS() {
        return statusS;
    }

    public String getTypeS() {
        return typeS;
    }

    public Date getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    public Date getDataStartS() {
        return dataStartS;
    }

    public int getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(int idSubscription) {
        this.idSubscription = idSubscription;
    }

    public void setDataStartS(Date dataStartS) {
        this.dataStartS = dataStartS;
    }

    public void setSubscriptionEndDate(Date subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public void setTypeS(String typeS) {
        this.typeS = typeS;
    }

    public void setStatusS(String statusS) {
        this.statusS = statusS;
    }

    public void setPriceS(String priceS) {
        this.priceS = priceS;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }

}
