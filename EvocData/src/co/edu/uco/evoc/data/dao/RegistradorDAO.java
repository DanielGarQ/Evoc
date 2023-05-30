package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.RegistradorEntity;

public interface RegistradorDAO {
	
	void create(RegistradorEntity entity);
	
	List<RegistradorEntity> read(RegistradorEntity entity);
	
	void update(RegistradorEntity entity);
	
	void delete(RegistradorEntity entity);

}
