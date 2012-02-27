package cnr;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import resources.Kisi;


@ManagedBean(name="databean")
@RequestScoped
public class DataBean {

	@ManagedProperty(name="boi",value="#{BoI}")
	BOI boi;
	
	
	public void setBoi(BOI boi) {
		this.boi = boi;
	}
	public BOI getBoi() {
		return boi;
	}
	

	public List<Kisi> LIST(){

		List<Kisi> user = boi.ReadKisi();
	
		return user;
	}
	
}
