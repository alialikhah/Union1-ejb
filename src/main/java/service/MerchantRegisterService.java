package service;

import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;

import Exceptions.MerchantRegisterException;
import Exceptions.MerchantShomareParvandeException;
import Exceptions.MerchantShopNameException;
import Exceptions.MerchantSsnException;
import Exceptions.PanooRoleBackException;
import dao.dao.MerchantRegisterDaoLocal;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class MerchantRegisterService
 */
@Stateless
public class MerchantRegisterService implements MerchantRegisterServiceLocal {

    /**
     * Default constructor. 
     */
    public MerchantRegisterService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private MerchantRegisterDaoLocal merchantRegisterDaoLocal;
    
    @Override
    public void insertToMarchantEntity(MerchantEntity merchantEntity) throws MerchantRegisterException{
    	/*if(merchantEntity==null)
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantName().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantName().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantFamily().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantShoar().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantPass().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantPhone().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantEmail().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantMobile().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantSsn().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantGroup().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantBirthDay().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantSaliManagerName().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantSailManagerMobile().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantّInterfaceName().equals(null))
    		throw new MerchantRegisterException();
    	
    	if(merchantEntity.getMerchantInterfaceMobile().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantInterfaceMobile().equals(null))
    		throw new MerchantRegisterException();
    	
    	if(merchantEntity.getMerchantFax().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantSiteAddres().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantTelegramAddres().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantInstagramAddres().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantLicenseNumber()==0)
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantCreditDate().equals(null))
    		throw new MerchantRegisterException();
    	
    	if(merchantEntity.getMerchantShopNamePer().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantShopNameEng().equals(null))
    		throw new MerchantRegisterException();
    	
    	if(merchantEntity.getMerchantMobasherDate().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantMobasherName().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantRaste().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantEtehadie().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getMerchantDescription().equals(null))
    		throw new MerchantRegisterException();
    	if(merchantEntity.getShomarehParvande()==0)
    		throw new MerchantRegisterException();   */ 	
    		merchantRegisterDaoLocal.insertToMarchantEntity(merchantEntity);
    	
    }
    
    @Override
	public List<MerchantEntity> findAllMErchantEntity(){
    	return merchantRegisterDaoLocal.findAllMErchantEntity();
    }
    @Override
    public MerchantEntity findMerchantById(long merchantId) throws Exception{
    	return merchantRegisterDaoLocal.findMerchantById(merchantId);
    }
    
    @Override
    public void updateMerchantEntity(MerchantEntity merchantEntity) throws Exception{
    	merchantRegisterDaoLocal.updateMerchantEntity(merchantEntity);
    }
    @Override
    public void deleteMerchantEntity(MerchantEntity merchantEntity){
    	merchantRegisterDaoLocal.deleteMerchantEntity(merchantEntity);
    }
    @Override
	public List<MerchantEntity> findAllMerchantsByGroup(String group){
		return merchantRegisterDaoLocal.findAllMerchantsByGroup(group);
	}
    
    @Override
    public MerchantEntity findMerchantBySsn(String merchantSsn) throws Exception{
    return merchantRegisterDaoLocal.findMerchantBySsn(merchantSsn);	
    }
    
    
        @Override
        public MerchantEntity findMerchantByShomareParvande(long shomareParvande) throws Exception{
        		return merchantRegisterDaoLocal.findMerchantByShomareParvande(shomareParvande);
        }
        
        @Override
        public MerchantEntity findMerchantByShopNameEng(String ShopNameEng) throws Exception {
        	return merchantRegisterDaoLocal.findMerchantByShopNameEng(ShopNameEng);
        }
        
        
}