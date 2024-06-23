package pe.edu.upc.helpyou.dtos;

public class NotificationsPerUserDTO {

    private boolean status;

    private int cantidad ;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
