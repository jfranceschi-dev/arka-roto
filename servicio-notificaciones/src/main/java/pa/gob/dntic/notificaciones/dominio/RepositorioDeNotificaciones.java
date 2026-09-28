package pa.gob.dntic.notificaciones.dominio;
import java.util.List;
public interface RepositorioDeNotificaciones { void guardar(Notificacion n); List<Notificacion> todas(); }
