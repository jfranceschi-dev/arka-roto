package pa.gob.dntic.solicitudes.dominio;
public record Solicitud(String id, String tipo, Estado estado) {
    public Solicitud enviar() {
        if (estado != Estado.BORRADOR) throw new IllegalStateException("solo desde BORRADOR");
        return new Solicitud(id, tipo, Estado.ENVIADA);
    }
}
