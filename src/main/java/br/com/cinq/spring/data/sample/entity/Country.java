package br.com.cinq.spring.data.sample.entity;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * <b>Entidade País</b>
 * @author Israel Oliveira Santos
 * @since 2017-11-27
 */
@Entity
public class Country {
	/*
	 * Atributos
	 */
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
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
	
	/*
	 * ToString
	 */
	@Override
	public String toString() {
		return "{"
				+ "\n		\"id\":" + id + ","
				+ "\n		\"name\":\"" + name + "\""
				+ "\n	}";
	}
}
