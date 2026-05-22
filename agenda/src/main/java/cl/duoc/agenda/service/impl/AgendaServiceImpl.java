package cl.duoc.agenda.service.impl;
import cl.duoc.agenda.dto.AgendaResponseDto;
import cl.duoc.agenda.model.Agenda;
import cl.duoc.agenda.repository.AgendaRepository;
import cl.duoc.agenda.service.AgendaService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendaServiceImpl implements AgendaService {
    private final AgendaRepository repository;

    AgendaResponseDto toDto(Agenda entity) {
        return new AgendaResponseDto(entity.getId(), entity.getVendedorId(), entity.getVehiculoId());
    }

    Agenda toEntity(AgendaResponseDto dto) {
        return new Agenda(dto.getId(), dto.getVendedorId(), dto.getVehiculoId());
    }


    public AgendaServiceImpl(AgendaRepository Repository) {
        this.repository = Repository;
    }

    @Override
    public List<AgendaResponseDto> findAll() {  
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public Agenda findById(Long id) {   
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<AgendaResponseDto> findByVendedorId(long vendedorId) {
        return repository.findByVendedorId(vendedorId).stream().map(this::toDto).toList();
    }

    @Override
    public List<AgendaResponseDto> findByVehiculoId(long vehiculoId) {
        return repository.findByVehiculoId(vehiculoId).stream().map(this::toDto).toList();
    }

    @Override
    public List<AgendaResponseDto> findByVendedorIdAndVehiculoId(long vendedorId, long vehiculoId) {
        return repository.findByVendedorIdAndVehiculoId(vendedorId, vehiculoId).stream().map(this::toDto).toList();
    }

}
