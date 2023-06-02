package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.PersonaDomain;

public interface PersonaBusiness {
	
	void register(PersonaDomain domain);
	
	List<PersonaDomain> list(PersonaDomain domain);
	
	void modify(PersonaDomain domain);
	
	void drop(PersonaDomain domain);

}
