package dao.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Exceptions.PanooRoleBackException;
import dao.entity.MerchantAddresEntity;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class MerchantAddresDao
 */
@Stateless
public class MerchantAddresDao implements MerchantAddresDaoLocal {

    /**
     * Default constructor. 
     */
    public MerchantAddresDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    public void insetToMerchantAddres(MerchantAddresEntity merchantAddresEntity){
    	entityManager.persist(merchantAddresEntity);
    	}
    
    @Override
    public MerchantAddresEntity findAddresByMerchant(MerchantEntity merchantEntity) throws PanooRoleBackException {
    	try {
    	return (MerchantAddresEntity) entityManager.createNamedQuery("findMerchantAddres").setParameter("v_merchantaddr",merchantEntity).getSingleResult();
    	}catch (Exception e) {
			throw new PanooRoleBackException();
		}
    	}

    @Override
    public void updateMerchantAddre(MerchantAddresEntity merchantAddresEntity) {
    	entityManager.merge(merchantAddresEntity);
    }
}
