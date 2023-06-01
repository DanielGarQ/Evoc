package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.TipoCandidatoDomain;

public interface TipoCandidatoBusiness {

	void register(TipoCandidatoDomain domain);

	List<TipoCandidatoDomain> list(TipoCandidatoDomain domain);

	void modify(TipoCandidatoDomain domain);

	void drop(TipoCandidatoDomain domain);

}