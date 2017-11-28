package br.com.cinq.spring.data.repository.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.properties.PropertyMapping;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.cinq.spring.data.sample.application.Application;
import br.com.cinq.spring.data.sample.entity.Country;
import br.com.cinq.spring.data.sample.repository.CountryRepository;
import jersey.repackaged.com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = Application.class)
@ActiveProfiles("unit")
public class CountryRepositoryTest {

	@Autowired
	private CountryRepository dao;

	@Test
	public void testGelAllCountries() {
		Assert.assertNotNull(dao);

		long count = dao.count();

		Assert.assertTrue(count > 0);

		List<Country> countries = Lists.newArrayList(dao.findAll());

		Assert.assertEquals((int) count, countries.size());
	}

	@Test
	public void testFindOneCountry() {
		 Assert.assertNotNull(dao);

		 List<Country> countries = dao.findByNameContaining("Fra");

		 Assert.assertEquals(1, countries.size());
	}
}
