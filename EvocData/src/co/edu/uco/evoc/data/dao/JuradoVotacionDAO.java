package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.JuradoVotacionEntity;

public interface JuradoVotacionDAO {
	
	void create(JuradoVotacionEntity entity);
	
	List<JuradoVotacionEntity> read(JuradoVotacionEntity entity);
	
	void update(JuradoVotacionEntity entity);
	
	void delete(JuradoVotacionEntity entity);

}
