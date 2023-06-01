package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.CartonVotacionDTO;

public interface CartonVotacionFacade {

	void register(CartonVotacionDTO dto);

	List<CartonVotacionDTO> list(CartonVotacionDTO dto);

	void modify(CartonVotacionDTO dto);

	void drop(CartonVotacionDTO dto);

}
