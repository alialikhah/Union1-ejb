package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.ProductEntity;


@Local
public interface ProductServiceLocal {

	List<ProductEntity> findAllProductByBrand(String productBrand, String productCategory);

	List<ProductEntity> findAllProducts();

	void insertToProduct(ProductEntity productEntity);

	ProductEntity findProductByID(long productId);

	List<ProductEntity> findAllProduct();

	void updateProduct(ProductEntity productEntity);

	void deleteProduct(ProductEntity productEntity);

	List<ProductEntity> findAllProductByBrandOnly(String branName);
	


}
