package br.com.cinq.spring.data.sample.service;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.repository.CityRepository;
import br.com.cinq.spring.data.sample.repository.CountryRepository;
import jersey.repackaged.com.google.common.collect.Lists;

/**
 * <b>Cidade Serviço</b>
 * @author Israel Oliveira Santos
 * @since 2017-11-27
 */
@Service
@Transactional
public class CityService {
	Logger logger = LoggerFactory.getLogger(CityService.class);

	@Autowired
	private CityRepository cityRepository;

	/**
	 * This method list cities based on name
	 * @param name
	 * @return all : List
	 */
	public List<City> getCities(String name) {
		if(null == name) {
			return Lists.newArrayList(cityRepository.findAll());
		}
		return cityRepository.findByCountryName(name);
	}
}
