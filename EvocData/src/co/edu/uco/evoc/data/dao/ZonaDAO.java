package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.ZonaEntity;

public interface ZonaDAO {
	
	void create(ZonaEntity entity);
	
	List<ZonaEntity> read(ZonaEntity entity);
	
	void update(ZonaEntity entity);
	
	void delete(ZonaEntity entity);

}
