package dao.dao;

import java.util.List;

import javax.ejb.Local;

import Exceptions.MerchantShomareParvandeException;
import Exceptions.MerchantShopNameException;
import Exceptions.MerchantSsnException;
import Exceptions.PanooRoleBackException;
import dao.entity.MerchantEntity;

@Local
public interface MerchantRegisterDaoLocal {

	void insertToMarchantEntity(MerchantEntity merchantEntity);

	List<MerchantEntity> findAllMErchantEntity();

	MerchantEntity findMerchantById(long merchantId) throws Exception;

	void updateMerchantEntity(MerchantEntity merchantEntity) throws Exception;

	void deleteMerchantEntity(MerchantEntity merchantEntity);

	List<MerchantEntity> findAllMerchantsByGroup(String group);

	MerchantEntity findMerchantBySsn(String merchantSsn) throws Exception;

	MerchantEntity findMerchantByShomareParvande(long shomareParvande) throws Exception;

	MerchantEntity findMerchantByShopNameEng(String ShopNameEng) throws Exception;


}
