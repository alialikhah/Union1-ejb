package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.AddBrandDaoLocal;
import dao.entity.BrandEntity;

/**
 * Session Bean implementation class AddBrandService
 */
@Stateless
public class AddBrandService implements AddBrandServiceLocal {

    /**
     * Default constructor. 
     */
    public AddBrandService() {
    }
    @Inject
    private AddBrandDaoLocal addBrandDaoLocal;
    
    @Override
    public void inserToBrandEntity(BrandEntity deicatedBrandEntity){
    	addBrandDaoLocal.inserToBrandEntity(deicatedBrandEntity);
    }

    @Override
    public List<BrandEntity> findAllBrands() throws Exception{
    	return addBrandDaoLocal.findAllBrands();
    }
    @Override
    public BrandEntity findBrandByName(String brandName){
    	return addBrandDaoLocal.findBrandByName(brandName);
    }
    
    @Override
    public BrandEntity findBrandById(long brandId) {
    	return addBrandDaoLocal.findBrandById(brandId);
    }
    
    @Override
    public void deleteBrand(BrandEntity brandEntity) {
    	addBrandDaoLocal.deleteBrand(brandEntity);
    }
    
}
