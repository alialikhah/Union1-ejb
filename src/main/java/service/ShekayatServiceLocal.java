package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.Shekayat1;

@Local
public interface ShekayatServiceLocal {

	void inserToShekayat(Shekayat1 shekayat1);

	List<Shekayat1> findAllShekayat();

	Shekayat1 findShekayatById(long shakiId);

	void shekayatUpdate(Shekayat1 shekayat1);

	List<Shekayat1> findAllShekayatOrder();

}