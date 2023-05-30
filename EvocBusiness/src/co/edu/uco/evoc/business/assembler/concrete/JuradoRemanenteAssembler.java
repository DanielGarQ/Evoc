package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.JuradoRemanenteDomain;
import co.edu.uco.evoc.dto.JuradoRemanenteDTO;
import co.edu.uco.evoc.entities.JuradoRemanenteEntity;

public final class JuradoRemanenteAssembler implements Assembler<JuradoRemanenteDomain, JuradoRemanenteDTO, JuradoRemanenteEntity>{
	
	private static final Assembler<JuradoRemanenteDomain, JuradoRemanenteDTO, JuradoRemanenteEntity> INSTANCE = new JuradoRemanenteAssembler();

	private JuradoRemanenteAssembler() {
		super();
	}
	
	public static final Assembler<JuradoRemanenteDomain, JuradoRemanenteDTO, JuradoRemanenteEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public JuradoRemanenteDTO toDtoFromDomain(JuradoRemanenteDomain domain) {
		return JuradoRemanenteDTO.create().setTelefono(domain.getTelefono()).setCorreo(domain.getCorreo()).setMesaVotacion(MesaVotacionAssembler.getinstance().toDtoFromDomain(domain.getMesaVotacion()));
	}

	@Override
	public JuradoRemanenteDomain toDomainFromDto(JuradoRemanenteDTO dto) {
		return new JuradoRemanenteDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto.getTipoIdentificacion()), dto.getIdentificacion(), dto.getNombre(),dto.getApellido(),dto.getTelefono(), dto.getCorreo(),MesaVotacionAssembler.getinstance().toDomainFromDto(dto.getMesaVotacion()));
	}

	@Override
	public JuradoRemanenteEntity toEntityFromDomain(JuradoRemanenteDomain domain) {
		return new JuradoRemanenteEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getinstance().toEntityFromDomain(domain.getTipoIdentificacion()), domain.getIdentificacion() ,domain.getNombre(), domain.getApellido(),domain.getTelefono(), domain.getCorreo(),MesaVotacionAssembler.getinstance().toEntityFromDomain(domain.getMesaVotacion()));
	}

	@Override
	public JuradoRemanenteDomain toDomainFromEntity(JuradoRemanenteEntity entity) {
		return new JuradoRemanenteDomain(entity.getIdentificador(), TipoIdentificacionAssembler.getinstance().toDomainFromEntity(entity.getTipoIdentificacion()), entity.getIdentificacion(),entity.getNombre(),entity.getApellido(),entity.getTelefono(), entity.getCorreo(), MesaVotacionAssembler.getinstance().toDomainFromEntity(entity.getMesaVotacion()));
	}
	
	public final List<JuradoRemanenteDomain> toDomainListFromEntityList(final List<JuradoRemanenteEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<JuradoRemanenteDTO> toDtoListFromDomainList(List<JuradoRemanenteDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}


}
