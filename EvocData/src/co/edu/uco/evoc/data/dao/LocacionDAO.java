package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.LocacionEntity;

public interface LocacionDAO {
	
	void create(LocacionEntity entity);
	
	List<LocacionEntity> read(LocacionEntity entity);
	
	void update(LocacionEntity entity);
	
	void delete(LocacionEntity entity);

}
