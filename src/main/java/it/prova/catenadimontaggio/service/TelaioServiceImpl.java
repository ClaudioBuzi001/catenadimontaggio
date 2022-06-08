package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class TelaioServiceImpl implements TelaioService {

	@Override
	public void montaTelaio() {
		System.out.println("Montaggio telaio Effettuato!");
	}

}
