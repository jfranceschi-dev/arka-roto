package pa.gob.dntic.notificaciones.dominio;
import pa.gob.dntic.notificaciones.eventos.SolicitudEnviada;
import java.util.List;
/* Dominio IDÉNTICO al de E2. Reacciona al evento; no sabe que llegó por REST. */
public class ServicioDeNotificaciones {
    private final RepositorioDeNotificaciones repo;
    public ServicioDeNotificaciones(RepositorioDeNotificaciones repo){ this.repo=repo; }
    public void alRecibirSolicitudEnviada(SolicitudEnviada e){ repo.guardar(new Notificacion("Solicitud "+e.id()+" ("+e.tipo()+") enviada")); }
    public List<Notificacion> listar(){ return repo.todas(); }
}
