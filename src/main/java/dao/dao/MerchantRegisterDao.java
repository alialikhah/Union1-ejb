package dao.dao;

import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Exceptions.MerchantShomareParvandeException;
import Exceptions.MerchantShopNameException;
import Exceptions.MerchantSsnException;
import Exceptions.PanooRoleBackException;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class MerchantRegisterDao
 */
@Stateless
public class MerchantRegisterDao implements MerchantRegisterDaoLocal {

    /**
     * Default constructor. 
     */
    public MerchantRegisterDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    
    @Override
    public void insertToMarchantEntity(MerchantEntity merchantEntity){
    
    	entityManager.persist(merchantEntity);
   
    	}
    @Override
    @SuppressWarnings("unchecked")
	public List<MerchantEntity> findAllMErchantEntity(){
    	return entityManager.createNamedQuery("findAllMerchant").getResultList();
    }
    @Override
    public MerchantEntity findMerchantById(long merchantId) throws Exception{
    	try {
    	return (MerchantEntity) entityManager.createNamedQuery("findMerchantById").setParameter("v_merchantId", merchantId).getSingleResult();
    }catch(Exception exception) {
    	throw new Exception();
    }
    }
    @Override
    public void updateMerchantEntity(MerchantEntity merchantEntity) throws Exception{
    	try {
    	entityManager.merge(merchantEntity);
    	}catch (Exception e) {
			throw new Exception();
		}
    }
    
    @Override
    public void deleteMerchantEntity(MerchantEntity merchantEntity){
    	MerchantEntity merchant=new MerchantEntity();
    	merchant=entityManager.merge(merchantEntity);
    	entityManager.remove(merchant);
    }
    @Override
    @SuppressWarnings("unchecked")
	public List<MerchantEntity> findAllMerchantsByGroup(String group){
    	return entityManager.createNamedQuery("findMerchantByGroup").setParameter("v_merchantGroup", group).getResultList();
  
    }
    
    @Override
    public MerchantEntity findMerchantBySsn(String merchantSsn) throws Exception{
    	try {
    	return (MerchantEntity) entityManager.createNamedQuery("findMerchantBySsn").setParameter("v_merchantSsn", merchantSsn).getSingleResult();
    	}catch (Exception e) {
			System.err.println("SSSSSSSSSSSSNSSSSSSSSSSSNNNNNN");
			throw new Exception();
		}
    }
    
    @Override
    public MerchantEntity findMerchantByShomareParvande(long shomareParvande) throws Exception{
	try {
	    	return (MerchantEntity) entityManager.createNamedQuery("findMerchantByShomarehPar").setParameter("v_shomarehParvande", shomareParvande).getSingleResult();
	}catch (Exception e) {
	    throw new Exception();
	}    
}
    @Override
    public MerchantEntity findMerchantByShopNameEng(String ShopNameEng) throws Exception {
    	try {
    	return (MerchantEntity) entityManager.createNamedQuery("findMerchantByShopNameEng").setParameter("v_merchantShopNameEng",ShopNameEng).getSingleResult();
	}catch (Exception e) {
	    throw new Exception();
	}   
    	}
    
    @SuppressWarnings("unchecked")
	@Override
    public List<MerchantEntity> findMerchantByShopNamePer(String ShopNamePer) throws Exception {
    	try {
    	return entityManager.createNamedQuery("findMerchantByShopNamePer").setParameter("v_merchantShopNamePer","%" + ShopNamePer + "%").getResultList();
	}catch (Exception e) {
	    throw new Exception();
	}   
    	}
    
    


}
