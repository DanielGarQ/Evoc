package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.ZonaDTO;

public interface ZonaFacade {

	void register(ZonaDTO dto);

	List<ZonaDTO> list(ZonaDTO dto);

	void modify(ZonaDTO dto);

	void drop(ZonaDTO dto);

}
