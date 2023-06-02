package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.LocacionDomain;

public interface LocacionBusiness {
	
	void register(LocacionDomain domain);

	List<LocacionDomain> list(LocacionDomain domain);

	void modify(LocacionDomain domain);

	void drop(LocacionDomain domain);

}
