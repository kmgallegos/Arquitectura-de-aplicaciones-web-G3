package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Userr;

import java.time.LocalDate;

public class InvoiceDTO {

    private int idInvoice;
    private LocalDate dateInvoice;
    private float totalInvoice;
    private Userr userr;

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public LocalDate getDateInvoice() {
        return dateInvoice;
    }

    public void setDateInvoice(LocalDate dateInvoice) {
        this.dateInvoice = dateInvoice;
    }

    public float getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(float totalInvoice) {
        this.totalInvoice = totalInvoice;
    }

    public Userr getUserr() {
        return userr;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }
}
