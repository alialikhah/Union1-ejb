package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.ProductEntity;

/*import dao.entity.ProductEntity;
*/
/**
 * Session Bean implementation class ProductBean
 */
@Stateless
public class ProductDao implements ProductDaoLocal {

    /**
     * Default constructor. 
     */
    public ProductDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;

    
    @Override
    @SuppressWarnings("unchecked")
	public List<ProductEntity> findAllProductByBrand(String productBrand,String productCategory){
    	return entityManager.createNamedQuery("findAllProductByBrand").setParameter("v_productBrand", productBrand).setParameter("v_productCategry", productCategory).getResultList();
    }
    @Override
    @SuppressWarnings("unchecked")
	public List<ProductEntity> findAllProducts(){
    	return entityManager.createNamedQuery("findAllProduct").getResultList();
    }
    
    @Override
    public void insertToProduct(ProductEntity productEntity){
    	entityManager.persist(productEntity);
    }
    @Override
    public ProductEntity findProductByID(long productId){
    	return (ProductEntity) entityManager.createNamedQuery("findProductById").setParameter("v_productId", productId).getSingleResult();
    }
    @Override
    @SuppressWarnings("unchecked")
	public List<ProductEntity> findAllProduct(){
    	return entityManager.createNamedQuery("findAllProduct").getResultList();
    }
    @Override
    public void updateProduct(ProductEntity productEntity) {
    	entityManager.merge(productEntity);
    }
    @Override
    public void deleteProduct(ProductEntity productEntity) {
    	ProductEntity productEntity2=new ProductEntity();
    	productEntity2=entityManager.merge(productEntity);
    	entityManager.remove(productEntity2);
    }
    
    @SuppressWarnings("unchecked")
    @Override
	public List<ProductEntity> findAllProductByBrandOnly(String branName){
    	return entityManager.createNamedQuery("findAllProductByBrandOnly").setParameter("v_productBrand", branName).getResultList();
    }
    

}
