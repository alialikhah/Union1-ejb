package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.SpecialProductEntity;

@Local
public interface SpecialProductServiceLocal {

	void inserToSpecialProduct(SpecialProductEntity specialProductEntity);

	List<SpecialProductEntity> findAllSpecialProduct();

}
