package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.NivelTipoEleccionDomain;

public interface NivelTipoEleccionBusiness {

	void register(NivelTipoEleccionDomain domain);

	List<NivelTipoEleccionDomain> list(NivelTipoEleccionDomain domain);

	void modify(NivelTipoEleccionDomain domain);

	void drop(NivelTipoEleccionDomain domain);

}