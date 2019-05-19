package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.MerchantEntity;

/**
 * ALI CHANGED THIS
 */
@Stateless
public class MerchantDao implements MerchantDaoLocal {


    public MerchantDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @SuppressWarnings("unchecked")
	@Override
    public List<MerchantEntity> findByMerchantReste(String merchantRaste) {
    	return entityManager.createNamedQuery("findMerchantByRaste").setParameter("v_merchantRaste", merchantRaste).getResultList();
    }
    


    
    
    
}
