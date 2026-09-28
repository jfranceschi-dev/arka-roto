package pa.gob.dntic.notificaciones.adaptadores.entrada;
import org.springframework.web.bind.annotation.*;
import pa.gob.dntic.notificaciones.dominio.*;
import java.util.List;
@RestController
public class NotificacionController {
    private final ServicioDeNotificaciones servicio;
    public NotificacionController(ServicioDeNotificaciones s){ this.servicio=s; }
    @GetMapping("/notificaciones") public List<Notificacion> todas(){ return servicio.listar(); }
}
