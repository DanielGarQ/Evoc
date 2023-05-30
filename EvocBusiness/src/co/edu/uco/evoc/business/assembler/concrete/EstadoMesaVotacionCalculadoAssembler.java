package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.EstadoMesaVotacionCalculadoDomain;
import co.edu.uco.evoc.dto.EstadoMesaVotacionCalculadoDTO;
import co.edu.uco.evoc.entities.EstadoMesaVotacionCalculadoEntity;

public final class EstadoMesaVotacionCalculadoAssembler implements Assembler<EstadoMesaVotacionCalculadoDomain, EstadoMesaVotacionCalculadoDTO, EstadoMesaVotacionCalculadoEntity>{
	
	private static final Assembler<EstadoMesaVotacionCalculadoDomain, EstadoMesaVotacionCalculadoDTO, EstadoMesaVotacionCalculadoEntity> INSTANCE = new EstadoMesaVotacionCalculadoAssembler();

	private EstadoMesaVotacionCalculadoAssembler() {
		super();
	}
	
	public static final Assembler<EstadoMesaVotacionCalculadoDomain, EstadoMesaVotacionCalculadoDTO, EstadoMesaVotacionCalculadoEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoMesaVotacionCalculadoDTO toDtoFromDomain(EstadoMesaVotacionCalculadoDomain domain) {
		return EstadoMesaVotacionCalculadoDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoMesaVotacionCalculadoDomain toDomainFromDto(EstadoMesaVotacionCalculadoDTO dto) {
		return new EstadoMesaVotacionCalculadoDomain(dto.getIdentificador(), dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoMesaVotacionCalculadoEntity toEntityFromDomain(EstadoMesaVotacionCalculadoDomain domain) {
		return new EstadoMesaVotacionCalculadoEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoMesaVotacionCalculadoDomain toDomainFromEntity(EstadoMesaVotacionCalculadoEntity entity) {
		return new EstadoMesaVotacionCalculadoDomain(entity.getIdentificador(), entity.getNombre(),entity.getDescripcion());
	}
	
	public final List<EstadoMesaVotacionCalculadoDomain> toDomainListFromEntityList(final List<EstadoMesaVotacionCalculadoEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<EstadoMesaVotacionCalculadoDTO> toDtoListFromDomainList(List<EstadoMesaVotacionCalculadoDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
