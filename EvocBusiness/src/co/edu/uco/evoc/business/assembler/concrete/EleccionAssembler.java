package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.EleccionDomain;
import co.edu.uco.evoc.dto.EleccionDTO;
import co.edu.uco.evoc.entities.EleccionEntity;

public final class EleccionAssembler implements Assembler<EleccionDomain, EleccionDTO, EleccionEntity>{
	
	private static final Assembler<EleccionDomain, EleccionDTO, EleccionEntity> INSTANCE = new EleccionAssembler();

	private EleccionAssembler() {
		super();
	}
	
	public static final Assembler<EleccionDomain, EleccionDTO, EleccionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EleccionDTO toDtoFromDomain(EleccionDomain domain) {
		return EleccionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setTipoEleccion(TipoEleccionAssembler.getinstance().toDtoFromDomain(domain.getTipoEleccion())).setZona(ZonaAssembler.getinstance().toDtoFromDomain(domain.getZona())).setFechaInicial(domain.getFechaInicial()).setFechaFinal(domain.getFechaFinal()).setRegistrador(RegistradorAssembler.getinstance().toDtoFromDomain(domain.getRegistrador())).setEstadoEleccion(EstadoEleccionAssembler.getinstance().toDtoFromDomain(domain.getEstadoEleccion()));
	}

	@Override
	public EleccionDomain toDomainFromDto(EleccionDTO dto) {
		return new EleccionDomain(dto.getIdentificador(), dto.getNombre(),TipoEleccionAssembler.getinstance().toDomainFromDto(dto.getTipoEleccion()), ZonaAssembler.getinstance().toDomainFromDto(dto.getZona()), dto.getFechaInicial(), dto.getFechaFinal(), RegistradorAssembler.getinstance().toDomainFromDto(dto.getRegistrador()), EstadoEleccionAssembler.getinstance().toDomainFromDto(dto.getEstadoEleccion()));
	}

	@Override
	public EleccionEntity toEntityFromDomain(EleccionDomain domain) {
		return new EleccionEntity(domain.getIdentificador(), domain.getNombre(),TipoEleccionAssembler.getinstance().toEntityFromDomain(domain.getTipoEleccion()) ,ZonaAssembler.getinstance().toEntityFromDomain(domain.getZona()), domain.getFechaInicial(), domain.getFechaFinal(), RegistradorAssembler.getinstance().toEntityFromDomain(domain.getRegistrador()), EstadoEleccionAssembler.getinstance().toEntityFromDomain(domain.getEstadoEleccion()));
	}

	@Override
	public EleccionDomain toDomainFromEntity(EleccionEntity entity) {
		return new EleccionDomain(entity.getIdentificador(), entity.getNombre(),TipoEleccionAssembler.getinstance().toDomainFromEntity(entity.getTipoEleccion()),ZonaAssembler.getinstance().toDomainFromEntity(entity.getZona()), entity.getFechaInicial(), entity.getFechaFinal(), RegistradorAssembler.getinstance().toDomainFromEntity(entity.getRegistrador()), EstadoEleccionAssembler.getinstance().toDomainFromEntity(entity.getEstadoEleccion()));
	}
	
	public final List<EleccionDomain> toDomainListFromEntityList(final List<EleccionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<EleccionDTO> toDtoListFromDomainList(List<EleccionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
