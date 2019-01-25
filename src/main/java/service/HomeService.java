package service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.HomeDaoLocal;
import dao.entity.HomeEntity;

/**
 * Session Bean implementation class HomeService
 */
@Stateless
public class HomeService implements HomeServiceLocal {

    /**
     * Default constructor. 
     */
    public HomeService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private HomeDaoLocal homeDaoLocal; 
    
    @Override
    public void updateHomeEntity(HomeEntity homeEntity){
    	 homeDaoLocal.updateHomeEntity(homeEntity);
    }

    
    @Override
    public HomeEntity findHomeEntity(long homeId){
    return homeDaoLocal.findHomeEntityById(homeId);
    }
    
    @Override
    public void inserToHomeEntity(HomeEntity homeEntity){
    	homeDaoLocal.inserToHomeEntity(homeEntity);
    }
}
