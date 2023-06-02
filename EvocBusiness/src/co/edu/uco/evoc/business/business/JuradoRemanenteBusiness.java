package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.JuradoRemanenteDomain;

public interface JuradoRemanenteBusiness {
	
	void register(JuradoRemanenteDomain domain);

	List<JuradoRemanenteDomain> list(JuradoRemanenteDomain domain);

	void modify(JuradoRemanenteDomain domain);

	void drop(JuradoRemanenteDomain domain);

}
