package service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.ejb.AccessTimeout;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import dao.entity.BrandEntity;
import dao.entity.MerchantAddresEntity;
import dao.entity.MerchantEntity;
import dao.entity.MojtameEntity;
import dao.entity.NaghdOBaresiEntity;
import dao.entity.NewsEntity;
import dao.entity.Shekayat1;
import dao.entity.SliderEntity;
import dao.entity.UserEntity;

/**
 * Session Bean implementation class SingletonService
 */
@Singleton
@Startup
public class SingletonService implements SingletonServiceLocal {

	/**
	 * Default constructor.
	 */
	public SingletonService() {
		// TODO Auto-generated constructor stub
	}

	@Inject
	private MerchantResultServiceLocal merchantResultServiceLocal;
	@Inject
	private MerchantRegisterServiceLocal merchantRegisterServiceLocal;
	@Inject
	private SliderServiceLocal sliderServiceLocal;
	@Inject
	private MerchantAddresServiceLocal merchantAddresServiceLocal;
	@Inject
	private AddBrandServiceLocal addBrandServiceLocal;
	@Inject
	private MojtameServiceLocal mojtameServiceLocal;
	@Inject
	private NaghdServiceLocal naghdServiceLocal;
	@Inject
	private NewsServiceLocal newsServiceLocal;
	@Inject
	private UserServiceLocal userServiceLocal;
	@Inject
	private ShekayatServiceLocal shekayatServiceLocal;
	
	private List<MerchantEntity> merchantList = new ArrayList<>();
	private List<MerchantEntity> merchantMobileList = new ArrayList<>();
	private List<MerchantEntity> merchantKhanegiList = new ArrayList<>();
	private List<MerchantEntity> merchantCarList = new ArrayList<>();
	private List<MerchantEntity> merchantMusicList = new ArrayList<>();
	private List<MerchantEntity> merchantElecList = new ArrayList<>();
	private List<MerchantEntity> merchantCamList = new ArrayList<>();
	private List<MerchantEntity> merchantCctvList = new ArrayList<>();
	private List<MerchantEntity> merchantCdList = new ArrayList<>();
	private List<SliderEntity> sliderList=new ArrayList<>();
    private List<MerchantAddresEntity> merchantAddresList=new ArrayList<>();
    private List<BrandEntity> brandList=new ArrayList<>();
    private List<MojtameEntity> mojtameEntities=new ArrayList<>();
    private List<NaghdOBaresiEntity> naghdOBaresiEntities=new ArrayList<>();
    private List<NewsEntity> newsEntities=new ArrayList<>();
	private List<NewsEntity> newsEntitiesImportant=new ArrayList<>();
	private List<NewsEntity> newsEntitiesVeryImportant=new ArrayList<>();
	private List<NewsEntity> newsEntitiesParvane=new ArrayList<>();
	private List<NewsEntity> newsEntitiesGovahiname=new ArrayList<>();
	private List<UserEntity> userEntities=new ArrayList<>();
	private List<Shekayat1> shekayat1s=new ArrayList<>();
	private List<Shekayat1> shekayat1s2=new ArrayList<>();
	
    private long onlineUser;

