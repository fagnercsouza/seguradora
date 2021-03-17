package br.com.visionnaire.desafio.repository;

import br.com.visionnaire.desafio.entities.Apolice;
import br.com.visionnaire.desafio.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApoliceRepository extends JpaRepository<Apolice, Long> {
}
