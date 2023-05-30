package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.CartonVotacionDomain;
import co.edu.uco.evoc.dto.CartonVotacionDTO;
import co.edu.uco.evoc.entities.CartonVotacionEntity;

public final class CartonVotacionAssembler implements Assembler<CartonVotacionDomain, CartonVotacionDTO, CartonVotacionEntity>{
	
	private static final Assembler<CartonVotacionDomain, CartonVotacionDTO, CartonVotacionEntity> INSTANCE = new CartonVotacionAssembler();

	private CartonVotacionAssembler() {
		super();
	}
	
	public static final Assembler<CartonVotacionDomain, CartonVotacionDTO, CartonVotacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public CartonVotacionDTO toDtoFromDomain(CartonVotacionDomain domain) {
		return CartonVotacionDTO.create().setIdentificador(domain.getIdentificador()).setCandidatos(CandidatoAssembler.getinstance().toDtoFromDomain(domain.getCandidatos())).setEleccion(EleccionAssembler.getinstance().toDtoFromDomain(domain.getEleccion()));
	}

	@Override
	public CartonVotacionDomain toDomainFromDto(CartonVotacionDTO dto) {
		return new CartonVotacionDomain(dto.getIdentificador(), CandidatoAssembler.getinstance().toDomainFromDto(dto.getCandidatos()), EleccionAssembler.getinstance().toDomainFromDto(dto.getEleccion()));
	}

	@Override
	public CartonVotacionEntity toEntityFromDomain(CartonVotacionDomain domain) {
		return new CartonVotacionEntity(domain.getIdentificador(), CandidatoAssembler.getinstance().toEntityFromDomain(domain.getCandidatos()), EleccionAssembler.getinstance().toEntityFromDomain(domain.getEleccion()));
	}

	@Override
	public CartonVotacionDomain toDomainFromEntity(CartonVotacionEntity entity) {
		return new CartonVotacionDomain(entity.getIdentificador(), CandidatoAssembler.getinstance().toDomainFromEntity(entity.getCandidatos()), EleccionAssembler.getinstance().toDomainFromEntity(entity.getEleccion()));
	}
	
	public final List<CartonVotacionDomain> toDomainListFromEntityList(final List<CartonVotacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<CartonVotacionDTO> toDtoListFromDomainList(List<CartonVotacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
