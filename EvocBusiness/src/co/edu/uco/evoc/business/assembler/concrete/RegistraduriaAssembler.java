package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.RegistraduriaDomain;
import co.edu.uco.evoc.dto.RegistraduriaDTO;
import co.edu.uco.evoc.entities.RegistraduriaEntity;

public final class RegistraduriaAssembler implements Assembler<RegistraduriaDomain, RegistraduriaDTO, RegistraduriaEntity>{
	
	private static final Assembler<RegistraduriaDomain, RegistraduriaDTO, RegistraduriaEntity> INSTANCE = new RegistraduriaAssembler();

	private RegistraduriaAssembler() {
		super();
	}
	
	public static final Assembler<RegistraduriaDomain, RegistraduriaDTO, RegistraduriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public RegistraduriaDTO toDtoFromDomain(RegistraduriaDomain domain) {
		return RegistraduriaDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public RegistraduriaDomain toDomainFromDto(RegistraduriaDTO dto) {
		return new RegistraduriaDomain(dto.getIdentificador(), dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public RegistraduriaEntity toEntityFromDomain(RegistraduriaDomain domain) {
		return new RegistraduriaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public RegistraduriaDomain toDomainFromEntity(RegistraduriaEntity entity) {
		return new RegistraduriaDomain(entity.getIdentificador(), entity.getNombre(),entity.getDescripcion());
	}
	
	public final List<RegistraduriaDomain> toDomainListFromEntityList(final List<RegistraduriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<RegistraduriaDTO> toDtoListFromDomainList(List<RegistraduriaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
