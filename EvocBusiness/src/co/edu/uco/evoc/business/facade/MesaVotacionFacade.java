package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.MesaVotacionDTO;

public interface MesaVotacionFacade {

	void register(MesaVotacionDTO dto);

	List<MesaVotacionDTO> list(MesaVotacionDTO dto);

	void modify(MesaVotacionDTO dto);

	void drop(MesaVotacionDTO dto);

}

