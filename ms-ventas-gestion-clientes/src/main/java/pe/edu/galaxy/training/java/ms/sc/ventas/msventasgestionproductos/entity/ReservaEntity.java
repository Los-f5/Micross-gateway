package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Getter
@Setter
@Entity
@Table(name = "reserva")
public class ReservaEntity implements Serializable {
    private static final long serialVersionUID = -2170897015344177815L;
    @Id
    @Column(name = "ID_RESERVA", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_RESERVA")
    private String codigoReserva;

    @Column(name = "FECHA_RESERVA", columnDefinition = "DATE")
    private String fechaReserva;

    @Column(name = "FECHA_VUELO", columnDefinition = "DATE")
    private String fecha_vuelo;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private ClienteEntity clienteEntity;

    @Column(name = "ESTADO", columnDefinition = "DATE")
    private String estado;


}
