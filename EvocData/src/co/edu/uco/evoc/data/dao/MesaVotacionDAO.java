package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.MesaVotacionEntity;

public interface MesaVotacionDAO {
	
	void create(MesaVotacionEntity entity);
	
	List<MesaVotacionEntity> read(MesaVotacionEntity entity);
	
	void update(MesaVotacionEntity entity);
	
	void delete(MesaVotacionEntity entity);

}
