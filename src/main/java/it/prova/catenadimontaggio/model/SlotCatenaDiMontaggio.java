package it.prova.catenadimontaggio.model;

import java.util.ArrayList;
import java.util.List;

public class SlotCatenaDiMontaggio {

	private Long id;
	private String brand;
	private String country;
	private List<Automobile> automobilili = new ArrayList<>();

	public SlotCatenaDiMontaggio() {
		super();
	}

	public SlotCatenaDiMontaggio(String brand, String country, List<Automobile> automobilili) {
		super();
		this.brand = brand;
		this.country = country;
		this.automobilili = automobilili;
	}

	public SlotCatenaDiMontaggio(String brand, String country) {
		super();
		this.brand = brand;
		this.country = country;
	}

	public SlotCatenaDiMontaggio(Long id, String brand, String country, List<Automobile> automobilili) {
		super();
		this.id = id;
		this.brand = brand;
		this.country = country;
		this.automobilili = automobilili;
	}

	public SlotCatenaDiMontaggio(Long id, String brand, String country) {
		super();
		this.id = id;
		this.brand = brand;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Automobile> getAutomobilili() {
		return automobilili;
	}

	public void setAutomobilili(List<Automobile> automobilili) {
		this.automobilili = automobilili;
	}

	public void addToAutomobili(Automobile automobileInstance) {
		this.automobilili.add(automobileInstance);
	}

}
