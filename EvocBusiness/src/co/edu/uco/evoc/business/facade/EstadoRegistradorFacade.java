package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.EstadoRegistradorDTO;

public interface EstadoRegistradorFacade {

	void register(EstadoRegistradorDTO dto);

	List<EstadoRegistradorDTO> list(EstadoRegistradorDTO dto);

	void modify(EstadoRegistradorDTO dto);

	void drop(EstadoRegistradorDTO dto);

}