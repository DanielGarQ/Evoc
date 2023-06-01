package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.VotanteRegistradoDomain;

public interface VotanteRegistradoBusiness {

	void register(VotanteRegistradoDomain domain);

	List<VotanteRegistradoDomain> list(VotanteRegistradoDomain domain);

	void modify(VotanteRegistradoDomain domain);

	void drop(VotanteRegistradoDomain domain);

}