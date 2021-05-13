package istrategies.tech.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import istrategies.tech.api.dto.PeliculaDto;
import istrategies.tech.api.model.Pelicula;
import istrategies.tech.api.service.PeliculaService;

@RestController
@RequestMapping("pelicula")
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaService;
	
	@GetMapping
	public List<PeliculaDto> findAll(){
		return peliculaService.findAll();
	}
}
