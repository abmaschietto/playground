package br.com.tdv.playground.repositories;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.tdv.playground.confs.JpaConfigurationDev;
import br.com.tdv.playground.models.Carreteiro;
import junit.framework.Assert;

@DataJpaTest()
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@ContextConfiguration(classes = {JpaConfigurationDev.class, CarreteiroRepository.class})
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CarreteiroRepositoryTest {
	
	private static final Logger logger = LoggerFactory.getLogger(CarreteiroRepositoryTest.class);
	
	@Autowired
	private CarreteiroRepository carreteiroRepo;

	@Test
	public void deveAcharPorDescricao() {
		String lei = "Subst. Tributaria art. 317, DECR. 45.490/00";
		Optional<List<Carreteiro>> listaOptional = carreteiroRepo.findByEstadoRgCodigoDescricaoLei(lei);
		if(listaOptional.isPresent()) {
			List<Carreteiro> list = listaOptional.get();
			logger.info("Carreteiros encontrados: " + list.size());
			//list.forEach(carreteiro -> logger.info(carreteiro.toString()));
		}
	}
	
	@Test
	public void deveAcharPorNomeCarreteiroEEstado() {
		String nome = "CLOVIS CANHETTE MONTES";
		String estado = "SP";
		Optional<List<Carreteiro>> optionalList = carreteiroRepo.findByCarreteiroNomeAndEstadoRgCodigoEstadoCodigo(nome, estado);
		if(optionalList.isPresent()) {
			List<Carreteiro> list = optionalList.get();
			list.forEach(carreteiro -> logger.info(carreteiro.toString()));
		}
	}
	
	@Test
	public void deveRetornarListaVazia() {
		String nome = "SR BACALHAU";
		String estado = "SP";
		Optional<List<Carreteiro>> lista = carreteiroRepo.findByCarreteiroNomeAndEstadoRgCodigoEstadoCodigo(nome, estado);
		if(lista.isPresent()) {
			Assert.fail();
		}
	}

}
