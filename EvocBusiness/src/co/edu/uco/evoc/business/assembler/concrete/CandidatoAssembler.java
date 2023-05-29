package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.CandidatoDomain;
import co.edu.uco.evoc.dto.CandidatoDTO;
import co.edu.uco.evoc.entities.CandidatoEntity;

public final class CandidatoAssembler implements Assembler<CandidatoDomain, CandidatoDTO, CandidatoEntity>{
	
	private static final Assembler<CandidatoDomain, CandidatoDTO, CandidatoEntity> INSTANCE = new CandidatoAssembler();

	private CandidatoAssembler() {
		super();
	}
	
	public static final Assembler<CandidatoDomain, CandidatoDTO, CandidatoEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public CandidatoDTO toDtoFromDomain(CandidatoDomain domain) {
		return CandidatoDTO.create().setTipoCandidato(TipoCandidatoAssembler.getinstance().toDtoFromDomain(domain.getTipoCandidato())).setPartido(PartidoAssembler.getinstance().toDtoFromDomain(domain.getPartido()));
	}

	@Override
	public CandidatoDomain toDomainFromDto(CandidatoDTO dto) {
		return new CandidatoDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto.getTipoIdentificacion()), dto.getIdentificacion(), dto.getNombre(),dto.getApellido(), TipoCandidatoAssembler.getinstance().toDomainFromDto(dto.getTipoCandidato()), PartidoAssembler.getinstance().toDomainFromDto(dto.getPartido()));
	}

	@Override
	public CandidatoEntity toEntityFromDomain(CandidatoDomain domain) {
		return new CandidatoEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getinstance().toEntityFromDomain(domain.getTipoIdentificacion()), domain.getIdentificacion() ,domain.getNombre(), domain.getApellido(), TipoCandidatoAssembler.getinstance().toEntityFromDomain(domain.getTipoCandidato()), PartidoAssembler.getinstance().toEntityFromDomain(domain.getPartido()));
	}

	@Override
	public CandidatoDomain toDomainFromEntity(CandidatoEntity entity) {
		return new CandidatoDomain(entity.getIdentificador(), TipoIdentificacionAssembler.getinstance().toDomainFromEntity(entity.getTipoIdentificacion()), entity.getIdentificacion(),entity.getNombre(),entity.getApellido(), TipoCandidatoAssembler.getinstance().toDomainFromEntity(entity.getTipoCandidato()), PartidoAssembler.getinstance().toDomainFromEntity(entity.getPartido()));
	}
	
	public final List<CandidatoDomain> toDomainListFromEntityList(final List<CandidatoEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<CandidatoDTO> toDtoListFromDomainList(List<CandidatoDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
