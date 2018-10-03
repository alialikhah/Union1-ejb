package dao.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.JobKarjoEntity;

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

}
