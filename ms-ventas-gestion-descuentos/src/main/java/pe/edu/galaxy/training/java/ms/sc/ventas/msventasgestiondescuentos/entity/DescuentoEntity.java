package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.entity;

import lombok.Data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "descuentos")
public class DescuentoEntity implements Serializable{
		  
	private static final long serialVersionUID = -2170897015344177815L;

		@Id
	  	@Column(name = "ID_DESCUENTOS")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	  
	  	@NotNull(message = "Nombre del descuento es requerido")
	  	@Column(name = "DESCUENTO_NOMBRE")
	  	private String descuento_nombre;

	  	@Column(name = "DESCUENTO")
	  	private Integer descuento;

	@Column(name = "FECHA_INICIO")
	private String fecha_inicio;
	@Column(name = "FECHA_FINAL")
	private String fecha_final;


	  	@Column(name = "ESTADO")
	  	private String estado;

}
