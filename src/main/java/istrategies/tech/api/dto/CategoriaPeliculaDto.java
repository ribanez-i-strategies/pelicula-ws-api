package istrategies.tech.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoriaPeliculaDto {

	private Long idCategoria;
	private String nombre;

}
