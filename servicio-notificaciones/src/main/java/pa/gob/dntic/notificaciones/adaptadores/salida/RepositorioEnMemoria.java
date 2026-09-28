package pa.gob.dntic.notificaciones.adaptadores.salida;
import org.springframework.stereotype.Repository;
import pa.gob.dntic.notificaciones.dominio.*;
import java.util.*;
@Repository
public class RepositorioEnMemoria implements RepositorioDeNotificaciones {
    private final List<Notificacion> l = new ArrayList<>();
    public void guardar(Notificacion n){ l.add(n);} public List<Notificacion> todas(){ return List.copyOf(l);} }
