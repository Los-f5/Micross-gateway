package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.json.JsonMapper;

import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.dto.DescuentoDTO;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.entity.DescuentoEntity;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.repository.DescuentoRepository;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.service.exception.ServiceException;

@Service
public class DescuentoServiceImpl implements DescuentoService{
 
	private DescuentoRepository descuentoRepository;
	private JsonMapper jsonMapper;
	
	public DescuentoServiceImpl(	DescuentoRepository descuentoRepository,
								JsonMapper jsonMapper
									) {
		super();
		this.descuentoRepository = descuentoRepository;
		this.jsonMapper=jsonMapper;
	}

	@Override
	public List<DescuentoDTO> findByLike(DescuentoDTO t) throws ServiceException {
		try {
			List<DescuentoEntity> lstDescuentoEntity= descuentoRepository.findAll();
			return lstDescuentoEntity.stream().map(e -> this.getDescuentoDTO(e))
					.collect(Collectors.toList());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		
	}

	@Override
	public Optional<DescuentoDTO> findById(Long id) throws ServiceException {
		Optional<DescuentoEntity> optDescuentoEntity=  descuentoRepository.findById(id);
		if(optDescuentoEntity.isPresent()) {
			return Optional.of(this.getDescuentoDTO(optDescuentoEntity.get()));
		}
		return null;
	}

	// Mappers
	private DescuentoDTO getDescuentoDTO(DescuentoEntity e) {
		return jsonMapper.convertValue(e, DescuentoDTO.class);
	}
	
	private DescuentoEntity getDescuentoEntity(DescuentoDTO d) {
		return jsonMapper.convertValue(d, DescuentoEntity.class);
	}

	@Override
	public DescuentoDTO save(DescuentoDTO t) throws ServiceException {
		return this.getDescuentoDTO(this.descuentoRepository.save(this.getDescuentoEntity(t)));
	}
	
}
