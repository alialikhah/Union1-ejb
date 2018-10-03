package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.JobKarfarmaEntity;
import dao.entity.JobKarjoEntity;

/**
 * Session Bean implementation class JobKarfarmaDao
 */
@Stateless
public class JobKarfarmaDao implements JobKarfarmaDaoLocal {

    /**
     * Default constructor. 
     */
    public JobKarfarmaDao() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    public void insertToKarfarmaEntity(JobKarfarmaEntity jobKarfarmaEntity) {
    	entityManager.persist(jobKarfarmaEntity);
    }
    
    @SuppressWarnings("unchecked")
    @Override
	public List<JobKarfarmaEntity> findAllKarfarma(){
    	return entityManager.createNamedQuery("findAllKarfarma").getResultList();
    }
    @Override
    public JobKarfarmaEntity findKarfarmaById(long karfarmaId) {
    	return (JobKarfarmaEntity) entityManager.createNamedQuery("findKarfarmaById").setParameter("v_karafarmaId", karfarmaId).getSingleResult();
    }
    @Override
    public void updateKarfarma(JobKarfarmaEntity jobKarfarmaEntity) {
    	entityManager.merge(jobKarfarmaEntity);
    }
}
