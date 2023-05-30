package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.NivelTipoEleccionDomain;
import co.edu.uco.evoc.dto.NivelTipoEleccionDTO;
import co.edu.uco.evoc.entities.NivelTipoEleccionEntity;

public final class NivelTipoEleccionAssembler implements Assembler<NivelTipoEleccionDomain, NivelTipoEleccionDTO, NivelTipoEleccionEntity>{
	
	private static final Assembler<NivelTipoEleccionDomain, NivelTipoEleccionDTO, NivelTipoEleccionEntity> INSTANCE = new NivelTipoEleccionAssembler();

	private NivelTipoEleccionAssembler() {
		super();
	}
	
	public static final Assembler<NivelTipoEleccionDomain, NivelTipoEleccionDTO, NivelTipoEleccionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public NivelTipoEleccionDTO toDtoFromDomain(NivelTipoEleccionDomain domain) {
		return NivelTipoEleccionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public NivelTipoEleccionDomain toDomainFromDto(NivelTipoEleccionDTO dto) {
		return new NivelTipoEleccionDomain(dto.getIdentificador(), dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public NivelTipoEleccionEntity toEntityFromDomain(NivelTipoEleccionDomain domain) {
		return new NivelTipoEleccionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public NivelTipoEleccionDomain toDomainFromEntity(NivelTipoEleccionEntity entity) {
		return new NivelTipoEleccionDomain(entity.getIdentificador(), entity.getNombre(),entity.getDescripcion());
	}
	
	public final List<NivelTipoEleccionDomain> toDomainListFromEntityList(final List<NivelTipoEleccionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<NivelTipoEleccionDTO> toDtoListFromDomainList(List<NivelTipoEleccionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
