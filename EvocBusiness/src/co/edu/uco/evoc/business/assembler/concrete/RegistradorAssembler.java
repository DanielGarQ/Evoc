package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.RegistradorDomain;
import co.edu.uco.evoc.dto.RegistradorDTO;
import co.edu.uco.evoc.entities.RegistradorEntity;

public final class RegistradorAssembler implements Assembler<RegistradorDomain, RegistradorDTO, RegistradorEntity> {
	
	private static final Assembler<RegistradorDomain, RegistradorDTO, RegistradorEntity> INSTANCE = new RegistradorAssembler();

	private RegistradorAssembler() {
		super();
	}
	
	public static final Assembler<RegistradorDomain, RegistradorDTO, RegistradorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public RegistradorDTO toDtoFromDomain(RegistradorDomain domain) {
		return RegistradorDTO.create().setTipoRegistrador(TipoRegistradorAssembler.getinstance().toDtoFromDomain(domain.getTipoRegistrador())).setRegistraduria(RegistraduriaAssembler.getinstance().toDtoFromDomain(domain.getRegistraduria())).setTelefono(domain.getTelefono()).setCorreo(domain.getCorreo()).setFechaInicialCargo(domain.getFechaInicialCargo()).setFechaFinalCargo(domain.getFechaFinalCargo()).setEstadoRegistrador(EstadoRegistradorAssembler.getinstance().toDtoFromDomain(domain.getEstadoRegistrador()));
	}

	@Override
	public RegistradorDomain toDomainFromDto(RegistradorDTO dto) {
		return new RegistradorDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto.getTipoIdentificacion()), dto.getIdentificacion(), dto.getNombre(),dto.getApellido(),TipoRegistradorAssembler.getinstance().toDomainFromDto(dto.getTipoRegistrador()),RegistraduriaAssembler.getinstance().toDomainFromDto(dto.getRegistraduria()), dto.getTelefono(), dto.getCorreo(), dto.getFechaInicialCargo() , dto.getFechaFinalCargo(), EstadoRegistradorAssembler.getinstance().toDomainFromDto(dto.getEstadoRegistrador()));
	}

	@Override
	public RegistradorEntity toEntityFromDomain(RegistradorDomain domain) {
		return new RegistradorEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getinstance().toEntityFromDomain(domain.getTipoIdentificacion()), domain.getIdentificacion() ,domain.getNombre(), domain.getApellido(), TipoRegistradorAssembler.getinstance().toEntityFromDomain(domain.getTipoRegistrador()), RegistraduriaAssembler.getinstance().toEntityFromDomain(domain.getRegistraduria()), domain.getTelefono(), domain.getCorreo(), domain.getFechaInicialCargo(), domain.getFechaFinalCargo(), EstadoRegistradorAssembler.getinstance().toEntityFromDomain(domain.getEstadoRegistrador()));
	}

	@Override
	public RegistradorDomain toDomainFromEntity(RegistradorEntity entity) {
		return new RegistradorDomain(entity.getIdentificador(), TipoIdentificacionAssembler.getinstance().toDomainFromEntity(entity.getTipoIdentificacion()), entity.getIdentificacion(),entity.getNombre(),entity.getApellido(), TipoRegistradorAssembler.getinstance().toDomainFromEntity(entity.getTipoRegistrador()),RegistraduriaAssembler.getinstance().toDomainFromEntity(entity.getRegistraduria()), entity.getTelefono(), entity.getCorreo(), entity.getFechaInicialCargo(), entity.getFechaFinalCargo(), EstadoRegistradorAssembler.getinstance().toDomainFromEntity(entity.getEstadoRegistrador()));
	}
	
	public final List<RegistradorDomain> toDomainListFromEntityList(final List<RegistradorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<RegistradorDTO> toDtoListFromDomainList(List<RegistradorDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
