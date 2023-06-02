package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.EstadoEleccionDomain;

public interface EstadoEleccionBusiness {
	
	void register(EstadoEleccionDomain domain);

	List<EstadoEleccionDomain> list(EstadoEleccionDomain domain);

	void modify(EstadoEleccionDomain domain);

	void drop(EstadoEleccionDomain domain);

}
