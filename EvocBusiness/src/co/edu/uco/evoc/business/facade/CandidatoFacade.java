package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.CandidatoDTO;

public interface CandidatoFacade {
	
	void register(CandidatoDTO dto);

	List<CandidatoDTO> list(CandidatoDTO dto);

	void modify(CandidatoDTO dto);

	void drop(CandidatoDTO dto);

}
