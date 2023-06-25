package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class ClienteDTO implements Serializable {
    private static final long serialVersionUID = -9807309035903996L;
    private Long id;
    private String nombre;
    private String apellido_materno;
    private String apellido_paterno;
    private String fechaNacimiento;
    private String fechaReserva;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String correo;
    private String estado;
}
