package service;

import java.util.List;

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
    
    @Override
	public List<JobKarjoEntity> findAllKarjo(){
    	return jobKarjoDaoLocal.findAllKarjo();
    }
    
    @Override
    public void deleteKarjo(JobKarjoEntity karjoEntity){
    	jobKarjoDaoLocal.deleteKarjo(karjoEntity);
    }
    
    @Override
    public JobKarjoEntity findKarjoById(long karjoId) {
    	return jobKarjoDaoLocal.findKarjoById(karjoId);
    }
    
    @Override
    public void updateKarjo(JobKarjoEntity jobKarjoEntity) {
    	jobKarjoDaoLocal.updateKarjo(jobKarjoEntity);
    }
}
