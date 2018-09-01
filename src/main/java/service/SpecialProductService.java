package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.SpecialProductDaoLocal;
import dao.entity.SpecialProductEntity;

/**
 * Session Bean implementation class SpecialProductService
 */
@Stateless
public class SpecialProductService implements SpecialProductServiceLocal {

    /**
     * Default constructor. 
     */
    public SpecialProductService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private SpecialProductDaoLocal specialProductService;
    
    @Override
    public void inserToSpecialProduct(SpecialProductEntity specialProductEntity) {
    	specialProductService.inserToSpecialProduct(specialProductEntity);
    }
    
    @Override
	public List<SpecialProductEntity> findAllSpecialProduct(){
    	return specialProductService.findAllSpecialProduct();
    }

}
