package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.RegistraduriaEntity;

public interface RegistraduriaDAO {
	
	void create(RegistraduriaEntity entity);
	
	List<RegistraduriaEntity> read(RegistraduriaEntity entity);
	
	void update(RegistraduriaEntity entity);
	
	void delete(RegistraduriaEntity entity);

}
