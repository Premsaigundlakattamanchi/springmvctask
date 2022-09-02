package springmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.FeeDao;
import springmvc.model.Fee;

@Service
@Transactional
public class FeeServiceImpl implements FeeService{

	@Autowired
	private FeeDao feeDao;
	
	@Override
	public int saveFee(Fee fee) {
		return this.feeDao.saveFee(fee);
	}

}
