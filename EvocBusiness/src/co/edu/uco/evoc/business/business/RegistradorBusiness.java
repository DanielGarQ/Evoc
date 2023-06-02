package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.RegistradorDomain;

public interface RegistradorBusiness {
	
	void register(RegistradorDomain domain);

	List<RegistradorDomain> list(RegistradorDomain domain);

	void modify(RegistradorDomain domain);

	void drop(RegistradorDomain domain);

}
