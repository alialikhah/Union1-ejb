package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.MerchantEntity;

@Local
public interface MerchantResultServiceLocal {

	List<MerchantEntity> findMerchantByRaste(String raste);

}
