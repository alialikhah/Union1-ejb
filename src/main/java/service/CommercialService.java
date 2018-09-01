package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.CommercialDaoLocal;
import dao.entity.CommercialEntity;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class CommercialService
 */
@Stateless
public class CommercialService implements CommercialServiceLocal {

    /**
     * Default constructor. 
     */
    public CommercialService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private CommercialDaoLocal commercialDaoLocal;

    @Override
    public void insertToCommercialEntity(CommercialEntity commercialPicturesEntity) {
    	commercialDaoLocal.insertToCommercialEntity(commercialPicturesEntity);
    }
    
    @Override
	public List<CommercialEntity> findCommercialByMerchant(MerchantEntity merchantEntity) {
    	return commercialDaoLocal.findCommercialByMerchant(merchantEntity);
    }
    
    @Override
    public void deleteCommercial(CommercialEntity commercialEntity) {
      commercialDaoLocal.deleteCommercial(commercialEntity);
    }
    
    @Override
    public CommercialEntity findCommercialById(long commId) {
    	return commercialDaoLocal.findCommercialById(commId);
    }
    
    @Override
	public List<CommercialEntity> findAllCommercial(){
    	return commercialDaoLocal.findAllCommercial();
    }

}
