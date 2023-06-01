package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.EstadoMesaVotacionCalculadoDTO;

public interface EstadoMesaVotacionCalculadoFacade {

	void register(EstadoMesaVotacionCalculadoDTO dto);

	List<EstadoMesaVotacionCalculadoDTO> list(EstadoMesaVotacionCalculadoDTO dto);

	void modify(EstadoMesaVotacionCalculadoDTO dto);

	void drop(EstadoMesaVotacionCalculadoDTO dto);

}
