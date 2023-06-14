package co.edu.uco.evoc.api.validator.zona;

import co.edu.uco.evoc.api.validator.Result;
import co.edu.uco.evoc.api.validator.Validation;
import co.edu.uco.evoc.api.validator.zona.common.NombreValidation;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.dto.ZonaDTO;

public final class RegistrarZonaValidation implements Validation<ZonaDTO>{
	
	private RegistrarZonaValidation() {
		super();
	}
	
	public static final Result validate(final ZonaDTO data) {
		return new RegistrarZonaValidation().execute(data);
	}

	@Override
	public final Result execute(final ZonaDTO data) {
		var result = Result.create();
		
		if (UtilObject.isNull(data)) {
			result.addMessage("No es posible registrar una nueva zona con los datos vacios");
		}else {
		
			result.addMessages(NombreValidation.Validate(data.getNombre()).getMessages());
		}
		return result;
	}

}
