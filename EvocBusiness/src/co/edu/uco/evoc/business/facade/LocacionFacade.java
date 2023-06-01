package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.LocacionDTO;

public interface LocacionFacade {

	void register(LocacionDTO dto);

	List<LocacionDTO> list(LocacionDTO dto);

	void modify(LocacionDTO dto);

	void drop(LocacionDTO dto);

}
