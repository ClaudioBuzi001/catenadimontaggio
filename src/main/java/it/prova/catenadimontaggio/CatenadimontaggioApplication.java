package it.prova.catenadimontaggio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner{
	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;

	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Carico la catenaDiMontaggio
		SlotCatenaDiMontaggio slotCatenaMontaggio = catenaDiMontaggioService.carica(1L);
		
		//Creo un altra macchina
		Automobile automobile = new Automobile(6L, "488GT", "divj", null);
		
		//La aggiungo allo slot
		catenaDiMontaggioService.addCarToCatena(automobile, slotCatenaMontaggio);
		
		//(chiamo il metodo per creare le macchiine
		catenaDiMontaggioService.creaAuto(slotCatenaMontaggio);
	}
	


}
