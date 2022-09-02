package springmvc.dao;

import java.util.List;


import javax.transaction.Transactional;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


import springmvc.model.Country;

@Repository
public class CountryDaoImpl implements CountryDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveCountry(Country country) {
		int id=(Integer)this.hibernateTemplate.save(country);
		return id;
	}
	
	@Override
	public List<Country> listCountries() {
		 List<Country> countries = this.hibernateTemplate.loadAll(Country.class);
		 System.out.println(countries);
        return countries;
	}
}
		
		
	

