package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.EstadoEleccionDomain;
import co.edu.uco.evoc.dto.EstadoEleccionDTO;
import co.edu.uco.evoc.entities.EstadoEleccionEntity;

public final class EstadoEleccionAssembler implements Assembler<EstadoEleccionDomain, EstadoEleccionDTO, EstadoEleccionEntity>{
	
	private static final Assembler<EstadoEleccionDomain, EstadoEleccionDTO, EstadoEleccionEntity> INSTANCE = new EstadoEleccionAssembler();

	private EstadoEleccionAssembler() {
		super();
	}
	
	public static final Assembler<EstadoEleccionDomain, EstadoEleccionDTO, EstadoEleccionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoEleccionDTO toDtoFromDomain(EstadoEleccionDomain domain) {
		return EstadoEleccionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoEleccionDomain toDomainFromDto(EstadoEleccionDTO dto) {
		return new EstadoEleccionDomain(dto.getIdentificador(), dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoEleccionEntity toEntityFromDomain(EstadoEleccionDomain domain) {
		return new EstadoEleccionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoEleccionDomain toDomainFromEntity(EstadoEleccionEntity entity) {
		return new EstadoEleccionDomain(entity.getIdentificador(), entity.getNombre(),entity.getDescripcion());
	}
	
	public final List<EstadoEleccionDomain> toDomainListFromEntityList(final List<EstadoEleccionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<EstadoEleccionDTO> toDtoListFromDomainList(List<EstadoEleccionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
