package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.SpecialProductEntity;

/**
 * Session Bean implementation class SpecialProductDao
 */
@Stateless
public class SpecialProductDao implements SpecialProductDaoLocal {

    /**
     * Default constructor. 
     */
    public SpecialProductDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    public void inserToSpecialProduct(SpecialProductEntity specialProductEntity) {
    	entityManager.persist(specialProductEntity);
    }
    @Override
    @SuppressWarnings("unchecked")
	public List<SpecialProductEntity> findAllSpecialProduct(){
    	return entityManager.createNamedQuery("findAllSpecialProduct").getResultList();
    }

}
