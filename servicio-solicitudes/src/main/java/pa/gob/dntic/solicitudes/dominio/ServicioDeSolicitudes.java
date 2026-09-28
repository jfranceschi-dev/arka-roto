package pa.gob.dntic.solicitudes.dominio;
import pa.gob.dntic.solicitudes.eventos.SolicitudEnviada;
import java.util.List;
/* Dominio IDÉNTICO al de E2. No sabe que ahora el evento viaja por REST. */
public class ServicioDeSolicitudes {
    private final RepositorioDeSolicitudes repo;
    private final PublicadorDeEventos publicador;
    public ServicioDeSolicitudes(RepositorioDeSolicitudes repo, PublicadorDeEventos publicador) {
        this.repo = repo; this.publicador = publicador;
    }
    public Solicitud registrar(String id, String tipo) { Solicitud s=new Solicitud(id,tipo,Estado.BORRADOR); repo.guardar(s); return s; }
    public Solicitud enviar(String id) {
        Solicitud e = repo.buscar(id).orElseThrow().enviar();
        repo.guardar(e);
        publicador.publicar(new SolicitudEnviada(e.id(), e.tipo()));   // misma línea que en E2
        return e;
    }
    public List<Solicitud> listar() { return repo.todas(); }
}
