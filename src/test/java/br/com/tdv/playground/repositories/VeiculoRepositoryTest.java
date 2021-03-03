package br.com.tdv.playground.repositories;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.tdv.playground.confs.JpaConfigurationDev;
import br.com.tdv.playground.models.Veiculo;

@RunWith(SpringRunner.class)
@DataJpaTest()
@ActiveProfiles("dev")
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ContextConfiguration(classes = { JpaConfigurationDev.class, VeiculoRepository.class })
public class VeiculoRepositoryTest {

	@Autowired
	private VeiculoRepository veiculoRepo;

	@Test
	public void deve_achar_veiculo() {
		Optional<List<Veiculo>> listOptional = veiculoRepo.findByPlacaContainingIgnoreCase("FR036");
		if (listOptional.isPresent()) {
			List<Veiculo> list = listOptional.get();
			list.forEach(System.out::println);
		}
	}

}
