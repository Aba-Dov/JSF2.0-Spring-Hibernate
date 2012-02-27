package cnr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resources.Kisi;


@Service("BoI")
public class BOI  {

	@Autowired
	DAO DaoObj;

	
	
	public void setDaoObj(DAO daoObj) {
		DaoObj = daoObj;
	}
	
	
	public List<Kisi> ReadKisi(){
		return DaoObj.ReadKisi();
	}
		
}
