package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
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
