package springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.Fee;

@Repository
public class FeeDaoImpl implements FeeDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	@Override
	public int saveFee(Fee fee) {
		int id=(Integer)this.hibernateTemplate.save(fee);
		return id;
		
	}
	
	
}
