package br.com.tdv.playground.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tdv.playground.models.Carreteiro;
import br.com.tdv.playground.models.CarreteiroChaveComposta;

@Repository
public interface CarreteiroRepository extends JpaRepository<Carreteiro, CarreteiroChaveComposta>{
	
	Optional<List<Carreteiro>> findByEstadoRgCodigoDescricaoLei(String lei);
	
	Optional<List<Carreteiro>> findByCarreteiroNomeAndEstadoRgCodigoEstadoCodigo(String nome, String estado);

}
