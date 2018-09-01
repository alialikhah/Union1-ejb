package service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Exceptions.PanooRoleBackException;
import dao.dao.MerchantAddresDaoLocal;
import dao.entity.MerchantAddresEntity;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class MerchantAddresService
 */
@Stateless
public class MerchantAddresService implements MerchantAddresServiceLocal {

    /**
     * Default constructor. 
     */
    public MerchantAddresService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private MerchantAddresDaoLocal merchantAddresDaoLocal;
    @Override
    public void insetToMerchantAddres(MerchantAddresEntity merchantAddresEntity){	
    	merchantAddresDaoLocal.insetToMerchantAddres(merchantAddresEntity);
    }
    
    @Override
    public MerchantAddresEntity findAddresByMerchant(MerchantEntity merchantEntity) throws PanooRoleBackException {
    	return merchantAddresDaoLocal.findAddresByMerchant(merchantEntity);
    }
    
    @Override
    public void updateMerchantAddre(MerchantAddresEntity merchantAddresEntity) {
    	 merchantAddresDaoLocal.updateMerchantAddre(merchantAddresEntity);
    }
}
