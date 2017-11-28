/**
 * @author Israel Oliveira Santos
 * @date 2017-11-27
 */
package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cinq.spring.data.sample.entity.Country;

/**
 * <b>Repositório País</b>
 * @author Israel Oliveira Santos
 * @since 2017-11-27
 */
@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	/*
	 * Listar os nomes dos países
	 */
	@Query("select c from Country c where c.name like %?1%")
	List<Country> findByNameContaining(String name);
}
