package cl.duoc.agenda.service;
import cl.duoc.agenda.dto.AgendaResponseDto;
import cl.duoc.agenda.model.Agenda;
import java.util.List;

public interface AgendaService {

    List <AgendaResponseDto> findAll();
    Agenda findById(Long id);
    List <AgendaResponseDto> findByVendedorId(long vendedorId);
    List <AgendaResponseDto> findByVehiculoId(long vehiculoId);
    List <AgendaResponseDto> findByVendedorIdAndVehiculoId(long vendedorId, long vehiculoId);
}
