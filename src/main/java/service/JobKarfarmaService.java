package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.JobKarfarmaDaoLocal;
import dao.entity.JobKarfarmaEntity;
import dao.entity.JobKarjoEntity;

/**
 * Session Bean implementation class JobKarfarmaService
 */
@Stateless
public class JobKarfarmaService implements JobKarfarmaServiceLocal {

    /**
     * Default constructor. 
     */
    public JobKarfarmaService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private JobKarfarmaDaoLocal jobKarfarmaDaoLocal;

    @Override
    public void insertToKarfarmaEntity(JobKarfarmaEntity jobKarfarmaEntity) {
    	jobKarfarmaDaoLocal.insertToKarfarmaEntity(jobKarfarmaEntity);
    }
    
    @Override
	public List<JobKarfarmaEntity> findAllKarfarma(){
    	return jobKarfarmaDaoLocal.findAllKarfarma();
    }
    
    @Override
    public JobKarfarmaEntity findKarfarmaById(long karfarmaId) {
    	return jobKarfarmaDaoLocal.findKarfarmaById(karfarmaId);
    }
    
    @Override
    public void updateKarfarma(JobKarfarmaEntity jobKarfarmaEntity) {
    	jobKarfarmaDaoLocal.updateKarfarma(jobKarfarmaEntity);
    }
    
    @Override
    public void deleteKarfarma(JobKarfarmaEntity jobKarfarmaEntity){
    	jobKarfarmaDaoLocal.deleteKarfarma(jobKarfarmaEntity);
    }

}
