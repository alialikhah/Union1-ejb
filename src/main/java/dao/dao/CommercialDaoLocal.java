package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.CommercialEntity;
import dao.entity.MerchantEntity;

@Local
public interface CommercialDaoLocal {

	void insertToCommercialEntity(CommercialEntity commercialPicturesEntity);

	List<CommercialEntity> findCommercialByMerchant(MerchantEntity merchantEntity);

	void deleteCommercial(CommercialEntity commercialEntity);

	CommercialEntity findCommercialById(long commId);

	List<CommercialEntity> findAllCommercial();

}
