package pa.gob.dntic.solicitudes.adaptadores.entrada;
import org.springframework.web.bind.annotation.*;
import pa.gob.dntic.solicitudes.dominio.*;
import java.util.List;
@RestController
public class SolicitudController {
    private final ServicioDeSolicitudes servicio;
    public SolicitudController(ServicioDeSolicitudes s){ this.servicio=s; }
    @GetMapping("/solicitudes") public List<Solicitud> todas(){ return servicio.listar(); }
    @PostMapping("/solicitudes/{id}/enviar") public Solicitud enviar(@PathVariable String id){ return servicio.enviar(id); }
}
