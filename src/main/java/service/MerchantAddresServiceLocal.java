package service;

import java.util.List;

import javax.ejb.EJBTransactionRolledbackException;
import javax.ejb.Local;

import Exceptions.PanooRoleBackException;
import dao.entity.MerchantAddresEntity;
import dao.entity.MerchantEntity;

@Local
public interface MerchantAddresServiceLocal {

	void insetToMerchantAddres(MerchantAddresEntity merchantAddresEntity);

	MerchantAddresEntity findAddresByMerchant(MerchantEntity merchantEntity) throws PanooRoleBackException;

	void updateMerchantAddre(MerchantAddresEntity merchantAddresEntity);

	List<MerchantAddresEntity> findAllAddres();

}
