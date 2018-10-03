package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.MerchantEntity;

@Local
public interface OnlineMerchantServiceLocal {

	List<MerchantEntity> getMerchantEntities();

	void setMerchantEntities(List<MerchantEntity> merchantEntities);

}
