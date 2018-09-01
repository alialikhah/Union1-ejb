package dao.dao;

import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.DedicatedEntity;
import dao.entity.MerchantEntity;
import dao.entity.ProductEntity;

/**
 * Session Bean implementation class DedicatedProducatDao
 */
@Stateful
public class DedicatedProducatDao implements DedicatedProducatDaoLocal {

    /**
     * Default constructor. 
     */
    public DedicatedProducatDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    public void insertToDedicated(DedicatedEntity dedicatedEntity){
    	entityManager.persist(dedicatedEntity);
    }
    
    @Override
    @SuppressWarnings("unchecked")
	public List<DedicatedEntity> findAllDedicatedProducts() throws Exception{
    	try {
    	return entityManager.createNamedQuery("findAllDedicatedEntity").getResultList();
    	}catch (Exception e) {
		throw new Exception();
		}
    	}
    
    @Override
    @SuppressWarnings("unchecked")
	public List<DedicatedEntity> findAllDedicatedByPopularity(){
    	return entityManager.createNamedQuery("findAllProductDesc").getResultList();
    }
    @Override
    @SuppressWarnings("unchecked")
	public List<DedicatedEntity> findAllDedicateByMerchant(MerchantEntity merchantEntity){
    	return entityManager.createNamedQuery("findDedicatedEntityByMerchant").setParameter("v_merchant", merchantEntity).getResultList();
    }
    
    
    @Override
    public void deleteDedicateProduct(DedicatedEntity dedicatedEntity) {
    	DedicatedEntity dedicatedEntity2=new DedicatedEntity();
    	dedicatedEntity2=entityManager.merge(dedicatedEntity);
    	entityManager.remove(dedicatedEntity2);
    }
    @Override
    public DedicatedEntity findDedicatedProductById(long dedicatedId) throws Exception {
    	try {
    	return (DedicatedEntity) entityManager.createNamedQuery("findDedicatedEntityById").setParameter("v_dedicatedId", dedicatedId).getSingleResult();
    	}catch (Exception e) {
		throw new Exception();
		}
    	}

}
