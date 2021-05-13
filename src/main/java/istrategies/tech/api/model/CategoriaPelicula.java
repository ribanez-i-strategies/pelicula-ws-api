package istrategies.tech.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria_pelicula", schema = "administracion")
public class CategoriaPelicula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Long idCategoria;
	
	@Column
	private String nombre;
	
	@Column
	@Enumerated(EnumType.STRING)
	private EstadoCatagoriaPelicula estado;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstadoCatagoriaPelicula getEstado() {
		return estado;
	}

	public void setEstado(EstadoCatagoriaPelicula estado) {
		this.estado = estado;
	}
	
	
}
