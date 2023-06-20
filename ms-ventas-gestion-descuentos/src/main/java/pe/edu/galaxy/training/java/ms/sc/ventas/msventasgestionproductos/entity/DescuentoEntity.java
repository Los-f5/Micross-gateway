package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

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
	  	

	  	@Column(name = "ESTADO")
	  	private String estado;

}
