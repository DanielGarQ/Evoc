package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.ZonaDomain;

public interface ZonaBusiness {

	void register(ZonaDomain domain);

	List<ZonaDomain> list(ZonaDomain domain);

	void modify(ZonaDomain domain);

	void drop(ZonaDomain domain);

}
