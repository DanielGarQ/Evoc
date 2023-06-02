package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.JuradoVotacionDomain;

public interface JuradoVotacionBusiness {
	
	void register(JuradoVotacionDomain domain);

	List<JuradoVotacionDomain> list(JuradoVotacionDomain domain);

	void modify(JuradoVotacionDomain domain);

	void drop(JuradoVotacionDomain domain);

}
