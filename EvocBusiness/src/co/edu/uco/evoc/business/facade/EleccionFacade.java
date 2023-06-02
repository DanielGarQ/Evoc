package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.EleccionDTO;

public interface EleccionFacade {
	
	void register(EleccionDTO dto);

	List<EleccionDTO> list(EleccionDTO dto);

	void modify(EleccionDTO dto);

	void drop(EleccionDTO dto);

}
