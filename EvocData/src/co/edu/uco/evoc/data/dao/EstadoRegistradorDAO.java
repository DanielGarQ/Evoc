package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.EstadoRegistradorEntity;

public interface EstadoRegistradorDAO {
	
	void create(EstadoRegistradorEntity entity);
	
	List<EstadoRegistradorEntity> read(EstadoRegistradorEntity entity);
	
	void update(EstadoRegistradorEntity entity);
	
	void delete(EstadoRegistradorEntity entity);

}
