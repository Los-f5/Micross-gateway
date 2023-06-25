package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name = "cliente")
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = -2170897015344177815L;

    @Id
    @Column(name = "ID_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Nombre del Cliente es requerido")
    @Size(min = 5, max = 120, message = "El nombre.....")
    @Column(name = "NOMBRE")
    private String nombre;

    @NotNull(message = "Apellido Paterno del Cliente es requerido")
    @Size(min = 5, max = 120, message = "El apellido paterno.....")
    @Column(name = "APELLIDO_MATERNO")
    private String apellido_materno;

    @NotNull(message = "Apellido Materno del Cliente es requerido")
    @Size(min = 5, max = 120, message = "El apellido materno.....")
    @Column(name = "APELLIDO_PATERNO")
    private String apellido_paterno;

    @Column(name = "FECHA_NACIMIENTO", columnDefinition = "DATE")
    private String fechaNacimiento;

//		@NotNull(message = "Fecha de Reserva del Cliente es requerido")
//		@Column(name = "FECHA_RESERVA", columnDefinition = "DATETIME")
//        private String fechaReserva;

    @NotNull(message = "DNI del cliente es requerido")
    @Size(min = 8, max = 12, message = "El dni.....")
    @Column(name = "IDENTIFICACION")
    private String identificacion;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "CORREO")
    private String correo;


    @Column(name = "ESTADO")
    private String estado;

}
