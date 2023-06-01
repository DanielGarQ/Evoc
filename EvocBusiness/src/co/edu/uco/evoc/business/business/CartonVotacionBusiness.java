package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.CartonVotacionDomain;

public interface CartonVotacionBusiness {

	void register(CartonVotacionDomain domain);

	List<CartonVotacionDomain> list(CartonVotacionDomain domain);

	void modify(CartonVotacionDomain domain);

	void drop(CartonVotacionDomain domain);

}
