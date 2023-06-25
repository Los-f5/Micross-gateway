package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.entity.ReservaEntity}
 */
@Data
public class ReservaDTO implements Serializable {
    private static final long serialVersionUID = -9807309035903996L;
    private Long id;
    private String codigoReserva;
    private String fechaReserva;
    private String fecha_vuelo;
    private int id_cliente;
   private String Estado;

}
