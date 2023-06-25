package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.entity.DescuentoEntity;



@Repository
public interface DescuentoRepository extends JpaRepository<DescuentoEntity, Long>{

}
