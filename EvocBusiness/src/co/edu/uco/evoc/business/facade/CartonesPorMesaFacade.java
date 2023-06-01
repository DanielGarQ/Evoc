package co.edu.uco.evoc.business.facade;

import java.util.List;

import co.edu.uco.evoc.dto.CartonesPorMesaDTO;

public interface CartonesPorMesaFacade {

	void register(CartonesPorMesaDTO dto);

	List<CartonesPorMesaDTO> list(CartonesPorMesaDTO dto);

	void modify(CartonesPorMesaDTO dto);

	void drop(CartonesPorMesaDTO dto);

}
