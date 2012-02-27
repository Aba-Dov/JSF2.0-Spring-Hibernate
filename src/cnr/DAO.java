package cnr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import resources.Kisi;


@Repository("DaoObj")
public class DAO extends HibernateDaoSupport  {

	@Autowired
    public void Noname(SessionFactory sessionFactory)
    {
		
        setSessionFactory(sessionFactory); // sessionFactory was defined in applicationContext
    }
	
	
	@SuppressWarnings("rawtypes")
	public List<Kisi> ReadKisi(){
		List<Kisi> users = new ArrayList<Kisi>();
		
		List list = getHibernateTemplate().find(" from Kisi");
	       Iterator ite = list.iterator();
	       while (ite.hasNext()) {
	           Kisi per = (Kisi) ite.next();  
	           users.add(per);
	       }
	       
		return users;  
	}




	
	
	
	
	
}
