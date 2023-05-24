package co.edu.uco.evoc.data.dao;

import java.util.List;

import co.edu.uco.evoc.entities.NivelTipoEleccionEntity;

public interface NivelTipoEleccionDAO {
	
	void create(NivelTipoEleccionEntity entity);
	
	List<NivelTipoEleccionEntity> read(NivelTipoEleccionEntity entity);
	
	void update(NivelTipoEleccionEntity entity);
	
	void delete(NivelTipoEleccionEntity entity);

}
