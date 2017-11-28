package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;

/**
 * <b>Repositório Cidade</b>
 * @author Israel Oliveira Santos
 * @since 2017-11-27
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	
	/*
	 * Procurar por Cidade
	 */
	List<City> findByCountry(Country country);

	/*
	 * Procurar por cidade que contenha o nome do país
	 */
	@Query(value = "select city.* from City city join Country country on country.id=city.country_id and country.name like %?1% ", nativeQuery = true)
	List<City> findByCountryName(String name);
}
