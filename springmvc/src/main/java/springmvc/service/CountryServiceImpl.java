package springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc.Dto.CountryDTO;
import springmvc.dao.CountryDao;
import springmvc.model.Country;
import springmvc.service.CountryService;


@Service
@Transactional
public class CountryServiceImpl implements CountryService{
	
	
	
	@Autowired
	private CountryDao countryDao;
	
	
	public int createCountry(Country country) {
		return this.countryDao.saveCountry(country);
	}


	@Override
	public List<Country> listCountries() {
		return this.countryDao.listCountries();
		
	}


	


	


	





	
	


}
