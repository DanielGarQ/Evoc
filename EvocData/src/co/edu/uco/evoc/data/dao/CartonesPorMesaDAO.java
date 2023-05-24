package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.CartonesPorMesaEntity;

public interface CartonesPorMesaDAO {
	
	void create(CartonesPorMesaEntity entity);
	
	List<CartonesPorMesaEntity> read(CartonesPorMesaEntity entity);
	
	void update(CartonesPorMesaEntity entity);
	
	void delete(CartonesPorMesaEntity entity);

}
