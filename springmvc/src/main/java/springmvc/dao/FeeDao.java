package springmvc.dao;

import org.springframework.stereotype.Repository;


import springmvc.model.Fee;

@Repository
public interface FeeDao {
	
	int saveFee(Fee fee);

}
