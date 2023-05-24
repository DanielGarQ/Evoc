package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.PartidoEntity;

public interface PartidoDAO {
	
	void create(PartidoEntity entity);
	
	List<PartidoEntity> read(PartidoEntity entity);
	
	void update(PartidoEntity entity);
	
	void delete(PartidoEntity entity);

}
