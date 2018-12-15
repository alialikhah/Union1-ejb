package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.RentDaoLocal;
import dao.entity.RentEntity;

/**
 * Session Bean implementation class RentService
 */
@Stateless
public class RentService implements RentServiceLocal {

    /**
     * Default constructor. 
     */
    public RentService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private RentDaoLocal rentDaoLocal;

    @Override
    public void insertToRent(RentEntity rentEntity) {
    	rentDaoLocal.insertToRent(rentEntity);
    }
    
    @Override
	public List<RentEntity> findAllRent(){
    	return rentDaoLocal.findAllRent();
    }
    
    @Override
    public void deleteRent(RentEntity rentEntity2){
    	 rentDaoLocal.deleteRent(rentEntity2);
    }
    
    @Override
    public RentEntity findRentById(long rentId) {
    	return rentDaoLocal.findRentById(rentId);
    }
    
    @Override
    public void updateRent(RentEntity rentEntity) {
    	rentDaoLocal.updateRent(rentEntity);
    }
    
    
    
    
    }
    
    

