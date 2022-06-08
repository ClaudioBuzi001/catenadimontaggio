package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;

@Component
public class AutmobileDAOImpl implements AutomobileDAO {

	@Override
	public void insert(Automobile automobileInstance) {
		DBMock.AUTOMOBILI.add(automobileInstance);
	}

}
