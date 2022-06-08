package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class CarrozzeriaServiceImpl implements CarrozzeriaService {

	@Override
	public void montaCarrozzeria() {
		System.out.println("Carrozzeria montata e lucidata");

	}

}
