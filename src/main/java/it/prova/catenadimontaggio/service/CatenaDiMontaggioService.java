package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {
	
	public void creaAuto();
	
	public SlotCatenaDiMontaggio carica(Long id);
	
	public void addCarToCatena(Automobile automobileInstance, SlotCatenaDiMontaggio slotCatenaDiMontaggioInstance);
	

}
