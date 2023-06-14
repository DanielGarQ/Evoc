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
import co.edu.uco.evoc.api.validator.zona.RegistrarTipoEleccionValidation;
import co.edu.uco.evoc.business.facade.TipoEleccionFacade;
import co.edu.uco.evoc.business.facade.impl.TipoEleccionFacadeImpl;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.dto.TipoEleccionDTO;
import co.edu.uco.evoc.dto.ZonaDTO;

@RestController()
@RequestMapping("evoc/api/v1/TipoEleccion")
public final class TipoEleccionController {
	
	private Logger log = LoggerFactory.getLogger(TipoEleccionController.class);
	
	private TipoEleccionFacade facade;
	
	@GetMapping("/dummy")
	public TipoEleccionDTO dummy() {
		return TipoEleccionDTO.create();
	}
	
	@GetMapping
	public ResponseEntity<Response<TipoEleccionDTO>> list(@RequestBody ZonaDTO dto){
		
		List<TipoEleccionDTO> list = new ArrayList<>();
		
		List<String> messages = new ArrayList<>();
		messages.add("Tipos de Eleccion consultados exitosamente");
		
		Response<TipoEleccionDTO> response = new Response<>(list, messages);
		
		return new ResponseEntity<Response<TipoEleccionDTO>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public TipoEleccionDTO listById(@PathVariable UUID id){
		return TipoEleccionDTO.create().setIdentificador(id);
	}
	
	@PostMapping
	public ResponseEntity<Response<TipoEleccionDTO>> create(@RequestBody TipoEleccionDTO dto) {
		
		var statusCode = HttpStatus.OK;
		var response = new Response<TipoEleccionDTO>();
		
		try {
			var result = RegistrarTipoEleccionValidation.validate(dto);
			
			if (result.getMessages().isEmpty()) {
				facade = new TipoEleccionFacadeImpl();
				facade.register(dto);
				response.getMessages().add("El nuevo Tipo Eleccion se ha registrado de forma satisfactoria");
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
	public TipoEleccionDTO update(@PathVariable UUID id, @RequestBody TipoEleccionDTO dto) {
		return dto.setIdentificador(id);
	}
	
	@DeleteMapping("/{id}")
	public TipoEleccionDTO delete(@PathVariable UUID id) {
		return TipoEleccionDTO.create().setIdentificador(id);
	}
	
	

}
