package pa.gob.dntic.notificaciones.adaptadores.entrada;
import org.springframework.web.bind.annotation.*;
import pa.gob.dntic.notificaciones.dominio.ServicioDeNotificaciones;
import pa.gob.dntic.notificaciones.eventos.SolicitudEnviada;
/*
 * ADAPTADOR de entrada de E4: recibe el evento POR REST (POST) desde solicitudes.
 * Es el "otro lado" del PublicadorRest. El dominio no cambia; esto es solo la puerta.
 */
@RestController
public class EventoController {
    private final ServicioDeNotificaciones servicio;
    public EventoController(ServicioDeNotificaciones s){ this.servicio=s; }
    @PostMapping("/eventos/solicitud-enviada")
    public void recibir(@RequestBody SolicitudEnviada evento){ servicio.alRecibirSolicitudEnviada(evento); }
}
