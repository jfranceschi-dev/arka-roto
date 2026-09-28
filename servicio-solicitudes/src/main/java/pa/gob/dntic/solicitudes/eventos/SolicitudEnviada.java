package pa.gob.dntic.solicitudes.eventos;
// CONTRATO compartido con notificaciones = la forma del JSON, NO el código (cada servicio tiene su copia).
public record SolicitudEnviada(String id, String tipo) {}
