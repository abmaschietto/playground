package br.com.tdv.playground.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tdv.playground.models.Estados;

@Repository
public interface EstadosRepository extends JpaRepository<Estados, String>{

}
