package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.NaghdDaoLocal;
import dao.entity.NaghdOBaresiEntity;

/**
 * Session Bean implementation class NaghdService
 */
@Stateless
public class NaghdService implements NaghdServiceLocal {

    /**
     * Default constructor. 
     */
    public NaghdService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private NaghdDaoLocal naghdDaoLocal;
    
    @Override
    public void insertToNaghd(NaghdOBaresiEntity naghdOBaresiEntity) {
    	naghdDaoLocal.insertToNaghd(naghdOBaresiEntity);
    }
    
    @Override
	public List<NaghdOBaresiEntity> findAllNaghd(){
    	return naghdDaoLocal.findAllNaghd();
    }
    
    @Override
    public void deleteNaghdEntity(NaghdOBaresiEntity naghdOBaresiEntity){
     naghdDaoLocal.deleteNaghdEntity(naghdOBaresiEntity);
    }
    
    @Override
    public NaghdOBaresiEntity findNagdByID(long naghdId) {
    	return naghdDaoLocal.findNagdByID(naghdId);
    }
    

}
