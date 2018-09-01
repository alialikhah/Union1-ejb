package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.BrandEntity;
import dao.entity.ProductEntity;

/**
 * Session Bean implementation class AddBrandDao
 */
@Stateless
public class AddBrandDao implements AddBrandDaoLocal {

    /**
     * Default constructor. 
     */
    public AddBrandDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    public void inserToBrandEntity(BrandEntity deicatedBrandEntity){
    	entityManager.persist(deicatedBrandEntity);
    }
    @Override
    @SuppressWarnings("unchecked")
	public List<BrandEntity> findAllBrands() throws Exception{
    	try {
    		return entityManager.createNamedQuery("findAllDeicatedBrand").getResultList();
		} catch (Exception e) {
			throw new Exception();
		}
    	
    }
    
    @Override
    public BrandEntity findBrandByName(String brandName){
    	return (BrandEntity) entityManager.createNamedQuery("findBrandByName").setParameter("v_brandName", brandName).getSingleResult();
    }
    @Override
    public BrandEntity findBrandById(long brandId) {
    	return (BrandEntity) entityManager.createNamedQuery("findBrandById").setParameter("v_deicatedBrandId", brandId).getSingleResult();
    }
    
    @Override
    public void deleteBrand(BrandEntity brandEntity) {
    	BrandEntity brandEntity2=new BrandEntity();
    	brandEntity2=entityManager.merge(brandEntity);
    	entityManager.remove(brandEntity2);
    }

}
