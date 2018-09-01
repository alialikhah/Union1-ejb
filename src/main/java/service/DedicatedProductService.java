package service;

import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.DedicatedProducatDaoLocal;
import dao.entity.DedicatedEntity;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class DedicatedProductService
 */
@Stateful
public class DedicatedProductService implements DedicatedProductServiceLocal {

    /**
     * Default constructor. 
     */
    public DedicatedProductService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private DedicatedProducatDaoLocal dedicatedProducatDaoLocal;
    
    @Override
    public void insertToDedicated(DedicatedEntity dedicatedEntity){
    	dedicatedProducatDaoLocal.insertToDedicated(dedicatedEntity);
    }
    
    @Override
    public List<DedicatedEntity> findAllDedicatedProducts() throws Exception{
    	return dedicatedProducatDaoLocal.findAllDedicatedProducts();
    }
    @Override
    public List<DedicatedEntity> findAllDedicatedByPopularity(){
    	return dedicatedProducatDaoLocal.findAllDedicatedByPopularity();
    }
    
    @Override
	public List<DedicatedEntity> findAllDedicateByMerchant(MerchantEntity merchantEntity){
    	return dedicatedProducatDaoLocal.findAllDedicateByMerchant(merchantEntity);
    }
    
    @Override
    public void deleteDedicateProduct(DedicatedEntity dedicatedEntity) {
    	dedicatedProducatDaoLocal.deleteDedicateProduct(dedicatedEntity);
    }
    
    @Override
    public DedicatedEntity findDedicatedProductById(long dedicatedId) throws Exception {
    	return dedicatedProducatDaoLocal.findDedicatedProductById(dedicatedId);
    }

}
