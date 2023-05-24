package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.EstadoMesaVotacionCalculadoEntity;

public interface EstadoMesaVotacionCalculadoDAO {
	
	void create(EstadoMesaVotacionCalculadoEntity entity);
	
	List<EstadoMesaVotacionCalculadoEntity> read(EstadoMesaVotacionCalculadoEntity entity);
	
	void update(EstadoMesaVotacionCalculadoEntity entity);
	
	void delete(EstadoMesaVotacionCalculadoEntity entity);

}
