package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.TipoRegistradorDomain;

public interface TipoRegistradorBusiness {
	
	void register(TipoRegistradorDomain domain);

	List<TipoRegistradorDomain> list(TipoRegistradorDomain domain);

	void modify(TipoRegistradorDomain domain);

	void drop(TipoRegistradorDomain domain);

}
