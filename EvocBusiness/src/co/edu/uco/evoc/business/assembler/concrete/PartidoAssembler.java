package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.PartidoDomain;
import co.edu.uco.evoc.dto.PartidoDTO;
import co.edu.uco.evoc.entities.PartidoEntity;

public final class PartidoAssembler implements Assembler<PartidoDomain, PartidoDTO, PartidoEntity>{
	
	private static final Assembler<PartidoDomain, PartidoDTO, PartidoEntity> INSTANCE = new PartidoAssembler();

	private PartidoAssembler() {
		super();
	}
	
	public static final Assembler<PartidoDomain, PartidoDTO, PartidoEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PartidoDTO toDtoFromDomain(PartidoDomain domain) {
		return PartidoDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setSede(domain.getSede());
	}

	@Override
	public PartidoDomain toDomainFromDto(PartidoDTO dto) {
		return new PartidoDomain(dto.getIdentificador(), dto.getNombre(),dto.getSede());
	}

	@Override
	public PartidoEntity toEntityFromDomain(PartidoDomain domain) {
		return new PartidoEntity(domain.getIdentificador(), domain.getNombre(), domain.getSede());
	}

	@Override
	public PartidoDomain toDomainFromEntity(PartidoEntity entity) {
		return new PartidoDomain(entity.getIdentificador(), entity.getNombre(),entity.getSede());
	}
	
	public final List<PartidoDomain> toDomainListFromEntityList(final List<PartidoEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<PartidoDTO> toDtoListFromDomainList(List<PartidoDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
