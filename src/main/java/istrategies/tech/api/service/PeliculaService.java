package istrategies.tech.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import istrategies.tech.api.dto.PeliculaDto;
import istrategies.tech.api.repository.PeliculasRepository;

@Service
public class PeliculaService {

	@Autowired
	private PeliculasRepository peliculasRepository;
	
	private ModelMapper modelMapper;
	
	public List<PeliculaDto> findAll(){
		this.modelMapper = new ModelMapper();
		return peliculasRepository.findAll().stream().map(element -> modelMapper.map(element, PeliculaDto.class))
				.collect(Collectors.toList());
	}
}
