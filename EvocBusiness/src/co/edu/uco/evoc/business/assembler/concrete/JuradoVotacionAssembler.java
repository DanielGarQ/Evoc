package co.edu.uco.evoc.business.assembler.concrete;

import java.util.List;

import co.edu.uco.evoc.business.assembler.Assembler;
import co.edu.uco.evoc.business.domain.JuradoVotacionDomain;
import co.edu.uco.evoc.dto.JuradoVotacionDTO;
import co.edu.uco.evoc.entities.JuradoVotacionEntity;

public final class JuradoVotacionAssembler implements Assembler<JuradoVotacionDomain, JuradoVotacionDTO, JuradoVotacionEntity>{
	
	private static final Assembler<JuradoVotacionDomain, JuradoVotacionDTO, JuradoVotacionEntity> INSTANCE = new JuradoVotacionAssembler();

	private JuradoVotacionAssembler() {
		super();
	}
	
	public static final Assembler<JuradoVotacionDomain, JuradoVotacionDTO, JuradoVotacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public JuradoVotacionDTO toDtoFromDomain(JuradoVotacionDomain domain) {
		return JuradoVotacionDTO.create().setTelefono(domain.getTelefono()).setCorreo(domain.getCorreo()).setMesaVotacion(MesaVotacionAssembler.getinstance().toDtoFromDomain(domain.getMesaVotacion()));
	}

	@Override
	public JuradoVotacionDomain toDomainFromDto(JuradoVotacionDTO dto) {
		return new JuradoVotacionDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto.getTipoIdentificacion()), dto.getIdentificacion(), dto.getNombre(),dto.getApellido(),dto.getTelefono(), dto.getCorreo(),MesaVotacionAssembler.getinstance().toDomainFromDto(dto.getMesaVotacion()));
	}

	@Override
	public JuradoVotacionEntity toEntityFromDomain(JuradoVotacionDomain domain) {
		return new JuradoVotacionEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getinstance().toEntityFromDomain(domain.getTipoIdentificacion()), domain.getIdentificacion() ,domain.getNombre(), domain.getApellido(),domain.getTelefono(), domain.getCorreo(),MesaVotacionAssembler.getinstance().toEntityFromDomain(domain.getMesaVotacion()));
	}

	@Override
	public JuradoVotacionDomain toDomainFromEntity(JuradoVotacionEntity entity) {
		return new JuradoVotacionDomain(entity.getIdentificador(), TipoIdentificacionAssembler.getinstance().toDomainFromEntity(entity.getTipoIdentificacion()), entity.getIdentificacion(),entity.getNombre(),entity.getApellido(),entity.getTelefono(), entity.getCorreo(), MesaVotacionAssembler.getinstance().toDomainFromEntity(entity.getMesaVotacion()));
	}
	
	public final List<JuradoVotacionDomain> toDomainListFromEntityList(final List<JuradoVotacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

	@Override
	public List<JuradoVotacionDTO> toDtoListFromDomainList(List<JuradoVotacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
