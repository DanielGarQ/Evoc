package co.edu.uco.evoc.business.business;

import java.util.List;

import co.edu.uco.evoc.business.domain.CartonesPorMesaDomain;

public interface CartonesPorMesaBusiness {
	
	void register(CartonesPorMesaDomain domain);

	List<CartonesPorMesaDomain> list(CartonesPorMesaDomain domain);

	void modify(CartonesPorMesaDomain domain);

	void drop(CartonesPorMesaDomain domain);

}
