package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.dto.ReservaDTO;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.entity.ReservaEntity;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.service.ReservaService;

import java.util.List;

import static pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.commons.GlobalConstants.*;

@Slf4j
@RestController
@RequestMapping(API_RESERVA)
public class ReservaREST {

    private final ReservaService reservaService;

    public ReservaREST(ReservaService reservaService) {
        super();
        this.reservaService = reservaService;
    }

    @GetMapping
    public ResponseEntity<Response> findByLike() {
        try {
            List<ReservaDTO> lstReservaDTO = this.reservaService.findByLike(null);
            if (lstReservaDTO.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(
                    Response
                            .builder()
                            .message(Message.builder().code(COD_MSG_EXITO).message(MSG_CONSULTA_EXITO).build())
                            .data(lstReservaDTO)
                            .build());


        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<Response> save(@RequestBody ReservaDTO reservaDTO) {
        try {
            ReservaDTO rReservaDTO = this.reservaService.save(reservaDTO);

            if (rReservaDTO == null) {
                return ResponseEntity.badRequest().build();
            }

            return ResponseEntity.ok(
                    Response
                            .builder()
                            .message(Message.builder().code(COD_MSG_EXITO).message(MSG_CONSULTA_EXITO).build())
                            .data(rReservaDTO)
                            .build());


        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.badRequest().build();
        }
    }

}
