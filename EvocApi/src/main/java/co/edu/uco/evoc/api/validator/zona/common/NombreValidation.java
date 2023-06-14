package co.edu.uco.evoc.api.validator.zona.common;

import co.edu.uco.evoc.api.validator.Result;
import co.edu.uco.evoc.api.validator.Validation;
import co.edu.uco.evoc.crosscutting.utils.UtilText;

public class NombreValidation implements Validation<String>{
	
	private NombreValidation() {
		super();
	}
	
	public static final Result Validate(final String data) {
		return new NombreValidation().execute(data);
	}
	
	@Override
	public Result execute(String data) {
		var result = Result.create();
		
		if(UtilText.getUtilText().isEmpty(data)) {
			result.addMessage("No es posible continuar con el nombre del estado del tipo relacion institucion vacio...");
			
		}else {
			
			if (data.length() < 1 && data.length() > 30) {  //validar longitud de la cadena minimo 1 max 30
				result.addMessage("El nombre del estado de tipo relacion institucion no debe ser menor a 1 ni mayor a 30 caracteres");
			}
			
			if (true) { // Validar formato solo letras y espacios
				result.addMessage("el nombre del estado tipo relacion institucion sólo puede tener letras y espacios");
				
			}
		}
		
		return result;
	}

}
