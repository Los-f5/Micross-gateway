package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.dto.DescuentoDTO;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.service.DescuentoService;

import java.util.List;
import java.util.Optional;

import static pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.commons.GlobalConstants.*;

@Slf4j
@RestController
@RequestMapping(API_DESCUENTO)
public class DescuentoREST {

	private DescuentoService descuentoService;

	public DescuentoREST(DescuentoService descuentoService) {
		super();
		this.descuentoService = descuentoService;
	}

	@GetMapping
	public ResponseEntity<Response>  findByLike(){
		try {
			List<DescuentoDTO> lstDescuentoDTO= this.descuentoService.findByLike(null);
			if (lstDescuentoDTO.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(
					Response
					.builder()
					.message(Message.builder().code(COD_MSG_EXITO).message(MSG_CONSULTA_EXITO).build())
					.data(lstDescuentoDTO)
					.build());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response>  findById(@PathVariable Long id){
		try {
			Optional<DescuentoDTO> optClienteDTO= this.descuentoService.findById(id);
			if (optClienteDTO.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(
					Response
					.builder()
					.message(Message.builder().code(COD_MSG_EXITO).message(MSG_CONSULTA_EXITO).build())
					.data(optClienteDTO.get())
					.build());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	}

	
	@PostMapping
	public ResponseEntity<Response>  save(@RequestBody DescuentoDTO descuentoDTO){
		try {
			DescuentoDTO rDescuentoDTO=  this.descuentoService.save(descuentoDTO);
			 
			if (rDescuentoDTO==null) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(
					Response
					.builder()
					.message(Message.builder().code(COD_MSG_EXITO).message(MSG_CONSULTA_EXITO).build())
					.data(rDescuentoDTO)
					.build());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	}


}
