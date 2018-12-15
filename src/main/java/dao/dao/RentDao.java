package dao.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.JobKarfarmaEntity;
import dao.entity.RentEntity;

/**
 * Session Bean implementation class RentDao
 */
@Stateless
public class RentDao implements RentDaoLocal , Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8209623595861149598L;

	/**
     * Default constructor. 
     */
    public RentDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    public void insertToRent(RentEntity rentEntity) {
    	entityManager.persist(rentEntity);
    }
    
    @SuppressWarnings("unchecked")
    @Override
	public List<RentEntity> findAllRent(){
    	return entityManager.createNamedQuery("findAllRent").getResultList();
    }
    
    
    @Override
    public void deleteRent(RentEntity rentEntity2){
    	RentEntity rentEntity=new RentEntity();
    	rentEntity=entityManager.merge(rentEntity2);
    	entityManager.remove(rentEntity);
    }
    @Override
    public RentEntity findRentById(long rentId) {
    	return (RentEntity) entityManager.createNamedQuery("findRentById").setParameter("v_rentId", rentId).getSingleResult();
    }
    @Override
    public void updateRent(RentEntity rentEntity) {
    	entityManager.merge(rentEntity);
    }

}
