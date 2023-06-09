package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.TipoIdentificacionDTO;

public interface TipoIdentificacionFacade {
	
	void register(TipoIdentificacionDTO dto);

	List<TipoIdentificacionDTO> list(TipoIdentificacionDTO dto);

	void modify(TipoIdentificacionDTO dto);

	void drop(TipoIdentificacionDTO dto);

}
