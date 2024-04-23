package pe.edu.upc.helpyou.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "Detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetail;
    @Column (name = "subTotal", nullable = false)
    private int subTotal;
    @Column (name = "quantity", nullable = false)
    private int quantity;


    @ManyToOne
    @JoinColumn(name = "Suscripcion_id")
    private Subscription subscription;

    @OneToOne
    @JoinColumn(name = "Service_id")
    private Service service;

    public Detail() {}

    public Detail(int idDetail, int subTotal, int quantity, Subscription subscription, Service service) {
        this.idDetail = idDetail;
        this.subTotal = subTotal;
        this.quantity = quantity;
        this.subscription = subscription;
        this.service = service;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public Service getService() {
        return service;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
