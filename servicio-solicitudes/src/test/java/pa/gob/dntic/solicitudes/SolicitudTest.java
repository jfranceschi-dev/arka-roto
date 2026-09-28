package pa.gob.dntic.solicitudes;
import org.junit.jupiter.api.Test;
import pa.gob.dntic.solicitudes.dominio.*;
import static org.junit.jupiter.api.Assertions.*;
class SolicitudTest {
    @Test void enviar_pasa_a_ENVIADA() {
        Solicitud s = new Solicitud("INC-1","Incidente",Estado.BORRADOR).enviar();
        assertEquals(Estado.ENVIADA, s.estado());
    }
    @Test void doble_envio_falla() {
        Solicitud enviada = new Solicitud("INC-1","Incidente",Estado.BORRADOR).enviar();
        assertThrows(IllegalStateException.class, enviada::enviar);
    }
}
