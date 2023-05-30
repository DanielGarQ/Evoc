package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.CartonesPorMesaDomain;
import co.edu.uco.evoc.dto.CartonesPorMesaDTO;
import co.edu.uco.evoc.entities.CartonesPorMesaEntity;

public final class CartonesPorMesaAssembler implements Assembler<CartonesPorMesaDomain, CartonesPorMesaDTO, CartonesPorMesaEntity>{
	
	private static final Assembler<CartonesPorMesaDomain, CartonesPorMesaDTO, CartonesPorMesaEntity> INSTANCE = new CartonesPorMesaAssembler();

	private CartonesPorMesaAssembler() {
		super();
	}
	
	public static final Assembler<CartonesPorMesaDomain, CartonesPorMesaDTO, CartonesPorMesaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public CartonesPorMesaDTO toDtoFromDomain(CartonesPorMesaDomain domain) {
		return CartonesPorMesaDTO.create().setIdentificador(domain.getIdentificador()).setMesaVotacion(MesaVotacionAssembler.getinstance().toDtoFromDomain(domain.getMesaVotacion())).setCartonVotacion(CartonVotacionAssembler.getinstance().toDtoFromDomain(domain.getCartonVotacion())).setVotante(VotanteRegistradoAssembler.getinstance().toDtoFromDomain(domain.getVotante())).setMarcacion(domain.isMarcacion());
	}

	@Override
	public CartonesPorMesaDomain toDomainFromDto(CartonesPorMesaDTO dto) {
		return new CartonesPorMesaDomain(dto.getIdentificador(), MesaVotacionAssembler.getinstance().toDomainFromDto(dto.getMesaVotacion()), CartonVotacionAssembler.getinstance().toDomainFromDto(dto.getCartonVotacion()), VotanteRegistradoAssembler.getinstance().toDomainFromDto(dto.getVotante()), dto.isMarcacion());
	}

	@Override
	public CartonesPorMesaEntity toEntityFromDomain(CartonesPorMesaDomain domain) {
		return new CartonesPorMesaEntity(domain.getIdentificador(), MesaVotacionAssembler.getinstance().toEntityFromDomain(domain.getMesaVotacion()), CartonVotacionAssembler.getinstance().toEntityFromDomain(domain.getCartonVotacion()), VotanteRegistradoAssembler.getinstance().toEntityFromDomain(domain.getVotante()), domain.isMarcacion());
	}

	@Override
	public CartonesPorMesaDomain toDomainFromEntity(CartonesPorMesaEntity entity) {
		return new CartonesPorMesaDomain(entity.getIdentificador(), MesaVotacionAssembler.getinstance().toDomainFromEntity(entity.getMesaVotacion()), CartonVotacionAssembler.getinstance().toDomainFromEntity(entity.getCartonVotacion()), VotanteRegistradoAssembler.getinstance().toDomainFromEntity(entity.getVotante()), entity.isMarcacion());
	}
	
	public final List<CartonesPorMesaDomain> toDomainListFromEntityList(final List<CartonesPorMesaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<CartonesPorMesaDTO> toDtoListFromDomainList(List<CartonesPorMesaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
