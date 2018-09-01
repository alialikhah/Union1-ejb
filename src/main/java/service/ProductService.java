package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.ProductDaoLocal;
import dao.entity.ProductEntity;

/**
 * Session Bean implementation class ProductService
 */
@Stateless
public class ProductService implements ProductServiceLocal {

    /**
     * Default constructor. 
     */
    public ProductService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private ProductDaoLocal productDaoLocal;

    
    @Override
    public List<ProductEntity> findAllProductByBrand(String productBrand,String productCategory){
    	return productDaoLocal.findAllProductByBrand(productBrand,productCategory);
    }
    
    @Override
	public List<ProductEntity> findAllProducts(){
    	return productDaoLocal.findAllProducts();
    }
    
	@Override
    public void insertToProduct(ProductEntity productEntity){
    	productDaoLocal.insertToProduct(productEntity);
    }

    
    @Override
    public ProductEntity findProductByID(long productId){
    	return productDaoLocal.findProductByID(productId);
    }
    @Override
    public List<ProductEntity> findAllProduct(){
    	return productDaoLocal.findAllProduct();
    }
    
    @Override
    public void updateProduct(ProductEntity productEntity) {
    	productDaoLocal.updateProduct(productEntity);
    }
    
    @Override
    public void deleteProduct(ProductEntity productEntity) {
    	productDaoLocal.deleteProduct(productEntity);
    }
    
    @Override
	public List<ProductEntity> findAllProductByBrandOnly(String branName){
    	return productDaoLocal.findAllProductByBrandOnly(branName);
    }
}