	@Override
	public List<BrandEntity> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<BrandEntity> brandList) {
		this.brandList = brandList;
	}

	@Override
	public long getOnlineUser() {
		return onlineUser;
	}

	@Override
	public void setOnlineUser(long onlineUser) {
		this.onlineUser += onlineUser;
	}

	@Override
	public List<MerchantEntity> getMerchantList() {
		return merchantList;
	}

	public void setMerchantList(List<MerchantEntity> merchantByRasteList) {
		this.merchantList = merchantByRasteList;
	}
	@Override
	public List<MerchantEntity> getMerchantMobileList() {
		return merchantMobileList;
	}

	public void setMerchantMobileList(List<MerchantEntity> merchantMobileList) {
		this.merchantMobileList = merchantMobileList;
	}
	@Override
	public List<MerchantEntity> getMerchantKhanegiList() {
		return merchantKhanegiList;
	}

	public void setMerchantKhanegiList(List<MerchantEntity> merchantKhanegiList) {
		this.merchantKhanegiList = merchantKhanegiList;
	}
	@Override
	public List<MerchantEntity> getMerchantCarList() {
		return merchantCarList;
	}

	public void setMerchantCarList(List<MerchantEntity> merchantCarList) {
		this.merchantCarList = merchantCarList;
	}
	@Override
	public List<MerchantEntity> getMerchantMusicList() {
		return merchantMusicList;
	}

	public void setMerchantMusicList(List<MerchantEntity> merchantMusicList) {
		this.merchantMusicList = merchantMusicList;
	}
	@Override
	public List<MerchantEntity> getMerchantElecList() {
		return merchantElecList;
	}

	public void setMerchantElecList(List<MerchantEntity> merchantElecList) {
		this.merchantElecList = merchantElecList;
	}
	@Override
	public List<MerchantEntity> getMerchantCamList() {
		return merchantCamList;
	}

	public void setMerchantCamList(List<MerchantEntity> merchantCamList) {
		this.merchantCamList = merchantCamList;
	}
	@Override
	public List<MerchantEntity> getMerchantCctvList() {
		return merchantCctvList;
	}

	public void setMerchantCctvList(List<MerchantEntity> merchantCctvList) {
		this.merchantCctvList = merchantCctvList;
	}
	@Override
	public List<MerchantEntity> getMerchantCdList() {
		return merchantCdList;
	}

	public void setMerchantCdList(List<MerchantEntity> merchantCdList) {
		this.merchantCdList = merchantCdList;
	}
	@Override
	public List<SliderEntity> getSliderList() {
		return sliderList;
	}
	public void setSliderList(List<SliderEntity> sliderList) {
		this.sliderList = sliderList;
	}
	
	
	
	@Override
	public List<MojtameEntity> getMojtameEntities() {
		return mojtameEntities;
	}

	public void setMojtameEntities(List<MojtameEntity> mojtameEntities) {
		this.mojtameEntities = mojtameEntities;
	}

	@Override
	public List<MerchantAddresEntity> getMerchantAddresList() {
		return merchantAddresList;
	}

	public void setMerchantAddresList(List<MerchantAddresEntity> merchantAddresList) {
		this.merchantAddresList = merchantAddresList;
	}
	
	
	@Override
	public List<NaghdOBaresiEntity> getNaghdOBaresiEntities() {
		return naghdOBaresiEntities;
	}

	public void setNaghdOBaresiEntities(List<NaghdOBaresiEntity> naghdOBaresiEntities) {
		this.naghdOBaresiEntities = naghdOBaresiEntities;
	}
	
	
	@Override
	public List<NewsEntity> getNewsEntities() {
		return newsEntities;
	}

	public void setNewsEntities(List<NewsEntity> newsEntities) {
		this.newsEntities = newsEntities;
	}
	
	
	@Override
	public List<NewsEntity> getNewsEntitiesImportant() {
		return newsEntitiesImportant;
	}

	public void setNewsEntitiesImportant(List<NewsEntity> newsEntitiesImportant) {
		this.newsEntitiesImportant = newsEntitiesImportant;
	}

	
	
	@Override
	public List<NewsEntity> getNewsEntitiesVeryImportant() {
		return newsEntitiesVeryImportant;
	}

	public void setNewsEntitiesVeryImportant(List<NewsEntity> newsEntitiesVeryImportant) {
		this.newsEntitiesVeryImportant = newsEntitiesVeryImportant;
	}
	
	
	
	
	
	@Override
	public List<NewsEntity> getNewsEntitiesParvane() {
		return newsEntitiesParvane;
	}

	public void setNewsEntitiesParvane(List<NewsEntity> newsEntitiesParvane) {
		this.newsEntitiesParvane = newsEntitiesParvane;
	}
	@Override
	public List<NewsEntity> getNewsEntitiesGovahiname() {
		return newsEntitiesGovahiname;
	}

	public void setNewsEntitiesGovahiname(List<NewsEntity> newsEntitiesGovahiname) {
		this.newsEntitiesGovahiname = newsEntitiesGovahiname;
	}
	@Override
	public List<UserEntity> getUserEntities() {
		return userEntities;
	}

	public void setUserEntities(List<UserEntity> userEntities) {
		this.userEntities = userEntities;
	}
	
	
	@Override
	public List<Shekayat1> getShekayat1s() {
		return shekayat1s;
	}

	public void setShekayat1s(List<Shekayat1> shekayat1s) {
		this.shekayat1s = shekayat1s;
	}
	
	
	@Override
	public List<Shekayat1> getShekayat1s2() {
		return shekayat1s2;
	}

	public void setShekayat1s2(List<Shekayat1> shekayat1s2) {
		this.shekayat1s2 = shekayat1s2;
	}

	@PostConstruct
	public void fillLists() {
		System.err.println("singletone started");
		for (MerchantEntity merchantEntity : merchantRegisterServiceLocal.findAllMErchantEntity()) {
			this.merchantList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("موبایل و لوازم جانبی")) {
			this.merchantMobileList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("صوتی و تصویری و خانگی")) {
			this.merchantKhanegiList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("صوتی و تصویری اتومبیل")) {
			this.merchantCarList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("آلات موسیقی")) {
			this.merchantMusicList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("قطعات الکترونیک")) {
			this.merchantElecList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("دوربین عکاسی و فیلم برداری")) {
			this.merchantCamList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("دوربین مدار بسته")) {
			this.merchantCctvList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("سی دی")) {
			this.merchantCdList.add(merchantEntity);
		}
		for (SliderEntity sliderEntity : sliderServiceLocal.findAllSlider()) {
			this.sliderList.add(sliderEntity);
		}
			this.merchantAddresList.addAll(merchantAddresServiceLocal.findAllAddres());
			try {
				this.brandList.addAll(addBrandServiceLocal.findAllBrands());
			} catch (Exception e) {
				this.brandList.addAll(null);
			}
			
			this.mojtameEntities.addAll(mojtameServiceLocal.findAllMojtame());
			this.naghdOBaresiEntities.addAll(naghdServiceLocal.findAllNaghd());
			this.newsEntities.addAll(newsServiceLocal.findAllNews());
			
			for (NewsEntity newsEntity : newsServiceLocal.findAllNews()) {
				if(newsEntity.isImportant()==true)
					this.newsEntitiesImportant.add(newsEntity);
			}
			for (NewsEntity newsEntity : newsServiceLocal.findAllNews()) {
				if(newsEntity.isVeryImportant()==true)
					this.newsEntitiesVeryImportant.add(newsEntity);
			}
			
			for (NewsEntity newsEntity : newsServiceLocal.findAllNews()) {
				if(newsEntity.isParvane()==true)
					this.newsEntitiesParvane.add(newsEntity);
			}
			
			for (NewsEntity newsEntity : newsServiceLocal.findAllNews()) {
				if(newsEntity.isGovahiname()==true)
					this.newsEntitiesGovahiname.add(newsEntity);
			}
			
			this.userEntities.addAll(userServiceLocal.findAllUsers());
			this.shekayat1s.addAll(shekayatServiceLocal.findAllShekayat());
			this.shekayat1s2.addAll(shekayatServiceLocal.findAllShekayatOrder());
			
	}

	@Schedule(hour = "*", minute = "*/9", persistent = false)
	@AccessTimeout(value = 4, unit = TimeUnit.SECONDS)
	public void ejra() {
		System.err.println("merchant filled");
		merchantList.clear();
		merchantMobileList.clear();
		merchantKhanegiList.clear();
		merchantCarList.clear();
		merchantMusicList.clear();
		merchantElecList.clear();
		merchantCamList.clear();
		merchantCctvList.clear();
		merchantCdList.clear();
		sliderList.clear();
		merchantAddresList.clear();
		brandList.clear();
		mojtameEntities.clear();
		naghdOBaresiEntities.clear();
		newsEntities.clear();
		newsEntitiesImportant.clear();
		newsEntitiesVeryImportant.clear();
		newsEntitiesParvane.clear();
		newsEntitiesGovahiname.clear();
		userEntities.clear();
		shekayat1s.clear();
		shekayat1s2.clear();
		for (MerchantEntity merchantEntity : merchantRegisterServiceLocal.findAllMErchantEntity()) {
			this.merchantList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("موبایل و لوازم جانبی")) {
			this.merchantMobileList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("صوتی و تصویری و خانگی")) {
			this.merchantKhanegiList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("صوتی و تصویری اتومبیل")) {
			this.merchantCarList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("آلات موسیقی")) {
			this.merchantMusicList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("قطعات الکترونیک")) {
			this.merchantElecList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("دوربین عکاسی و فیلم برداری")) {
			this.merchantCamList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("دوربین مدار بسته")) {
			this.merchantCctvList.add(merchantEntity);
		}
		for (MerchantEntity merchantEntity : merchantResultServiceLocal.findMerchantByRaste("سی دی")) {
			this.merchantCdList.add(merchantEntity);
		}
		for (SliderEntity sliderEntity : sliderServiceLocal.findAllSlider()) {
			this.sliderList.add(sliderEntity);
		}
		this.merchantAddresList.addAll(merchantAddresServiceLocal.findAllAddres());
		try {
			this.brandList.addAll(addBrandServiceLocal.findAllBrands());
		} catch (Exception e) {
			this.brandList.addAll(null);
		}
		this.mojtameEntities.addAll(mojtameServiceLocal.findAllMojtame());
		this.naghdOBaresiEntities.addAll(naghdServiceLocal.findAllNaghd());
		this.newsEntities.addAll(newsServiceLocal.findAllNews());
		for (NewsEntity newsEntity : newsServiceLocal.findAllNews()) {
			if(newsEntity.isImportant()==true)
				this.newsEntitiesImportant.add(newsEntity);
		}
		
		for (NewsEntity newsEntity : newsServiceLocal.findAllNews()) {
			if(newsEntity.isVeryImportant()==true)
				this.newsEntitiesVeryImportant.add(newsEntity);
		}
		for (NewsEntity newsEntity : newsServiceLocal.findAllNews()) {
			if(newsEntity.isParvane()==true)
				this.newsEntitiesParvane.add(newsEntity);
		}
		for (NewsEntity newsEntity : newsServiceLocal.findAllNews()) {
			if(newsEntity.isGovahiname()==true)
				this.newsEntitiesGovahiname.add(newsEntity);
		}
		this.userEntities.addAll(userServiceLocal.findAllUsers());
		this.shekayat1s.addAll(shekayatServiceLocal.findAllShekayat());
		this.shekayat1s2.addAll(shekayatServiceLocal.findAllShekayatOrder());
	}

}
