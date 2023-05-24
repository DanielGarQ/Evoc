package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.TipoEleccionEntity;

public interface TipoEleccionDAO {
	
	void create(TipoEleccionEntity entity);
	
	List<TipoEleccionEntity> read(TipoEleccionEntity entity);
	
	void update(TipoEleccionEntity entity);
	
	void delete(TipoEleccionEntity entity);

}
