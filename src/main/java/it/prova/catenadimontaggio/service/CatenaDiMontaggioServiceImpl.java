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
	private TelaioService talaioService;
//	MotoreService
	@Autowired
	private MotoreService motoreService;
//	ImpiantoElettricoService
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
//	CarrozzeriaService
	@Autowired
	private CarrozzeriaService carrozzeriaService;
//	ProvaSuStradaService 
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
//
//	
	
	
	@Autowired
	SlotCatenaDiMontaggioDAO catenaDiMontaggioDAO;

	@Override
	public void creaAuto(SlotCatenaDiMontaggio catenaMontaggio) {
		System.out.println("Inizio CatenaDiMontaggio");
		System.out.println("____________________________________________");
		for(Automobile automobileItem : catenaMontaggio.getAutomobilili()) {
			System.out.println("Inizio Creazione Automobile: "+ automobileItem.getModello());
			
			talaioService.montaTelaio();
			motoreService.montaMotore();
			impiantoElettricoService.installaImpiantoElettrico();
			carrozzeriaService.montaCarrozzeria();
			provaSuStradaService.tuttoGas();
			
			System.out.println("Creazione Auto Completata!");
		}
		System.out.println("________________________________");
		System.out.println("Fine Catena Di montaggio");

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
