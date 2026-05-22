package cl.duoc.agenda.repository;
import cl.duoc.agenda.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    List <Agenda>findByVendedorId(long vendedorId);
    List <Agenda> findByVehiculoId(long vehiculoId);
    List <Agenda> findByVendedorIdAndVehiculoId(long vendedorId, long vehiculoId);

}
