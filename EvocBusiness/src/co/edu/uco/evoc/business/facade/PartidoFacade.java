package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.PartidoDTO;

public interface PartidoFacade {

	void register(PartidoDTO dto);

	List<PartidoDTO> list(PartidoDTO dto);

	void modify(PartidoDTO dto);

	void drop(PartidoDTO dto);

}
