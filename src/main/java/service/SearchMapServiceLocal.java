package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.MerchantAddresEntity;

@Local
public interface SearchMapServiceLocal {

	List<MerchantAddresEntity> operation(double lat, double lng);

}
