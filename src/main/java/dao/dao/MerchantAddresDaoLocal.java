package dao.dao;

import javax.ejb.EJBTransactionRolledbackException;
import javax.ejb.Local;

import Exceptions.PanooRoleBackException;
import dao.entity.MerchantAddresEntity;
import dao.entity.MerchantEntity;

@Local
public interface MerchantAddresDaoLocal {

	void insetToMerchantAddres(MerchantAddresEntity merchantAddresEntity);

	MerchantAddresEntity findAddresByMerchant(MerchantEntity merchantEntity) throws PanooRoleBackException;

	void updateMerchantAddre(MerchantAddresEntity merchantAddresEntity);

}
