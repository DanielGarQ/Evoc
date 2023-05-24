package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.PersonaEntity;

public interface PersonaDAO {
	
	void create(PersonaEntity entity);
	
	List<PersonaEntity> read(PersonaEntity entity);
	
	void update(PersonaEntity entity);
	
	void delete(PersonaEntity entity);

}
