package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.MashahirEngDaoLocal;
import dao.entity.MashahirEngEntity;
import dao.entity.MashahirEntity;

/**
 * Session Bean implementation class MashahirEngService
 */
@Stateless
public class MashahirEngService implements MashahirEngServiceLocal {

    /**
     * Default constructor. 
     */
    public MashahirEngService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private MashahirEngDaoLocal mashahirEngDaoLocal;
    
    @Override
    public MashahirEngEntity findMashahirEngById(long mashahirEngId) throws Exception {
    	return mashahirEngDaoLocal.findMashahirEngById(mashahirEngId);
    }
    
    @Override
    public void insertToMashahirEng(MashahirEngEntity mashahirEngEntity) {
    	mashahirEngDaoLocal.insertToMashahirEng(mashahirEngEntity);
    }
    
	@Override
    public List<MashahirEngEntity> findAllMashahirEng() throws Exception{
		return mashahirEngDaoLocal.findAllMashahirEng();
	}

	
    @Override
    public void deleteMashahirEngEntity(MashahirEngEntity mashahirEngEntity){
    	mashahirEngDaoLocal.deleteMashahirEntity(mashahirEngEntity);
    }
    
    @Override
    public void updateMashahirEng(MashahirEngEntity mashahirEngEntity) {
    	mashahirEngDaoLocal.updateMashahirEng(mashahirEngEntity);
    }
    
	@Override
    public List<MashahirEngEntity> findMashahirEngByName(String mashahirEngName) throws Exception {
		return mashahirEngDaoLocal.findMashahirEngByName(mashahirEngName);
	}

}
