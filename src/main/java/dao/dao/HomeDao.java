package dao.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.BrandEntity;
import dao.entity.HomeEntity;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class HomeDao
 */
@Stateless
public class HomeDao implements HomeDaoLocal , Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2074401683963207640L;

	/**
     * Default constructor. 
     */
    public HomeDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @Override
    public void updateHomeEntity(HomeEntity homeEntity){
    	entityManager.merge(homeEntity);
    }
    
    @Override
    public HomeEntity findHomeEntityById(long homeId){
    	try {
    	return (HomeEntity) entityManager.createNamedQuery("findByHomeId").setParameter("v_homeId", homeId).getSingleResult();
    	}catch(Exception e) {
    		HomeEntity homeEntity=new HomeEntity();
    		homeEntity.setBazdid(0);
    		entityManager.persist(homeEntity);
        	return (HomeEntity) entityManager.createNamedQuery("findByHomeId").setParameter("v_homeId", homeId).getSingleResult();
    	}
    	}
    
    @Override
    public void inserToHomeEntity(HomeEntity homeEntity){
    	entityManager.persist(homeEntity);
    }
    

}
