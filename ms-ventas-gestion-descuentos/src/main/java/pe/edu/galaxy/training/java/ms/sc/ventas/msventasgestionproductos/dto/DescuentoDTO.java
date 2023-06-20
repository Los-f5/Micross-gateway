package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class DescuentoDTO implements Serializable{
		  
	private static final long serialVersionUID = -9807309035903996L;
	private Long id;
  	private String descuento_nombre;
  	private Integer descuento;
  	private String estado;

}
