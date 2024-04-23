package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

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
    }
}
