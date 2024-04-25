package pe.edu.upc.helpyou.dtos;

public class SubscriptionIncomeDTO {
    private String estadoSuscripcion;
    private int mes;
    private double ingresosGenerados;

    public String getEstadoSuscripcion() {
        return estadoSuscripcion;
    }

    public void setEstadoSuscripcion(String estadoSuscripcion) {
        this.estadoSuscripcion = estadoSuscripcion;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getIngresosGenerados() {
        return ingresosGenerados;
    }

    public void setIngresosGenerados(double ingresosGenerados) {
        this.ingresosGenerados = ingresosGenerados;
    }
}
