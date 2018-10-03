package service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;
import javax.ejb.Startup;

import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class OnlineMerchantService
 */
@Singleton
@Startup
public class OnlineMerchantService implements OnlineMerchantServiceLocal {

    /**
     * Default constructor. 
     */
    public OnlineMerchantService() {
        // TODO Auto-generated constructor stub
    }
    
    private List<MerchantEntity> merchantEntities=new ArrayList<MerchantEntity>();
    @Override
	public List<MerchantEntity> getMerchantEntities() {
		return merchantEntities;
	}
	@Override
	public void setMerchantEntities(List<MerchantEntity> merchantEntities) {
		this.merchantEntities = merchantEntities;
	}
    
    
    
    
    

}
