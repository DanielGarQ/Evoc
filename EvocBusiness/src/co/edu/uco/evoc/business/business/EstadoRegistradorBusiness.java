package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.EstadoRegistradorDomain;

public interface EstadoRegistradorBusiness {

	void register(EstadoRegistradorDomain domain);

	List<EstadoRegistradorDomain> list(EstadoRegistradorDomain domain);

	void modify(EstadoRegistradorDomain domain);

	void drop(EstadoRegistradorDomain domain);

}
