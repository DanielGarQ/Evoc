package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.MesaVotacionDomain;

public interface MesaVotacionBusiness {
	
	void register(MesaVotacionDomain domain);

	List<MesaVotacionDomain> list(MesaVotacionDomain domain);

	void modify(MesaVotacionDomain domain);

	void drop(MesaVotacionDomain domain);

}
