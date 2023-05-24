package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.TipoRegistradorEntity;

public interface TipoRegistradorDAO {
	
	void create(TipoRegistradorEntity entity);
	
	List<TipoRegistradorEntity> read(TipoRegistradorEntity entity);
	
	void update(TipoRegistradorEntity entity);
	
	void delete(TipoRegistradorEntity entity);
	

}
