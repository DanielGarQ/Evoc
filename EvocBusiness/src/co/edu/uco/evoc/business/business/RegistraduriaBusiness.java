package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.RegistraduriaDomain;

public interface RegistraduriaBusiness {
	
	void register(RegistraduriaDomain domain);

	List<RegistraduriaDomain> list(RegistraduriaDomain domain);

	void modify(RegistraduriaDomain domain);

	void drop(RegistraduriaDomain domain);

}
