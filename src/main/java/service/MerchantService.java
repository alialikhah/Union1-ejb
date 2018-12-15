package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.MerchantDaoLocal;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class MerchantService
 */
@Stateless
public class MerchantService implements MerchantServiceLocal {

    /**
     * Default constructor. 
     */
    public MerchantService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private MerchantDaoLocal merchantDaoLocal;
    
    @Override
    public List<MerchantEntity> findByMerchantReste(String merchantRaste) {
    	return merchantDaoLocal.findByMerchantReste(merchantRaste);
    }
    
    
    

}
