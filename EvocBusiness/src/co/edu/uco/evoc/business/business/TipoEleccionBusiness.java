package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.TipoEleccionDomain;

public interface TipoEleccionBusiness {

	void register(TipoEleccionDomain domain);

	List<TipoEleccionDomain> list(TipoEleccionDomain domain);

	void modify(TipoEleccionDomain domain);

	void drop(TipoEleccionDomain domain);

}
