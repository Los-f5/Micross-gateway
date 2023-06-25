package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.stereotype.Service;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.dto.ReservaDTO;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.entity.ReservaEntity;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.repository.ReservaRepository;
import pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestionproductos.service.exception.ServiceException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository reservaRepository;
    private final JsonMapper jsonMapper;

    public ReservaServiceImpl(ReservaRepository reservaRepository, JsonMapper jsonMapper) {
        super();
        this.reservaRepository = reservaRepository;
        this.jsonMapper = jsonMapper;


    }

    @Override
    public List<ReservaDTO> findByLike(ReservaDTO reservaDTO) throws ServiceException {
        try {
            List<ReservaEntity> lstReservaEntity = reservaRepository.findAll();
            return lstReservaEntity.stream().map(e -> this.getreservaDTO(e))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    private ReservaDTO getreservaDTO(ReservaEntity e) {
        return jsonMapper.convertValue(e, ReservaDTO.class);
    }

    private ReservaEntity getreservaEntity(ReservaDTO d) {
        return jsonMapper.convertValue(d, ReservaEntity.class);
    }

    @Override
    public Optional<ReservaDTO> findById(Long id) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public ReservaDTO save(ReservaDTO reservaDTO) throws ServiceException {
        return this.getreservaDTO(reservaRepository.save(this.getreservaEntity(reservaDTO)));
    }
}
