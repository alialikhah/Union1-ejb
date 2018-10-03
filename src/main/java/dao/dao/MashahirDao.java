package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.MashahirEntity;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class MashahirDao
 */
@Stateless
public class MashahirDao implements MashahirDaoLocal {

    /**
     * Default constructor. 
     */
    public MashahirDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;

    @Override
    public MashahirEntity findMashahirById(long mashahirId) throws Exception {
    	try {
    	return (MashahirEntity) entityManager.createNamedQuery("findMashahirById").setParameter("v_mashahirId", mashahirId).getSingleResult();
    	}catch (Exception e) {
			throw new Exception();
		}
    	}
    @Override
    public void insertToMashahir(MashahirEntity mashahirEntity) {
    	entityManager.persist(mashahirEntity);
    }
    @SuppressWarnings("unchecked")
	@Override
    public List<MashahirEntity> findAllMashahir() throws Exception{
    	try {
    	return entityManager.createNamedQuery("findAllMashahir").getResultList();
    	}catch (Exception e) {
			throw new Exception();
		}
    	}
    
    @Override
    public void deleteMashahirEntity(MashahirEntity mashahirEntity){
    	MashahirEntity mashahir=new MashahirEntity();
    	mashahir=entityManager.merge(mashahirEntity);
    	entityManager.remove(mashahir);
    }
    @Override
    public void updateMashahir(MashahirEntity mashahirEntity) {
    	entityManager.merge(mashahirEntity);
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public List<MashahirEntity> findMashahirByName(String mashahirName) throws Exception {
    	try {
    	return entityManager.createNamedQuery("findMashahirByName").setParameter("v_mashahirName","%" + mashahirName + "%").getResultList();
	}catch (Exception e) {
	    throw new Exception();
	}   
    	}
    
}
