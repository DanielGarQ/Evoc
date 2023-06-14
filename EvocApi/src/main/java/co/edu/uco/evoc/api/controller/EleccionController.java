package co.edu.uco.evoc.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.evoc.dto.EleccionDTO;

@RestController()
@RequestMapping("evoc/api/v1/Eleccion")
public final class EleccionController {
	
	@GetMapping("/dummy")
	public EleccionDTO dummy() {
		return EleccionDTO.create();
	}

}
