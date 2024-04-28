package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Invoice;
import pe.edu.upc.helpyou.entities.Subscription;

public class DetailDTO {
    private int idDetail;
    private int subTotalDetail;
    private int quantityDetail;
    private Subscription subscription;
    private Invoice invoice;
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
