package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.TipoIdentificacionDomain;

public interface TipoIdentificacionBusiness {
	
	void register(TipoIdentificacionDomain domain);

	List<TipoIdentificacionDomain> list(TipoIdentificacionDomain domain);

	void modify(TipoIdentificacionDomain domain);

	void drop(TipoIdentificacionDomain domain);

}
