package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.MojtameDaoLocal;
import dao.entity.MojtameEntity;

/**
 * Session Bean implementation class MojtameService
 */
@Stateless
public class MojtameService implements MojtameServiceLocal {

    /**
     * Default constructor. 
     */
    public MojtameService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private MojtameDaoLocal mojtameDaoLocal;
    
    @Override
    public void insertToMojtame(MojtameEntity mojtameEntity) {
    	mojtameDaoLocal.insertToMojtame(mojtameEntity);
    }
    
    @Override
	public List<MojtameEntity> findAllMojtame(){
    	return mojtameDaoLocal.findAllMojtame();
    }
    
    @Override
    public void deleteMojtameEntity(MojtameEntity mojtameEntity){
    mojtameDaoLocal.deleteMojtameEntity(mojtameEntity);
    }
    
    @Override
    public MojtameEntity findMojtameById(long mojtameId) {
    	return mojtameDaoLocal.findMojtameById(mojtameId);
    }
    
    
    }


