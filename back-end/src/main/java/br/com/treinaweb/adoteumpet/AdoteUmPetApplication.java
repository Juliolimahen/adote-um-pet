package br.com.treinaweb.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.treinaweb.adoteumpet.core.models.Pet;
import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Joãzinho");
		pet.setHistoria("Historia emocionante, Joãzinho não é um cão comum, ele não obedece.");
		pet.setFoto("https://raw.githubusercontent.com/Juliolimahen/assets/main/pets/img/joaozinho.png");
		petRepository.save(pet);

		var pet1 = new Pet();
		pet1.setNome("Marley");
		pet1.setHistoria(" Marley não é um cão comum, ele não obedece, tinha pavor de chuva e se ficasse sozinho em casa nessas ocasiões destruiria tudo.");
		pet1.setFoto("https://raw.githubusercontent.com/Juliolimahen/assets/main/pets/img/marley.png");
		petRepository.save(pet1);
	}
}