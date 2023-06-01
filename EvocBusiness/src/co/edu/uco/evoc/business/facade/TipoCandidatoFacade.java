package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.TipoCandidatoDTO;

public interface TipoCandidatoFacade {

	void register(TipoCandidatoDTO dto);

	List<TipoCandidatoDTO> list(TipoCandidatoDTO dto);

	void modify(TipoCandidatoDTO dto);

	void drop(TipoCandidatoDTO dto);

}
