package br.com.tdv.playground.services;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tdv.playground.exceptions.MissingDataException;
import br.com.tdv.playground.models.Veiculo;
import br.com.tdv.playground.models.dto.VeiculoDto;
import br.com.tdv.playground.repositories.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepo;
	
	public VeiculoDto retornaMarca(String placa) {
		Optional<List<Veiculo>> listOptional = veiculoRepo.findByPlacaContainingIgnoreCase(placa);
		if(listOptional.isPresent()) {
			List<Veiculo> list = listOptional.get();
			Optional<Veiculo> findAny = list.stream().filter(veiculo -> veiculo.getPlaca() != null).findAny();
			if(findAny.isPresent()) {
				VeiculoDto veiculoDto = new VeiculoDto(findAny.get().getMarca());
				return veiculoDto;
			}
		}else {
		 throw new MissingDataException("Não econtrei este arquivo em nossa database! "
		 		+ "Tem certezq que digitiou corretamente?");
		}
		return null;
	}

}
