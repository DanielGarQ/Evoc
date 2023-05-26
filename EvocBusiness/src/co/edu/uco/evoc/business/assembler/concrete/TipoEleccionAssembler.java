package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.TipoEleccionDomain;
import co.edu.uco.evoc.dto.TipoEleccionDTO;
import co.edu.uco.evoc.entities.TipoEleccionEntity;

public final class TipoEleccionAssembler implements Assembler<TipoEleccionDomain, TipoEleccionDTO, TipoEleccionEntity>{
	
	private static final Assembler<TipoEleccionDomain, TipoEleccionDTO, TipoEleccionEntity> INSTANCE = new TipoEleccionAssembler();

	private TipoEleccionAssembler() {
		super();
	}
	
	public static final Assembler<TipoEleccionDomain, TipoEleccionDTO, TipoEleccionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoEleccionDTO toDtoFromDomain(TipoEleccionDomain domain) {
		return TipoEleccionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setNivelTipoEleccion(NivelTipoEleccionAssembler.getinstance().toDtoFromDomain(domain.getNivelTipoEleccion()));
	}

	@Override
	public TipoEleccionDomain toDomainFromDto(TipoEleccionDTO dto) {
		return new TipoEleccionDomain(dto.getIdentificador(), dto.getNombre(),NivelTipoEleccionAssembler.getinstance().toDomainFromDto(dto.getNivelTipoEleccion()));
	}

	@Override
	public TipoEleccionEntity toEntityFromDomain(TipoEleccionDomain domain) {
		return new TipoEleccionEntity(domain.getIdentificador(), domain.getNombre(), NivelTipoEleccionAssembler.getinstance().toEntityFromDomain(domain.getNivelTipoEleccion()));
	}

	@Override
	public TipoEleccionDomain toDomainFromEntity(TipoEleccionEntity entity) {
		return new TipoEleccionDomain(entity.getIdentificador(), entity.getNombre(),NivelTipoEleccionAssembler.getinstance().toDomainFromEntity(entity.getNivelTipoEleccion()));
	}
	
	public final List<TipoEleccionDomain> toDomainListFromEntityList(final List<TipoEleccionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<TipoEleccionDTO> toDtoListFromDomainList(List<TipoEleccionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}
	
	

}
