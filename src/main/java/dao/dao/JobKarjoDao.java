package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.JobKarjoEntity;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class JobKarjoDao
 */
@Stateless
public class JobKarjoDao implements JobKarjoDaoLocal {

    /**
     * Default constructor. 
     */
    public JobKarjoDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    public void insertToKarjoEntity(JobKarjoEntity jobKarjoEntity) {
    	entityManager.persist(jobKarjoEntity);
    }

    @SuppressWarnings("unchecked")
    @Override
	public List<JobKarjoEntity> findAllKarjo(){
    	return entityManager.createNamedQuery("findAllkarjo").getResultList();
    }
    
    
    @Override
    public void deleteKarjo(JobKarjoEntity karjoEntity){
    	JobKarjoEntity jobKarjoEntity=new JobKarjoEntity();
    	jobKarjoEntity=entityManager.merge(karjoEntity);
    	entityManager.remove(jobKarjoEntity);
    }
    
    @Override
    public JobKarjoEntity findKarjoById(long karjoId) {
    	return (JobKarjoEntity) entityManager.createNamedQuery("findKarjoById").setParameter("v_karjoId", karjoId).getSingleResult();
    }
    
    @Override
    public void updateKarjo(JobKarjoEntity jobKarjoEntity) {
    	entityManager.merge(jobKarjoEntity);
    }
    
    
}
