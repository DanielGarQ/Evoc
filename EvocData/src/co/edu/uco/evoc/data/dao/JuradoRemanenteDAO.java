package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.JuradoRemanenteEntity;

public interface JuradoRemanenteDAO {
	
	void create(JuradoRemanenteEntity entity);
	
	List<JuradoRemanenteEntity> read(JuradoRemanenteEntity entity);
	
	void update(JuradoRemanenteEntity entity);
	
	void delete(JuradoRemanenteEntity entity);

}
