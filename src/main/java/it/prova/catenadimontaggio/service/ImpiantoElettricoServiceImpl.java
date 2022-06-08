package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class ImpiantoElettricoServiceImpl implements ImpiantoElettricoService {

	@Override
	public void installaImpiantoElettrico() {
		System.out.println("Installato Impianto elettrico");

	}

}
