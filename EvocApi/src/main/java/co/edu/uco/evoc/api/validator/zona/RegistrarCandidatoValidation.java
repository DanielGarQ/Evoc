package co.edu.uco.evoc.api.validator.zona;

import co.edu.uco.evoc.api.validator.Result;
import co.edu.uco.evoc.api.validator.Validation;
import co.edu.uco.evoc.api.validator.zona.common.NombreValidation;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.dto.CandidatoDTO;

public final class RegistrarCandidatoValidation implements Validation<CandidatoDTO>{
	
	private RegistrarCandidatoValidation() {
		super();
	}
	
	public static final Result validate(final CandidatoDTO data) {
		return new RegistrarCandidatoValidation().execute(data);
	}

	@Override
	public final Result execute(final CandidatoDTO data) {
		var result = Result.create();
		
		if (UtilObject.isNull(data)) {
			result.addMessage("No es posible registrar un nuevo Candidato con los datos vacios");
		}else {
		
			result.addMessages(NombreValidation.Validate(data.getNombre()).getMessages());
		}
		return result;
	}

}
