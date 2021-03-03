package br.com.tdv.playground.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tdv.playground.models.Carreteiro;
import br.com.tdv.playground.models.dto.VeiculoDto;
import br.com.tdv.playground.models.form.VeiculoForm;
import br.com.tdv.playground.services.CarreteiroService;
import br.com.tdv.playground.services.VeiculoService;

@RestController
@RequestMapping(value = "/v1")
public class TesteErroController {

	@Autowired
	private CarreteiroService carreteiroService;
	
	@Autowired
	private VeiculoService veiculoService;

	private static final Logger logger = LoggerFactory.getLogger(CarreteiroService.class);

	@GetMapping(value = "/error")
	@Cacheable(value = "carreteiro")
	public ResponseEntity<List<Carreteiro>> testaErro(@RequestParam(value = "nome", required = true) String nome,
			@RequestParam(value = "estado", required = true) String estado) {
		List<Carreteiro> encontraCarreteiro = carreteiroService.encontraCarreteiro(nome, estado);
		return ResponseEntity.ok(encontraCarreteiro);
	}
	
	@PostMapping(value = "/post")
	@Cacheable(value = "placaCache")
	public ResponseEntity<VeiculoDto> testaValid(@RequestBody @Valid VeiculoForm veiculoForm){
		String placa = veiculoForm.getPlaca();
		VeiculoDto retornaMarca = veiculoService.retornaMarca(placa);
		return ResponseEntity.ok(retornaMarca);
	}

}
