package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DescuentoDTO implements Serializable{
		  
	private static final long serialVersionUID = -9807309035903996L;
	private Long id;
  	private String descuento_nombre;
  	private Integer descuento;
	private String fecha_inicio;
	private String fecha_final;
  	private String estado;

}
