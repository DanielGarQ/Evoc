package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.CartonVotacionEntity;

public interface CartonVotacionDAO {
	
	void create(CartonVotacionEntity entity);
	
	List<CartonVotacionEntity> read(CartonVotacionEntity entity);
	
	void update(CartonVotacionEntity entity);
	
	void delete(CartonVotacionEntity entity);

}
