package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.EstadoEleccionDTO;

public interface EstadoEleccionFacade {
	
	void register(EstadoEleccionDTO dto);

	List<EstadoEleccionDTO> list(EstadoEleccionDTO dto);

	void modify(EstadoEleccionDTO dto);

	void drop(EstadoEleccionDTO dto);

}
