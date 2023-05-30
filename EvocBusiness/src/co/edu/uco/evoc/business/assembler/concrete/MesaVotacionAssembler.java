package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.MesaVotacionDomain;
import co.edu.uco.evoc.dto.MesaVotacionDTO;
import co.edu.uco.evoc.entities.MesaVotacionEntity;

public final class MesaVotacionAssembler implements Assembler<MesaVotacionDomain, MesaVotacionDTO, MesaVotacionEntity>{
	
	private static final Assembler<MesaVotacionDomain, MesaVotacionDTO, MesaVotacionEntity> INSTANCE = new MesaVotacionAssembler();

	private MesaVotacionAssembler() {
		super();
	}
	
	public static final Assembler<MesaVotacionDomain, MesaVotacionDTO, MesaVotacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public MesaVotacionDTO toDtoFromDomain(MesaVotacionDomain domain) {
		return MesaVotacionDTO.create().setIdentificador(domain.getIdentificador()).setNumeroMesa(domain.getNumeroMesa()).setPotencialElectoral(domain.getPotencialElectoral()).setLocacion(LocacionAssembler.getinstance().toDtoFromDomain(domain.getLocacion())).setEstadoMesaVotacionCalculado(EstadoMesaVotacionCalculadoAssembler.getinstance().toDtoFromDomain(domain.getEstadoMesaVotacionCalculado()));
	}

	@Override
	public MesaVotacionDomain toDomainFromDto(MesaVotacionDTO dto) {
		return new MesaVotacionDomain(dto.getIdentificador(), dto.getNumeroMesa(), dto.getPotencialElectoral(), LocacionAssembler.getinstance().toDomainFromDto(dto.getLocacion()), EstadoMesaVotacionCalculadoAssembler.getinstance().toDomainFromDto(dto.getEstadoMesaVotacionCalculado()));
	}

	@Override
	public MesaVotacionEntity toEntityFromDomain(MesaVotacionDomain domain) {
		return new MesaVotacionEntity(domain.getIdentificador(), domain.getNumeroMesa(), domain.getPotencialElectoral(), LocacionAssembler.getinstance().toEntityFromDomain(domain.getLocacion()), EstadoMesaVotacionCalculadoAssembler.getinstance().toEntityFromDomain(domain.getEstadoMesaVotacionCalculado()));
	}

	@Override
	public MesaVotacionDomain toDomainFromEntity(MesaVotacionEntity entity) {
		return new MesaVotacionDomain(entity.getIdentificador(), entity.getNumeroMesa(),entity.getPotencialElectoral(),LocacionAssembler.getinstance().toDomainFromEntity(entity.getLocacion()), EstadoMesaVotacionCalculadoAssembler.getinstance().toDomainFromEntity(entity.getEstadoMesaVotacionCalculado()));
	}
	
	public final List<MesaVotacionDomain> toDomainListFromEntityList(final List<MesaVotacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<MesaVotacionDTO> toDtoListFromDomainList(List<MesaVotacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
