package cl.duoc.agenda.controller;

import cl.duoc.agenda.dto.AgendaResponseDto;
import cl.duoc.agenda.service.AgendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agendas")
@RequiredArgsConstructor
public class AgendaController {

    private final AgendaService service;

    @GetMapping
    public ResponseEntity<List<AgendaResponseDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/vendedor/{vendedorId}")
    public ResponseEntity<List<AgendaResponseDto>> findByVendedorId(@PathVariable long vendedorId) {
        return ResponseEntity.ok(service.findByVendedorId(vendedorId));
    }

    @GetMapping("/vehiculo/{vehiculoId}")
    public ResponseEntity<List<AgendaResponseDto>> findByVehiculoId(@PathVariable long vehiculoId) {
        return ResponseEntity.ok(service.findByVehiculoId(vehiculoId));
    }

    @GetMapping("/vendedor/{vendedorId}/vehiculo/{vehiculoId}")
    public ResponseEntity<List<AgendaResponseDto>> findByVendedorIdAndVehiculoId(
            @PathVariable long vendedorId,
            @PathVariable long vehiculoId) {
        return ResponseEntity.ok(service.findByVendedorIdAndVehiculoId(vendedorId, vehiculoId));
    }
}