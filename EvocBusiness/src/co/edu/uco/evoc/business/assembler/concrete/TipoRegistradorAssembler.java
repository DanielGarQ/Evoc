package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.TipoRegistradorDomain;
import co.edu.uco.evoc.dto.TipoRegistradorDTO;
import co.edu.uco.evoc.entities.TipoRegistradorEntity;

public final class TipoRegistradorAssembler implements Assembler<TipoRegistradorDomain, TipoRegistradorDTO, TipoRegistradorEntity>{
	
	private static final Assembler<TipoRegistradorDomain, TipoRegistradorDTO, TipoRegistradorEntity> INSTANCE = new TipoRegistradorAssembler();

	private TipoRegistradorAssembler() {
		super();
	}
	
	public static final Assembler<TipoRegistradorDomain, TipoRegistradorDTO, TipoRegistradorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoRegistradorDTO toDtoFromDomain(TipoRegistradorDomain domain) {
		return TipoRegistradorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public TipoRegistradorDomain toDomainFromDto(TipoRegistradorDTO dto) {
		return new TipoRegistradorDomain(dto.getIdentificador(), dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public TipoRegistradorEntity toEntityFromDomain(TipoRegistradorDomain domain) {
		return new TipoRegistradorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public TipoRegistradorDomain toDomainFromEntity(TipoRegistradorEntity entity) {
		return new TipoRegistradorDomain(entity.getIdentificador(), entity.getNombre(),entity.getDescripcion());
	}
	
	public final List<TipoRegistradorDomain> toDomainListFromEntityList(final List<TipoRegistradorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<TipoRegistradorDTO> toDtoListFromDomainList(List<TipoRegistradorDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
