package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.BrandEntity;
import dao.entity.DedicatedEntity;
import dao.entity.HomeEntity;
import dao.entity.MerchantAddresEntity;
import dao.entity.MerchantEntity;
import dao.entity.MojtameEntity;
import dao.entity.NaghdOBaresiEntity;
import dao.entity.NewsEntity;
import dao.entity.ProductEntity;
import dao.entity.RentEntity;
import dao.entity.Shekayat1;
import dao.entity.SliderEntity;
import dao.entity.UserEntity;

@Local
public interface SingletonServiceLocal {

	long getOnlineUser();

	void setOnlineUser(long onlineUser);


	List<MerchantEntity> getMerchantList();

	List<MerchantEntity> getMerchantMobileList();

	List<MerchantEntity> getMerchantKhanegiList();

	List<MerchantEntity> getMerchantCarList();

	List<MerchantEntity> getMerchantMusicList();

	List<MerchantEntity> getMerchantElecList();

	List<MerchantEntity> getMerchantCamList();

	List<MerchantEntity> getMerchantCctvList();

	List<MerchantEntity> getMerchantCdList();

	List<SliderEntity> getSliderList();

	List<MerchantAddresEntity> getMerchantAddresList();

	List<BrandEntity> getBrandList();

	List<MojtameEntity> getMojtameEntities();

	List<NaghdOBaresiEntity> getNaghdOBaresiEntities();

	List<NewsEntity> getNewsEntities();

	List<NewsEntity> getNewsEntitiesImportant();

	List<NewsEntity> getNewsEntitiesVeryImportant();

	List<NewsEntity> getNewsEntitiesParvane();

	List<NewsEntity> getNewsEntitiesGovahiname();

	List<UserEntity> getUserEntities();

	List<Shekayat1> getShekayat1s();

	List<Shekayat1> getShekayat1s2();

	List<RentEntity> getRentEntities();

	List<MerchantEntity> getMerchantListGold();

	List<MerchantEntity> getMerchantMobileListGold();

	List<MerchantEntity> getMerchantKhanegiListGold();

	List<MerchantEntity> getMerchantCarListGold();

	List<MerchantEntity> getMerchantMusicListGold();

	List<MerchantEntity> getMerchantElecListGold();

	List<MerchantEntity> getMerchantCamListGold();

	List<MerchantEntity> getMerchantCctvListGold();

	List<MerchantEntity> getMerchantCdListGold();

	List<MerchantEntity> getMerchantEntitiesGold();

	HomeEntity getHomeEntity();

	List<ProductEntity> getProductEntities();

	List<DedicatedEntity> getDedicatedEntities();

	List<MerchantEntity> getMerchantListSilver();

}
