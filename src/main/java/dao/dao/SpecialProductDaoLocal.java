package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.SpecialProductEntity;

@Local
public interface SpecialProductDaoLocal {

	void inserToSpecialProduct(SpecialProductEntity specialProductEntity);

	List<SpecialProductEntity> findAllSpecialProduct();

}
