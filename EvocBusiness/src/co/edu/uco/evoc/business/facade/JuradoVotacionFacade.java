package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.JuradoVotacionDTO;

public interface JuradoVotacionFacade {
	
	void register(JuradoVotacionDTO dto);

	List<JuradoVotacionDTO> list(JuradoVotacionDTO dto);

	void modify(JuradoVotacionDTO dto);

	void drop(JuradoVotacionDTO dto);

}
