package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.VotanteRegistradoDTO;

public interface VotanteRegistradoFacade {
	
	void register(VotanteRegistradoDTO dto);

	List<VotanteRegistradoDTO> list(VotanteRegistradoDTO dto);

	void modify(VotanteRegistradoDTO dto);

	void drop(VotanteRegistradoDTO dto);

}
