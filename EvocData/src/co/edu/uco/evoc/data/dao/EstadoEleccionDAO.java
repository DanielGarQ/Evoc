package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.EstadoEleccionEntity;

public interface EstadoEleccionDAO {
	
	void create(EstadoEleccionEntity entity);
	
	List<EstadoEleccionEntity> read(EstadoEleccionEntity entity);
	
	void update(EstadoEleccionEntity entity);
	
	void delete(EstadoEleccionEntity entity);

}
