package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.TipoIdentificacionDomain;
import co.edu.uco.evoc.dto.TipoIdentificacionDTO;
import co.edu.uco.evoc.entities.TipoIdentificacionEntity;

public final class TipoIdentificacionAssembler implements Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity>{
	
	private static final Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> INSTANCE = new TipoIdentificacionAssembler();

	private TipoIdentificacionAssembler() {
		super();
	}
	
	public static final Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoIdentificacionDTO toDtoFromDomain(TipoIdentificacionDomain domain) {
		return TipoIdentificacionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public TipoIdentificacionDomain toDomainFromDto(TipoIdentificacionDTO dto) {
		return new TipoIdentificacionDomain(dto.getIdentificador(), dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public TipoIdentificacionEntity toEntityFromDomain(TipoIdentificacionDomain domain) {
		return new TipoIdentificacionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public TipoIdentificacionDomain toDomainFromEntity(TipoIdentificacionEntity entity) {
		return new TipoIdentificacionDomain(entity.getIdentificador(), entity.getNombre(),entity.getDescripcion());
	}
	
	public final List<TipoIdentificacionDomain> toDomainListFromEntityList(final List<TipoIdentificacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<TipoIdentificacionDTO> toDtoListFromDomainList(List<TipoIdentificacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
