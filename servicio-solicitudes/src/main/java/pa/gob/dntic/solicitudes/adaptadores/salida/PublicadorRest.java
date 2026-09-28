package pa.gob.dntic.solicitudes.adaptadores.salida;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import pa.gob.dntic.solicitudes.dominio.PublicadorDeEventos;
import pa.gob.dntic.solicitudes.eventos.SolicitudEnviada;
/*
 * ADAPTADOR de transporte de E4: publica el evento por REST a notificaciones.
 * La URL viene de config (env). Si notificaciones no responde, NO tumba el envío (resiliencia).
 */
@Component
public class PublicadorRest implements PublicadorDeEventos {
    private final RestClient rest = RestClient.create();
    private final String url;
    public PublicadorRest(@Value("${notificaciones.url}") String url) { this.url = url; }
    public void publicar(SolicitudEnviada evento) {
        try {
            rest.post().uri(url).body(evento).retrieve().toBodilessEntity();
        } catch (RuntimeException ex) {
            System.err.println("no se pudo notificar (se sigue igual): " + ex.getMessage());
        }
    }
}
