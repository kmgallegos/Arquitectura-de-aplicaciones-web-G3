package pe.edu.upc.helpyou.entities;

import  jakarta.persistence.*;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;

@Entity
@Table(name = "ServiceDeveloper")

public class ServiceDeveloper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServiceDeveloper;
    @ManyToOne
    @JoinColumn(name = "Service_id")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "Developer_id")
    private Developer developer;
    public ServiceDeveloper() {}
    public ServiceDeveloper(Service service, Developer developer) {
        this.service = service;
        this.developer = developer;

    }
    public int getIdServiceDeveloper() {
        return idServiceDeveloper;
    }
    public void setIdServiceDeveloper(int idServiceDeveloper) {
        this.idServiceDeveloper = idServiceDeveloper;
    }
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    public Developer getDeveloper() {
        return developer;
    }
    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
