package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.RentEntity;

@Local
public interface RentDaoLocal {

	void insertToRent(RentEntity rentEntity);

	List<RentEntity> findAllRent();

	void deleteRent(RentEntity rentEntity2);

	RentEntity findRentById(long rentId);

	void updateRent(RentEntity rentEntity);

}
