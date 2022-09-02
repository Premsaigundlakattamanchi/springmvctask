package springmvc.service;

import java.util.List;

import springmvc.Dto.CountryDTO;
import springmvc.model.Country;

public interface CountryService {

	int createCountry(Country country);

	public List<Country> listCountries();

	

}
