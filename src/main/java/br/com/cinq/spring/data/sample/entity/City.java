package br.com.cinq.spring.data.sample.entity;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * <b>Entidade Cidade</b>
 * @author Israel Oliveira Santos
 * @since 2017-11-27
 */
@Entity
public class City {
	/*
	 * Atributos
	 */
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

	/*
	 * Getters & Setters
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	/*
	 * ToString
	 */
	@Override
	public String toString() {
		return "{"
				+ "\n	\"id\":" + id + ","
				+ "\n	\"name\":\"" + name + "\","
				+ "\n	\"country\":" + country
				+ "\n}";
	}
}
