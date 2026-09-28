package pa.gob.dntic.solicitudes.dominio;
import java.util.*;
public interface RepositorioDeSolicitudes { void guardar(Solicitud s); Optional<Solicitud> buscar(String id); List<Solicitud> todas(); }
