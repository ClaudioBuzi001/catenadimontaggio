package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class MotoreServiceImpl implements MotoreService {

	@Override
	public void montaMotore() {
		System.out.println("Motore Montato, Wruumm Wruuum");

	}

}
