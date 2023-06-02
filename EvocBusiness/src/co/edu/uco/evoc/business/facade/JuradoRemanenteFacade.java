package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.JuradoRemanenteDTO;

public interface JuradoRemanenteFacade {
	
	void register(JuradoRemanenteDTO dto);

	List<JuradoRemanenteDTO> list(JuradoRemanenteDTO dto);

	void modify(JuradoRemanenteDTO dto);

	void drop(JuradoRemanenteDTO dto);

}
