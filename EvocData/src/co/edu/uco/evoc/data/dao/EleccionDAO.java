package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.EleccionEntity;

public interface EleccionDAO {
	
	void create(EleccionEntity entity);
	
	List<EleccionEntity> read(EleccionEntity entity);
	
	void update(EleccionEntity entity);
	
	void delete(EleccionEntity entity);

}
