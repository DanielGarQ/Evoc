package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.CandidatoEntity;

public interface CandidatoDAO {
	
	void create(CandidatoEntity entity);
	
	List<CandidatoEntity> read(CandidatoEntity entity);
	
	void update(CandidatoEntity entity);
	
	void delete(CandidatoEntity entity);

}
