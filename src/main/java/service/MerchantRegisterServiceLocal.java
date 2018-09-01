package service;

import java.io.IOException;
import java.util.List;

import javax.ejb.Local;
import javax.servlet.http.Part;

import Exceptions.MerchantRegisterException;
import Exceptions.MerchantShomareParvandeException;
import Exceptions.MerchantShopNameException;
import Exceptions.MerchantSsnException;
import Exceptions.PanooRoleBackException;
import dao.entity.MerchantEntity;

@Local
public interface MerchantRegisterServiceLocal {

	void insertToMarchantEntity(MerchantEntity merchantEntity) throws MerchantRegisterException;


	List<MerchantEntity> findAllMErchantEntity();

	MerchantEntity findMerchantById(long merchantId) throws Exception;

	void updateMerchantEntity(MerchantEntity merchantEntity) throws Exception;

	void deleteMerchantEntity(MerchantEntity merchantEntity);

	List<MerchantEntity> findAllMerchantsByGroup(String group);

	MerchantEntity findMerchantBySsn(String merchantSsn) throws Exception;

	MerchantEntity findMerchantByShomareParvande(long shomareParvande) throws Exception;


	MerchantEntity findMerchantByShopNameEng(String ShopNameEng) throws Exception;



}
