package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.NotificationDTO;
<<<<<<< HEAD
import pe.edu.upc.helpyou.dtos.NotificationsPerUserDTO;
import pe.edu.upc.helpyou.entities.Notification;
import pe.edu.upc.helpyou.servicesinterfaces.INotificationService;

import java.util.ArrayList;
=======
import pe.edu.upc.helpyou.entities.Notification;
import pe.edu.upc.helpyou.servicesinterfaces.INotificationService;

>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private INotificationService nS;

    @PostMapping
    public void registrar(@RequestBody NotificationDTO n)
    {
        ModelMapper m= new ModelMapper();
        Notification det =m.map(n, Notification.class);
        nS.insert(det);
    }

<<<<<<< HEAD
    @GetMapping("/Notificacion-por-usuario")
    public List<NotificationsPerUserDTO> NotificationsPerUser() {
        List<String[]> filalista = nS.NotificationsPerUser();
        List<NotificationsPerUserDTO> dtolista = new ArrayList<>();

        for (String[] columna : filalista) {
            NotificationsPerUserDTO dto = new NotificationsPerUserDTO();
            dto.setStatus(Boolean.parseBoolean(columna[0]));
            dto.setCantidad(Integer.parseInt(columna[1]));
            dtolista.add(dto);
        }
        return dtolista;
    }

=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
    @GetMapping
    public List<NotificationDTO> list(){

        return nS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,NotificationDTO.class);
        }).collect(Collectors.toList());
    }
<<<<<<< HEAD
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        nS.delete(id);
    }


=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
}
