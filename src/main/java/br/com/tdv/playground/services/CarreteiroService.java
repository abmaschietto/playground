package br.com.tdv.playground.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tdv.playground.exceptions.MissingDataException;
import br.com.tdv.playground.models.Carreteiro;
import br.com.tdv.playground.repositories.CarreteiroRepository;

@Service
public class CarreteiroService {
	
	private static final Logger logger = LoggerFactory.getLogger(CarreteiroService.class);
	
	@Autowired
	private CarreteiroRepository carreteiroRepo;
	
	public List<Carreteiro> encontraCarreteiro(String nome, String estado) {
		Optional<List<Carreteiro>> carreteiros = null;
		try {
			Optional<List<Carreteiro>> carretiroOptional = 
					carreteiroRepo.findByCarreteiroNomeAndEstadoRgCodigoEstadoCodigo(nome, estado);
			carreteiros = carretiroOptional;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		if(carreteiros.isPresent()) {
			List<Carreteiro> listaCarreteiro = carreteiros.get();
			return listaCarreteiro;
		}else {
			throw new MissingDataException("Nenhum carreteiro encontrado, verifique a informação enviada");
		}
		
	}
	

}
