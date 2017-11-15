package br.gov.rn.natal.pgm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.gov.rn.natal.pgm.model.Procurador;

@Repository
public interface ProcuradorRepository extends JpaRepository<Procurador, Long> {

	@Query("FROM Procurador proc WHERE proc.email = :email")
	public Procurador buscarPorEmail(@Param("email") String email);
}
