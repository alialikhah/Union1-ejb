package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.MashahirDaoLocal;
import dao.entity.MashahirEntity;

/**
 * Session Bean implementation class MashahirService
 */
@Stateless
public class MashahirService implements MashahirServiceLocal {

    /**
     * Default constructor. 
     */
    public MashahirService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private MashahirDaoLocal mashahirDaoLocal;
    
    @Override
    public MashahirEntity findMashahirById(long mashahirId) throws Exception {
    	return mashahirDaoLocal.findMashahirById(mashahirId);
    }
    
    @Override
    public void insertToMashahir(MashahirEntity mashahirEntity) {
    	mashahirDaoLocal.insertToMashahir(mashahirEntity);
    }
    
	@Override
    public List<MashahirEntity> findAllMashahir() throws Exception{
		return mashahirDaoLocal.findAllMashahir();
	}

	
    @Override
    public void deleteMashahirEntity(MashahirEntity mashahirEntity){
    	mashahirDaoLocal.deleteMashahirEntity(mashahirEntity);
    }
    
    @Override
    public void updateMashahir(MashahirEntity mashahirEntity) {
    mashahirDaoLocal.updateMashahir(mashahirEntity);
    }
    
}
