package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.TipoCandidatoEntity;

public interface TipoCandidatoDAO {
	
	void create(TipoCandidatoEntity entity);
	
	List<TipoCandidatoEntity> read(TipoCandidatoEntity entity);
	
	void update(TipoCandidatoEntity entity);
	
	void delete(TipoCandidatoEntity entity);

}
