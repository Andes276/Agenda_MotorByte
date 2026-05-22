package cl.duoc.agenda.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;   



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AgendaResponseDto {
    private Long id;
    private long vendedorId;
    private long vehiculoId;
}
