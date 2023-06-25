package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.service.service;

import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.service.exception.ServiceException;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.service.exception.ServiceException;

import java.util.List;
import java.util.Optional;

public interface GenericeService<T> {
	
	List<T> findByLike(T t) throws ServiceException;
	
	Optional<T> findById(Long id)throws ServiceException, ServiceException;
	
	T save(T t) throws ServiceException;

}
