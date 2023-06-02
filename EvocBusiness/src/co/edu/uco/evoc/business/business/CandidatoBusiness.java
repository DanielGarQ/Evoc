package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.CandidatoDomain;

public interface CandidatoBusiness {
	
	void register(CandidatoDomain domain);

	List<CandidatoDomain> list(CandidatoDomain domain);

	void modify(CandidatoDomain domain);

	void drop(CandidatoDomain domain);

}
