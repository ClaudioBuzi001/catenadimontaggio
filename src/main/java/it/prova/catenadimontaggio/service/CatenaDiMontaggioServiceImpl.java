package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService {

//	//TelaioService
	@Autowired
	private TelaioService talioService;
//	MotoreService
	@Autowired
	private MotoreService motoreService;
//	ImpiantoElettricoService
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
//	CarrozzeriaService
	@Autowired
	private CarrozzeriaService carrozzeriaServiceImpl;
//	ProvaSuStradaService 
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
//
//	
	
	
	@Autowired
	SlotCatenaDiMontaggioDAO catenaDiMontaggioDAO;

	@Override
	public void creaAuto() {
		// TODO Auto-generated method stub

	}

	@Override
	public SlotCatenaDiMontaggio carica(Long id) {
		return catenaDiMontaggioDAO.get(id);
	}

	@Override
	public void addCarToCatena(Automobile automobileInstance, SlotCatenaDiMontaggio slotCatenaDiMontaggioInstance) {
		catenaDiMontaggioDAO.addCarToSlotCatenaDiMontaggio(automobileInstance, slotCatenaDiMontaggioInstance);

	}

}
