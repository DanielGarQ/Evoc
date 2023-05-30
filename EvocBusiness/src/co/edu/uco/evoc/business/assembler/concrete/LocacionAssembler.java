package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.LocacionDomain;
import co.edu.uco.evoc.dto.LocacionDTO;
import co.edu.uco.evoc.entities.LocacionEntity;

public final class LocacionAssembler implements Assembler<LocacionDomain, LocacionDTO, LocacionEntity>{
	
	private static final Assembler<LocacionDomain, LocacionDTO, LocacionEntity> INSTANCE = new LocacionAssembler();

	private LocacionAssembler() {
		super();
	}
	
	public static final Assembler<LocacionDomain, LocacionDTO, LocacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public LocacionDTO toDtoFromDomain(LocacionDomain domain) {
		return LocacionDTO.create().setIdentificador(domain.getIdentificador()).setDireccion(domain.getDireccion()).setDescripcion(domain.getDescripcion()).setPotencialElectoral(domain.getPotencialElectoral()).setZona(ZonaAssembler.getinstance().toDtoFromDomain(domain.getZona()));
	}

	@Override
	public LocacionDomain toDomainFromDto(LocacionDTO dto) {
		return new LocacionDomain(dto.getIdentificador(), dto.getDireccion(), dto.getDescripcion(), dto.getPotencialElectoral(), ZonaAssembler.getinstance().toDomainFromDto(dto.getZona()));
	}

	@Override
	public LocacionEntity toEntityFromDomain(LocacionDomain domain) {
		return new LocacionEntity(domain.getIdentificador(), domain.getDireccion(), domain.getDescripcion(), domain.getPotencialElectoral(), ZonaAssembler.getinstance().toEntityFromDomain(domain.getZona()));
	}

	@Override
	public LocacionDomain toDomainFromEntity(LocacionEntity entity) {
		return new LocacionDomain(entity.getIdentificador(), entity.getDireccion(), entity.getDescripcion(),entity.getPotencialElectoral(),ZonaAssembler.getinstance().toDomainFromEntity(entity.getZona()));
	}
	
	public final List<LocacionDomain> toDomainListFromEntityList(final List<LocacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<LocacionDTO> toDtoListFromDomainList(List<LocacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
