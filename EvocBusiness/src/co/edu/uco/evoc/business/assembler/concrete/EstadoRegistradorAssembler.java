package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.EstadoRegistradorDomain;
import co.edu.uco.evoc.dto.EstadoRegistradorDTO;
import co.edu.uco.evoc.entities.EstadoRegistradorEntity;

public final class EstadoRegistradorAssembler implements Assembler<EstadoRegistradorDomain, EstadoRegistradorDTO, EstadoRegistradorEntity>{
	
	private static final Assembler<EstadoRegistradorDomain, EstadoRegistradorDTO, EstadoRegistradorEntity> INSTANCE = new EstadoRegistradorAssembler();

	private EstadoRegistradorAssembler() {
		super();
	}
	
	public static final Assembler<EstadoRegistradorDomain, EstadoRegistradorDTO, EstadoRegistradorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoRegistradorDTO toDtoFromDomain(EstadoRegistradorDomain domain) {
		return EstadoRegistradorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoRegistradorDomain toDomainFromDto(EstadoRegistradorDTO dto) {
		return new EstadoRegistradorDomain(dto.getIdentificador(), dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoRegistradorEntity toEntityFromDomain(EstadoRegistradorDomain domain) {
		return new EstadoRegistradorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoRegistradorDomain toDomainFromEntity(EstadoRegistradorEntity entity) {
		return new EstadoRegistradorDomain(entity.getIdentificador(), entity.getNombre(),entity.getDescripcion());
	}
	
	public final List<EstadoRegistradorDomain> toDomainListFromEntityList(final List<EstadoRegistradorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<EstadoRegistradorDTO> toDtoListFromDomainList(List<EstadoRegistradorDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
