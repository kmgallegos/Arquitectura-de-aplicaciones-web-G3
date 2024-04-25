package pe.edu.upc.helpyou.servicesinterfaces;

import pe.edu.upc.helpyou.entities.Notification;

import java.util.List;

public interface INotificationService {
    public void insert(Notification notification);
    public List<Notification> list();
}
