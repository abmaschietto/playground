package br.com.tdv.playground.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tdv.playground.models.ChaveCompostaVeiculo;
import br.com.tdv.playground.models.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, ChaveCompostaVeiculo>{
	
	Optional<List<Veiculo>> findByPlacaContainingIgnoreCase(String placa);

}
