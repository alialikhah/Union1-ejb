package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.BrandEntity;
import dao.entity.Shekayat1;

/**
 * Session Bean implementation class ShekayatDao
 */
@Stateless
public class ShekayatDao implements ShekayatDaoLocal {

    /**
     * Default constructor. 
     */
    public ShekayatDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @Override
    public void inserToShekayat(Shekayat1 shekayat1){
    	entityManager.persist(shekayat1);
    }
    
    @SuppressWarnings("unchecked")
    @Override
	public List<Shekayat1> findAllShekayat(){
    	return entityManager.createNamedQuery("findAllShekayat").getResultList();
    }
    @Override
    public Shekayat1 findShekayatById(long shakiId) {
    	return (Shekayat1) entityManager.createNamedQuery("findById").setParameter("v_shekayatId", shakiId).getSingleResult();
    }
    @Override
    public void shekayatUpdate(Shekayat1 shekayat1) {
    	entityManager.merge(shekayat1);
    }
    
    
    @SuppressWarnings("unchecked")
    @Override
	public List<Shekayat1> findAllShekayatOrder(){
    	return entityManager.createNamedQuery("findAllById2").getResultList();
    }

}
