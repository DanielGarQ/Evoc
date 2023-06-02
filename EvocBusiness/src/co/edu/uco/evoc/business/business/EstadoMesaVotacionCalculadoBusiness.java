package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.EstadoMesaVotacionCalculadoDomain;

public interface EstadoMesaVotacionCalculadoBusiness {
	
	void register(EstadoMesaVotacionCalculadoDomain domain);

	List<EstadoMesaVotacionCalculadoDomain> list(EstadoMesaVotacionCalculadoDomain domain);

	void modify(EstadoMesaVotacionCalculadoDomain domain);

	void drop(EstadoMesaVotacionCalculadoDomain domain);

}
