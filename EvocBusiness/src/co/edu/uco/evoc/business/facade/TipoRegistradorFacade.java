package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.TipoRegistradorDTO;

public interface TipoRegistradorFacade {

	void register(TipoRegistradorDTO dto);

	List<TipoRegistradorDTO> list(TipoRegistradorDTO dto);

	void modify(TipoRegistradorDTO dto);

	void drop(TipoRegistradorDTO dto);

}
