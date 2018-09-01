package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.MashahirEngEntity;

/**
 * Session Bean implementation class MashahirEngDao
 */
@Stateless
public class MashahirEngDao implements MashahirEngDaoLocal {

    /**
     * Default constructor. 
     */
    public MashahirEngDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @Override
    public MashahirEngEntity findMashahirEngById(long mashahirEngId) throws Exception {
    	try {
    	return (MashahirEngEntity) entityManager.createNamedQuery("findMashahirEngById").setParameter("v_mashahirEngId", mashahirEngId).getSingleResult();
    	}catch (Exception e) {
			throw new Exception();
		}
    	}
    @Override
    public void insertToMashahirEng(MashahirEngEntity mashahirEngEntity) {
    	entityManager.persist(mashahirEngEntity);
    }
    @SuppressWarnings("unchecked")
	@Override
    public List<MashahirEngEntity> findAllMashahirEng() throws Exception{
    	try {
    	return entityManager.createNamedQuery("findAllMashahirEng").getResultList();
    	}catch (Exception e) {
			throw new Exception();
		}
    	}
    
    @Override
    public void deleteMashahirEntity(MashahirEngEntity mashahirEntity){
    	MashahirEngEntity mashahir=new MashahirEngEntity();
    	mashahir=entityManager.merge(mashahirEntity);
    	entityManager.remove(mashahir);
    }
    @Override
	public void updateMashahirEng(MashahirEngEntity mashahirEngEntity) {
    	entityManager.merge(mashahirEngEntity);
    }

}
