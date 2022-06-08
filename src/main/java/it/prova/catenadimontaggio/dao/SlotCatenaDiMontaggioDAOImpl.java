package it.prova.catenadimontaggio.dao;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class SlotCatenaDiMontaggioDAOImpl implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggio get(Long id) {
		for (SlotCatenaDiMontaggio catenaMontaggioItem : DBMock.CATENEDIMONTAGGIO) {
			if (catenaMontaggioItem.getId() == id) {
				return catenaMontaggioItem;
			}
		}
		return null;
	}

	@Override
	public void addCarToSlotCatenaDiMontaggio(Automobile automobileInstance,
			SlotCatenaDiMontaggio slotCatenaDiMontaggioInstance) {
		
		for (SlotCatenaDiMontaggio catenaMontaggioItem : DBMock.CATENEDIMONTAGGIO) {
			if (catenaMontaggioItem.getId() == slotCatenaDiMontaggioInstance.getId())
				catenaMontaggioItem.addToAutomobili(automobileInstance);

		}

	}

}
