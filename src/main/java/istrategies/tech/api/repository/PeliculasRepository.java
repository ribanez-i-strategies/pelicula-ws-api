package istrategies.tech.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import istrategies.tech.api.model.Pelicula;

@Repository
public interface PeliculasRepository extends JpaRepository<Pelicula, Long> {

}
