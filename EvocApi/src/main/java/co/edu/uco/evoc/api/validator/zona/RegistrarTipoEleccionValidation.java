package co.edu.uco.evoc.api.validator.zona;

import co.edu.uco.evoc.api.validator.Result;
import co.edu.uco.evoc.api.validator.Validation;
import co.edu.uco.evoc.api.validator.zona.common.NombreValidation;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.dto.TipoEleccionDTO;

public final class RegistrarTipoEleccionValidation implements Validation<TipoEleccionDTO>{
	
	private RegistrarTipoEleccionValidation() {
		super();
	}
	
	public static final Result validate(final TipoEleccionDTO data) {
		return new RegistrarTipoEleccionValidation().execute(data);
	}

	@Override
	public final Result execute(final TipoEleccionDTO data) {
		var result = Result.create();
		
		if (UtilObject.isNull(data)) {
			result.addMessage("No es posible registrar un nuevo estado tipo relacion institucion con los datos vacios");
		}else {
		
			result.addMessages(NombreValidation.Validate(data.getNombre()).getMessages());
		}
		return result;
	}

}
