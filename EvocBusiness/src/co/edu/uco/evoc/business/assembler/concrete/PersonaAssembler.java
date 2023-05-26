package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.PersonaDomain;
import co.edu.uco.evoc.dto.PersonaDTO;
import co.edu.uco.evoc.entities.PersonaEntity;

public class PersonaAssembler implements Assembler<PersonaDomain, PersonaDTO, PersonaEntity>{
	
	private static final Assembler<PersonaDomain, PersonaDTO, PersonaEntity> INSTANCE = new PersonaAssembler();

	private PersonaAssembler() {
		super();
	}
	
	public static final Assembler<PersonaDomain, PersonaDTO, PersonaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PersonaDTO toDtoFromDomain(PersonaDomain domain) {
		return PersonaDTO.create().setIdentificador(domain.getIdentificador()).setTipoIdentificacion(TipoIdentificacionAssembler.getinstance().toDtoFromDomain(domain.getTipoIdentificacion())).setIdentificacion(domain.getIdentificacion()).setNombre(domain.getNombre()).setApellido(domain.getApellido());
	}

	@Override
	public PersonaDomain toDomainFromDto(PersonaDTO dto) {
		return new PersonaDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto.getTipoIdentificacion()), dto.getIdentificacion(), dto.getNombre(),dto.getApellido());
	}

	@Override
	public PersonaEntity toEntityFromDomain(PersonaDomain domain) {
		return new PersonaEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getinstance().toEntityFromDomain(domain.getTipoIdentificacion()), domain.getIdentificacion() ,domain.getNombre(), domain.getApellido());
	}

	@Override
	public PersonaDomain toDomainFromEntity(PersonaEntity entity) {
		return new PersonaDomain(entity.getIdentificador(), TipoIdentificacionAssembler.getinstance().toDomainFromEntity(entity.getTipoIdentificacion()), entity.getIdentificacion(),entity.getNombre(),entity.getApellido());
	}
	
	public final List<PersonaDomain> toDomainListFromEntityList(final List<PersonaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<PersonaDTO> toDtoListFromDomainList(List<PersonaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
