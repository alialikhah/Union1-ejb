package service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.entity.MerchantAddresEntity;

/**
 * Session Bean implementation class SearchMapService
 */
@Stateless
public class SearchMapService implements SearchMapServiceLocal {

    /**
     * Default constructor. 
     */
    public SearchMapService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private SingletonServiceLocal singletonServiceLocal;
    
    
    @Override
	public List<MerchantAddresEntity> operation(double lat, double lng) {
		List<MerchantAddresEntity> addresEntities = new ArrayList<>();
		//double x = Math.sqrt(Math.hypot(lng, lat));
		for (MerchantAddresEntity merchantAddresEntity : singletonServiceLocal.getMerchantAddresList()) {
			//double y =Math.hypot(merchantAddresEntity.getMerchandWidth(), merchantAddresEntity.getMerchantHeight());
			double m=(merchantAddresEntity.getMerchandWidth()-lat);
			double n=(merchantAddresEntity.getMerchantHeight()-lng);
			double f=(Math.hypot(m, n));
			long o=Math.round(f*10000);
			//getMerchandWidth//lat
			//getMerchantHeight//lng
			
			if(o<110) {
				addresEntities.add(merchantAddresEntity);
			}
		}
		return addresEntities;
	}

}
