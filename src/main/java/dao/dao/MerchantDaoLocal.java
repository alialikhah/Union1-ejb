package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.MerchantEntity;

@Local
public interface MerchantDaoLocal {

	List<MerchantEntity> findByMerchantReste(String merchantRaste);

}
