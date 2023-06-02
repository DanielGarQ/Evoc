package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.RegistraduriaDTO;

public interface RegistraduriaFacade {
	
	void register(RegistraduriaDTO dto);

	List<RegistraduriaDTO> list(RegistraduriaDTO dto);

	void modify(RegistraduriaDTO dto);

	void drop(RegistraduriaDTO dto);

}
