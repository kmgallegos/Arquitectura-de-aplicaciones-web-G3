package pe.edu.upc.helpyou.entities;


import jakarta.persistence.*;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "Detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetail;

    @Column(name = "subTotal", nullable = false)
    private int subTotalDetail;
    @Column(name = "quantity", nullable = false)
    private int quantityDetail;


    @ManyToOne
    @JoinColumn(name = "idSuscripcion")
    private Subscription subscription;

    @OneToOne
    @JoinColumn(name = "idInvoice")
    private Invoice invoice;

    public Detail() {
    }

    public Detail(int idDetail, int subTotalDetail, int quantityDetail, Subscription subscription, Invoice invoice) {
        this.idDetail = idDetail;
        this.subTotalDetail = subTotalDetail;
        this.quantityDetail = quantityDetail;
        this.subscription = subscription;
        this.invoice = invoice;

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


    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getSubTotalDetail() {
        return subTotalDetail;
    }

    public void setSubTotalDetail(int subTotalDetail) {
        this.subTotalDetail = subTotalDetail;
    }

    public int getQuantityDetail() {
        return quantityDetail;
    }

    public void setQuantityDetail(int quantityDetail) {
        this.quantityDetail = quantityDetail;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;

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
