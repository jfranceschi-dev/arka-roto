package pa.gob.dntic.notificaciones.adaptadores.salida;
import org.springframework.context.annotation.*;
import pa.gob.dntic.notificaciones.dominio.*;
@Configuration
public class ConfiguracionNotificaciones {
    @Bean ServicioDeNotificaciones servicio(RepositorioDeNotificaciones r){ return new ServicioDeNotificaciones(r); }
}
