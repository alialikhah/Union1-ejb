package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class MerchantResultDao
 */
@Stateless
public class MerchantResultDao implements MerchantResultDaoLocal {

    /**
     * Default constructor. 
     */
    public MerchantResultDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    @SuppressWarnings("unchecked")
	public List<MerchantEntity> findMerchantByRaste(String raste){
    	return entityManager.createNamedQuery("findMerchantByRaste").setParameter("v_merchantRaste", raste).getResultList();
    }

}
