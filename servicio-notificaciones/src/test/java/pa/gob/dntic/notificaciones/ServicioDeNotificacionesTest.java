package pa.gob.dntic.notificaciones;
import org.junit.jupiter.api.Test;
import pa.gob.dntic.notificaciones.dominio.*;
import pa.gob.dntic.notificaciones.eventos.SolicitudEnviada;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
class ServicioDeNotificacionesTest {
    @Test void crea_notificacion_al_recibir_evento() {
        var repo = new RepositorioDeNotificaciones() {
            final List<Notificacion> l = new ArrayList<>();
            public void guardar(Notificacion n){ l.add(n);} public List<Notificacion> todas(){ return l; }
        };
        new ServicioDeNotificaciones(repo).alRecibirSolicitudEnviada(new SolicitudEnviada("INC-1","Incidente"));
        assertEquals(1, repo.todas().size());
    }
}
