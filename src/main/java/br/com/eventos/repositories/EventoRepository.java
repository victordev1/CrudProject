package br.com.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}
