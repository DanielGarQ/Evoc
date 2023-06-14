package co.edu.uco.evoc.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.evoc.api.controller.response.Response;
import co.edu.uco.evoc.api.validator.zona.RegistrarCandidatoValidation;
import co.edu.uco.evoc.business.facade.CandidatoFacade;
import co.edu.uco.evoc.business.facade.impl.CandidatoFacadeImpl;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.dto.CandidatoDTO;
import co.edu.uco.evoc.dto.PersonaDTO;

@RestController()
@RequestMapping("evoc/api/v1/Candidato")
public final class CandidatoController {
	
private Logger log = LoggerFactory.getLogger(CandidatoController.class);
	
	private CandidatoFacade facade;
	
	@GetMapping("/dummy")
	public CandidatoDTO dummy() {
		return CandidatoDTO.create();
	}
	
	@GetMapping
	public ResponseEntity<Response<CandidatoDTO>> list(@RequestBody CandidatoDTO dto){
		
		List<CandidatoDTO> list = new ArrayList<>();
		
		List<String> messages = new ArrayList<>();
		messages.add("Candidatos consultados exitosamente");
		
		Response<CandidatoDTO> response = new Response<>(list, messages);
		
		return new ResponseEntity<Response<CandidatoDTO>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public CandidatoDTO listById(@PathVariable UUID id){
		return (CandidatoDTO) CandidatoDTO.create().setIdentificador(id);
	}
	
	@PostMapping
	public ResponseEntity<Response<CandidatoDTO>> create(@RequestBody CandidatoDTO dto) {
		
		var statusCode = HttpStatus.OK;
		var response = new Response<CandidatoDTO>();
		
		try {
			var result = RegistrarCandidatoValidation.validate(dto);
			
			if (result.getMessages().isEmpty()) {
				facade = new CandidatoFacadeImpl();
				facade.register(dto);
				response.getMessages().add("El nuevo Candidato se ha registrado de forma satisfactoria");
			}else {
				statusCode = HttpStatus.BAD_REQUEST;
				response.setMessages(result.getMessages());
			}
			
		}catch(EvocException exception) {
			statusCode = HttpStatus.BAD_REQUEST;
			response.getMessages().add(exception.getUserMessage());
			log.error(exception.getType().toString().concat("-").concat(exception.getTechnicalMessage()), exception);
		}catch (final Exception exception) {
			statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
			response.getMessages().add("Se ha presentadop un problema inesperado, por favor intente de nuevo. Si el problema persiste contacte al administrador de la aplicacion");
			log.error("se ha presentado un problmea inesperado.Por favor validar la consola de errores...", exception);
			exception.printStackTrace();
		}
		
		return new ResponseEntity<>(response, statusCode);
	}
	
	@PutMapping("/{id}")
	public CandidatoDTO update(@PathVariable UUID id, @RequestBody CandidatoDTO dto) {
		return (CandidatoDTO) dto.setIdentificador(id);
	}
	
	@DeleteMapping("/{id}")
	public PersonaDTO delete(@PathVariable UUID id) {
		return CandidatoDTO.create().setIdentificador(id);
	}

}
