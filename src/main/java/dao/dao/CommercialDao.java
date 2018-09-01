package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.CommercialEntity;
import dao.entity.MerchantEntity;
import dao.entity.ProductEntity;

/**
 * Session Bean implementation class CommercialDao
 */
@Stateless
public class CommercialDao implements CommercialDaoLocal {

    /**
     * Default constructor. 
     */
    public CommercialDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @Override
    public void insertToCommercialEntity(CommercialEntity commercialPicturesEntity) {
    	entityManager.persist(commercialPicturesEntity);
    }
    @Override
    @SuppressWarnings("unchecked")
	public List<CommercialEntity> findCommercialByMerchant(MerchantEntity merchantEntity) {
    	return entityManager.createNamedQuery("findCommercialByMerchant").setParameter("v_merchantcom", merchantEntity).getResultList();
    }
    
    @Override
    public void deleteCommercial(CommercialEntity commercialEntity) {
    	CommercialEntity commercialEntity2=new CommercialEntity();
    	commercialEntity2=entityManager.merge(commercialEntity);
    	entityManager.remove(commercialEntity2);
    }
    @Override
    public CommercialEntity findCommercialById(long commId) {
    	return (CommercialEntity) entityManager.createNamedQuery("findCommercialById").setParameter("v_commercialId", commId).getSingleResult();
    }
    
    @SuppressWarnings("unchecked")
    @Override
	public List<CommercialEntity> findAllCommercial(){
    	return entityManager.createNamedQuery("findAllCommercial").getResultList();
    }

}
