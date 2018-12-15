package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.ShekayatDaoLocal;
import dao.entity.Shekayat1;

/**
 * Session Bean implementation class ShekayatService
 */
@Stateless
public class ShekayatService implements ShekayatServiceLocal {

    /**
     * Default constructor. 
     */
    public ShekayatService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private ShekayatDaoLocal shekayatDao;
    
    @Override
    public void inserToShekayat(Shekayat1 shekayat1){
    	shekayatDao.inserToShekayat(shekayat1);
    }
    
    @Override
	public List<Shekayat1> findAllShekayat(){
    	return shekayatDao.findAllShekayat();
    }
    
    @Override
    public Shekayat1 findShekayatById(long shakiId) {
    	return shekayatDao.findShekayatById(shakiId);
    }
    
    @Override
    public void shekayatUpdate(Shekayat1 shekayat1) {
    	shekayatDao.shekayatUpdate(shekayat1);
    }
    
    @Override
	public List<Shekayat1> findAllShekayatOrder(){
    	return shekayatDao.findAllShekayatOrder();
    }

}
