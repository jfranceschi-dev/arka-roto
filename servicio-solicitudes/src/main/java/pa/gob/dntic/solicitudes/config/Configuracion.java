package pa.gob.dntic.solicitudes.config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;
import pa.gob.dntic.solicitudes.dominio.*;
@Configuration
public class Configuracion {
    @Bean ServicioDeSolicitudes servicio(RepositorioDeSolicitudes r, PublicadorDeEventos p){ return new ServicioDeSolicitudes(r,p); }
    @Bean CommandLineRunner seed(ServicioDeSolicitudes s){
        return a -> { s.registrar("INC-001","Incidente"); s.registrar("CAM-002","Cambio"); s.enviar("CAM-002"); };
    }
}
