package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.PartidoDomain;

public interface PartidoBusiness {
	
	void register(PartidoDomain domain);

	List<PartidoDomain> list(PartidoDomain domain);

	void modify(PartidoDomain domain);

	void drop(PartidoDomain domain);

}
