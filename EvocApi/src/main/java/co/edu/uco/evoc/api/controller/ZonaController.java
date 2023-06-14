package co.edu.uco.evoc.api.controller;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

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
import co.edu.uco.evoc.api.validator.zona.RegistrarZonaValidation;
import co.edu.uco.evoc.business.facade.ZonaFacade;
import co.edu.uco.evoc.business.facade.impl.ZonaFacadeImpl;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.dto.ZonaDTO;

@RestController()
@RequestMapping("evoc/api/v1/zona")
public final class ZonaController {
	
private Logger log = LoggerFactory.getLogger(ZonaController.class);
	
	private ZonaFacade facade;
	
	@GetMapping("/dummy")
	public ZonaDTO dummy() {
		return ZonaDTO.create();
	}
	
	@GetMapping
	public ResponseEntity<Response<ZonaDTO>> list(@RequestBody ZonaDTO dto){
		
		List<ZonaDTO> list = new ArrayList<>();
		
		List<String> messages = new ArrayList<>();
		messages.add("Estados de tipos de relación institucion consultados exitosamente");
		
		Response<ZonaDTO> response = new Response<>(list, messages);
		
		return new ResponseEntity<Response<ZonaDTO>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ZonaDTO listById(@PathVariable UUID id){
		return ZonaDTO.create().setIdentificador(id);
	}
	
	@PostMapping
	public ResponseEntity<Response<ZonaDTO>> create(@RequestBody ZonaDTO dto) {
		
		var statusCode = HttpStatus.OK;
		var response = new Response<ZonaDTO>();
		
		try {
			var result = RegistrarZonaValidation.validate(dto);
			
			if (result.getMessages().isEmpty()) {
				facade = new ZonaFacadeImpl();
				facade.register(dto);
				response.getMessages().add("El nuevo tipo relación institucion se ha registrado de forma satidfactoria");
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
	public ZonaDTO update(@PathVariable UUID id, @RequestBody ZonaDTO dto) {
		return dto.setIdentificador(id);
	}
	
	@DeleteMapping("/{id}")
	public ZonaDTO delete(@PathVariable UUID id) {
		return ZonaDTO.create().setIdentificador(id);
	}

}