package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.VotanteRegistradoEntity;

public interface VotanteRegistradoDAO {
	
	void create(VotanteRegistradoEntity entity);
	
	List<VotanteRegistradoEntity> read(VotanteRegistradoEntity entity);
	
	void update(VotanteRegistradoEntity entity);
	
	void delete(VotanteRegistradoEntity entity);

}
