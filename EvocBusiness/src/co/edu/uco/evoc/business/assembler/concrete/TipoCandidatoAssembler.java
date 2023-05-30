package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.TipoCandidatoDomain;
import co.edu.uco.evoc.dto.TipoCandidatoDTO;
import co.edu.uco.evoc.entities.TipoCandidatoEntity;

public final class TipoCandidatoAssembler implements Assembler<TipoCandidatoDomain, TipoCandidatoDTO, TipoCandidatoEntity>{
	
	private static final Assembler<TipoCandidatoDomain, TipoCandidatoDTO, TipoCandidatoEntity> INSTANCE = new TipoCandidatoAssembler();

	private TipoCandidatoAssembler() {
		super();
	}
	
	public static final Assembler<TipoCandidatoDomain, TipoCandidatoDTO, TipoCandidatoEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoCandidatoDTO toDtoFromDomain(TipoCandidatoDomain domain) {
		return TipoCandidatoDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public TipoCandidatoDomain toDomainFromDto(TipoCandidatoDTO dto) {
		return new TipoCandidatoDomain(dto.getIdentificador(), dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public TipoCandidatoEntity toEntityFromDomain(TipoCandidatoDomain domain) {
		return new TipoCandidatoEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public TipoCandidatoDomain toDomainFromEntity(TipoCandidatoEntity entity) {
		return new TipoCandidatoDomain(entity.getIdentificador(), entity.getNombre(),entity.getDescripcion());
	}
	
	public final List<TipoCandidatoDomain> toDomainListFromEntityList(final List<TipoCandidatoEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<TipoCandidatoDTO> toDtoListFromDomainList(List<TipoCandidatoDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
