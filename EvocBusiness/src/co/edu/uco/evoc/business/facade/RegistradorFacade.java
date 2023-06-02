package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.RegistradorDTO;

public interface RegistradorFacade {
	
	void register(RegistradorDTO dto);

	List<RegistradorDTO> list(RegistradorDTO dto);

	void modify(RegistradorDTO dto);

	void drop(RegistradorDTO dto);

}
