package it.prova.catenadimontaggio.dao;

import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DBMock {
	public static final List<SlotCatenaDiMontaggio> CATENEDIMONTAGGIO = new ArrayList<SlotCatenaDiMontaggio>();

	static {

		SlotCatenaDiMontaggio catena1 = new SlotCatenaDiMontaggio(1L, "Ferrari", "Italy");
		Automobile autoFerrari = new Automobile(2L, "LaFerrari", "ahgvbbauk", null);
		catena1.addToAutomobili(autoFerrari);
		Automobile autoFerrari2 = new Automobile(3L, "458 Italia", "ahgvbbauk", null);
		catena1.addToAutomobili(autoFerrari2);

		SlotCatenaDiMontaggio catena2 = new SlotCatenaDiMontaggio(2L, "Lamborghini", "Svezia");
		Automobile autoLamborghini = new Automobile(3L, "Huracan", "aadcva", null);
		catena2.addToAutomobili(autoLamborghini);
		Automobile autoLambo = new Automobile(4L, "Gallardo", "abfbs", null);
		catena2.addToAutomobili(autoLambo);

	}

}
