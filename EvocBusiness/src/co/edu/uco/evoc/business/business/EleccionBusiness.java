package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.EleccionDomain;

public interface EleccionBusiness {

	void register(EleccionDomain domain);

	List<EleccionDomain> list(EleccionDomain domain);

	void modify(EleccionDomain domain);

	void drop(EleccionDomain domain);

}
