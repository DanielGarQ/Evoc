package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.PersonaDTO;

public interface PersonaFacade {
	
	void register(PersonaDTO dto);

	List<PersonaDTO> list(PersonaDTO dto);

	void modify(PersonaDTO dto);

	void drop(PersonaDTO dto);

}
