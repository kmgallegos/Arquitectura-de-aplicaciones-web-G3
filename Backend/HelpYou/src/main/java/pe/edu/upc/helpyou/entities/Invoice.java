package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInvoice;
    @Column(name = "dateInvoice", nullable = false)
    private LocalDate dateInvoice;
    @Column(name = "totalInvoice", nullable = false)
    private float totalInvoice;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Userr userr;

    public Invoice(){}

    public Invoice(int idInvoice, LocalDate dateInvoice, float totalInvoice, Userr userr) {
        this.idInvoice = idInvoice;
        this.dateInvoice = dateInvoice;
        this.totalInvoice = totalInvoice;
        this.userr = userr;
    }

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
