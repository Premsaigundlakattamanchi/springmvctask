package springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import springmvc.model.Country;

@Repository
public interface CountryDao {

	int saveCountry(Country country);

	public List<Country> listCountries();
	

	
	

		

}
