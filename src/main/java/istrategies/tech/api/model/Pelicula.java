package istrategies.tech.api.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pelicula", schema = "administracion")
public class Pelicula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pelicula")
	private Long idPelicula;

	@Column
	private String titulo;

	@JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private CategoriaPelicula categoria;

	@Column(name = "fecha_inicio_renta")
	private LocalDateTime fechaInicioVenta;

	@Column(name = "fecha_fin_renta")
	private LocalDateTime fechaFinVenta;

	public Pelicula() {
		super();
	}

	public Long getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Long idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public CategoriaPelicula getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaPelicula categoria) {
		this.categoria = categoria;
	}

	public LocalDateTime getFechaInicioVenta() {
		return fechaInicioVenta;
	}

	public void setFechaInicioVenta(LocalDateTime fechaInicioVenta) {
		this.fechaInicioVenta = fechaInicioVenta;
	}

	public LocalDateTime getFechaFinVenta() {
		return fechaFinVenta;
	}

	public void setFechaFinVenta(LocalDateTime fechaFinVenta) {
		this.fechaFinVenta = fechaFinVenta;
	}

}
