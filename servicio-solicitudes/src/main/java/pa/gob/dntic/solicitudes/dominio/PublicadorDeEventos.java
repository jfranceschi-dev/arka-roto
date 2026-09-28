package pa.gob.dntic.solicitudes.dominio;
import pa.gob.dntic.solicitudes.eventos.SolicitudEnviada;
// PUERTO de salida: publicar el evento. El adaptador decide POR DÓNDE (en E4: REST).
public interface PublicadorDeEventos { void publicar(SolicitudEnviada evento); }
