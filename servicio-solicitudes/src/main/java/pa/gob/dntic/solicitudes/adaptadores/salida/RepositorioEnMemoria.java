package pa.gob.dntic.solicitudes.adaptadores.salida;
import org.springframework.stereotype.Repository;
import pa.gob.dntic.solicitudes.dominio.*;
import java.util.*;
@Repository
public class RepositorioEnMemoria implements RepositorioDeSolicitudes {
    private final Map<String,Solicitud> m = new LinkedHashMap<>();
    public void guardar(Solicitud s){ m.put(s.id(), s);} 
    public Optional<Solicitud> buscar(String id){ return Optional.ofNullable(m.get(id)); }
    public List<Solicitud> todas(){ return new ArrayList<>(m.values()); }
}
