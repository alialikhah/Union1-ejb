package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.MashahirEntity;
import dao.entity.MojtameEntity;
import dao.entity.NaghdOBaresiEntity;

/**
 * Session Bean implementation class MojtameDao
 */
@Stateless
public class MojtameDao implements MojtameDaoLocal {

    /**
     * Default constructor. 
     */
    public MojtameDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @Override
    public void insertToMojtame(MojtameEntity mojtameEntity) {
    	entityManager.persist(mojtameEntity);
    }
    
    
    @SuppressWarnings("unchecked")
    @Override
	public List<MojtameEntity> findAllMojtame(){
    	return entityManager.createNamedQuery("findAllMojtame").getResultList();
    }
    
    @Override
    public void deleteMojtameEntity(MojtameEntity mojtameEntity){
    	MojtameEntity mojtameEntity2=new MojtameEntity();
    	mojtameEntity2=entityManager.merge(mojtameEntity);
    	entityManager.remove(mojtameEntity2);
    }
    @Override
    public MojtameEntity findMojtameById(long mojtameId) {
    	return (MojtameEntity) entityManager.createNamedQuery("findMojtameById").setParameter("v_mojtameId", mojtameId).getSingleResult();
    }
    
    
    @Override
    public void updateMojtama(MojtameEntity mojtameEntity) {
    	entityManager.merge(mojtameEntity);
    }

}
