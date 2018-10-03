package service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.JobKarjoDaoLocal;
import dao.entity.JobKarjoEntity;

/**
 * Session Bean implementation class JobKarjoService
 */
@Stateless
public class JobKarjoService implements JobKarjoServiceLocal {

    /**
     * Default constructor. 
     */
    public JobKarjoService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private JobKarjoDaoLocal jobKarjoDaoLocal;

    @Override
    public void insertToKarjoEntity(JobKarjoEntity jobKarjoEntity) {
    	jobKarjoDaoLocal.insertToKarjoEntity(jobKarjoEntity);
    }
    
}
