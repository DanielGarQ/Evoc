package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.TipoEleccionDTO;

public interface TipoEleccionFacade {
	
	void register(TipoEleccionDTO dto);

	List<TipoEleccionDTO> list(TipoEleccionDTO dto);

	void modify(TipoEleccionDTO dto);

	void drop(TipoEleccionDTO dto);

}
