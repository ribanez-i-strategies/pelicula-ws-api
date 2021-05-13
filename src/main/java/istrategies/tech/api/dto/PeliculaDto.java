package istrategies.tech.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PeliculaDto {

	private Long idPelicula;
	private String titulo;
	private CategoriaPeliculaDto categoria;
	
}
