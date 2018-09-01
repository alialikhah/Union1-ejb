package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.BrandEntity;

@Local
public interface AddBrandServiceLocal {

	void inserToBrandEntity(BrandEntity deicatedBrandEntity);


	List<BrandEntity> findAllBrands() throws Exception;

	BrandEntity findBrandByName(String brandName);


	BrandEntity findBrandById(long brandId);


	void deleteBrand(BrandEntity brandEntity);

}
