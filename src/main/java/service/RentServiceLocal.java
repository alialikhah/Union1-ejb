package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.RentEntity;

@Local
public interface RentServiceLocal {

	void insertToRent(RentEntity rentEntity);

	List<RentEntity> findAllRent();

	void deleteRent(RentEntity rentEntity2);

	RentEntity findRentById(long rentId);

	void updateRent(RentEntity rentEntity);

}
