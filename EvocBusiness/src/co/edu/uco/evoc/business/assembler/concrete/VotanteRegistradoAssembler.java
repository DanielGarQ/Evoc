package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.VotanteRegistradoDomain;
import co.edu.uco.evoc.dto.VotanteRegistradoDTO;
import co.edu.uco.evoc.entities.VotanteRegistradoEntity;

public final class VotanteRegistradoAssembler implements Assembler<VotanteRegistradoDomain, VotanteRegistradoDTO, VotanteRegistradoEntity>{
	
	private static final Assembler<VotanteRegistradoDomain, VotanteRegistradoDTO, VotanteRegistradoEntity> INSTANCE = new VotanteRegistradoAssembler();

	private VotanteRegistradoAssembler() {
		super();
	}
	
	public static final Assembler<VotanteRegistradoDomain, VotanteRegistradoDTO, VotanteRegistradoEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public VotanteRegistradoDTO toDtoFromDomain(VotanteRegistradoDomain domain) {
		return VotanteRegistradoDTO.create().setMesaVotacion(MesaVotacionAssembler.getinstance().toDtoFromDomain(domain.getMesaVotacion())).setFechaExpedicionIdentificacion(domain.getFechaExpedicionIdentificacion()).setValidacionDactilar(domain.isValidacionDactilar()).setCartonVotacion(CartonesPorMesaAssembler.getinstance().toDtoFromDomain(domain.getCartonVotacion()));
	}

	@Override
	public VotanteRegistradoDomain toDomainFromDto(VotanteRegistradoDTO dto) {
		return new VotanteRegistradoDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto.getTipoIdentificacion()), dto.getIdentificacion(), dto.getNombre(),dto.getApellido(),MesaVotacionAssembler.getinstance().toDomainFromDto(dto.getMesaVotacion()), dto.getFechaExpedicionIdentificacion(), dto.isValidacionDactilar(),CartonesPorMesaAssembler.getinstance().toDomainFromDto(dto.getCartonVotacion()));
	}

	@Override
	public VotanteRegistradoEntity toEntityFromDomain(VotanteRegistradoDomain domain) {
		return new VotanteRegistradoEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getinstance().toEntityFromDomain(domain.getTipoIdentificacion()), domain.getIdentificacion() ,domain.getNombre(), domain.getApellido(),MesaVotacionAssembler.getinstance().toEntityFromDomain(domain.getMesaVotacion()), domain.getFechaExpedicionIdentificacion(), domain.isValidacionDactilar(),CartonesPorMesaAssembler.getinstance().toEntityFromDomain(domain.getCartonVotacion()));
	}

	@Override
	public VotanteRegistradoDomain toDomainFromEntity(VotanteRegistradoEntity entity) {
		return new VotanteRegistradoDomain(entity.getIdentificador(), TipoIdentificacionAssembler.getinstance().toDomainFromEntity(entity.getTipoIdentificacion()), entity.getIdentificacion(),entity.getNombre(),entity.getApellido(),MesaVotacionAssembler.getinstance().toDomainFromEntity(entity.getMesaVotacion()), entity.getFechaExpedicionIdentificacion(), entity.isValidacionDactilar(), CartonesPorMesaAssembler.getinstance().toDomainFromEntity(entity.getCartonVotacion()));
	}
	
	public final List<VotanteRegistradoDomain> toDomainListFromEntityList(final List<VotanteRegistradoEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<VotanteRegistradoDTO> toDtoListFromDomainList(List<VotanteRegistradoDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
