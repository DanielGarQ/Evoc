package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.ZonaDomain;
import co.edu.uco.evoc.dto.ZonaDTO;
import co.edu.uco.evoc.entities.ZonaEntity;

public final class ZonaAssembler implements Assembler<ZonaDomain, ZonaDTO, ZonaEntity>{
	
	private static final Assembler<ZonaDomain, ZonaDTO, ZonaEntity> INSTANCE = new ZonaAssembler();

	private ZonaAssembler() {
		super();
	}
	
	public static final Assembler<ZonaDomain, ZonaDTO, ZonaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public ZonaDTO toDtoFromDomain(ZonaDomain domain) {
		return ZonaDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setZonaPadre(ZonaAssembler.getinstance().toDtoFromDomain(domain.getZonaPadre()).setPotencialElectoral(domain.getPotencialElectoral()));
	}

	@Override
	public ZonaDomain toDomainFromDto(ZonaDTO dto) {
		return new ZonaDomain(dto.getIdentificador(), dto.getNombre(), ZonaAssembler.getinstance().toDomainFromDto(dto.getZonaPadre()), dto.getPotencialElectoral());
	}

	@Override
	public ZonaEntity toEntityFromDomain(ZonaDomain domain) {
		return new ZonaEntity(domain.getIdentificador(), domain.getNombre(), ZonaAssembler.getinstance().toEntityFromDomain(domain.getZonaPadre()), domain.getPotencialElectoral());
	}

	@Override
	public ZonaDomain toDomainFromEntity(ZonaEntity entity) {
		return new ZonaDomain(entity.getIdentificador(), entity.getNombre(),ZonaAssembler.getinstance().toDomainFromEntity(entity.getZonaPadre()) ,entity.getPotencialElectoral());
	}
	
	public final List<ZonaDomain> toDomainListFromEntityList(final List<ZonaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<ZonaDTO> toDtoListFromDomainList(List<ZonaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
