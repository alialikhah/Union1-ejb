package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.DedicatedEntity;
import dao.entity.MerchantEntity;

@Local
public interface DedicatedProducatDaoLocal {

	void insertToDedicated(DedicatedEntity dedicatedEntity);

	List<DedicatedEntity> findAllDedicatedProducts() throws Exception;

	List<DedicatedEntity> findAllDedicatedByPopularity();

	List<DedicatedEntity> findAllDedicateByMerchant(MerchantEntity merchantEntity);

	void deleteDedicateProduct(DedicatedEntity dedicatedEntity);

	DedicatedEntity findDedicatedProductById(long dedicatedId) throws Exception;

}
