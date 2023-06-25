package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.rest;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Response {

	private Message message;
	
	//@JsonIgnore
	private Object data;
	
	
}
