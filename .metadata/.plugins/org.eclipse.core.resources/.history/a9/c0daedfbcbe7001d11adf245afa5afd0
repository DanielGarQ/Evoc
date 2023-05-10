package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class TipoCandidatoDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public TipoCandidatoDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public TipoCandidatoDTO(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static TipoCandidatoDTO create() {
		return new TipoCandidatoDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoCandidatoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoCandidatoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final TipoCandidatoDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	@Override
	public String toString() {
		return "TipoCandidatoDTO [identificador=" + identificador + ", nombre=" + nombre + ", descripcion="
				+ descripcion + "]";
	}
	
	public static void main(String[] args) {
		
		TipoCandidatoDTO candidato = new TipoCandidatoDTO();
		
		candidato.setIdentificador(null).setNombre("Daniel Garcia").setDescripcion("Soy candidato");
		
		System.out.println(candidato);
		
	}

}
