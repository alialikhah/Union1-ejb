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
	@Inject
	private RentServiceLocal rentServiceLocal;
	@Inject
	private HomeServiceLocal homeServiceLocal;
	@Inject
	private ProductServiceLocal productServiceLocal;
	@Inject
	private DedicatedProductServiceLocal dedicatedProductServiceLocal;
	
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
	private List<RentEntity> rentEntities=new ArrayList<>();
	private List<MerchantEntity> merchantEntitiesGold=new ArrayList<>();
	private List<MerchantEntity> merchantListGold = new ArrayList<>();
	private List<MerchantEntity> merchantMobileListGold = new ArrayList<>();
	private List<MerchantEntity> merchantKhanegiListGold = new ArrayList<>();
	private List<MerchantEntity> merchantCarListGold = new ArrayList<>();
	private List<MerchantEntity> merchantMusicListGold = new ArrayList<>();
	private List<MerchantEntity> merchantElecListGold = new ArrayList<>();
	private List<MerchantEntity> merchantCamListGold = new ArrayList<>();
	private List<MerchantEntity> merchantCctvListGold = new ArrayList<>();
	private List<MerchantEntity> merchantCdListGold = new ArrayList<>();
	private HomeEntity homeEntity;
	private List<ProductEntity> productEntities=new ArrayList<>();
	private List<DedicatedEntity> dedicatedEntities=new ArrayList<>();
    private long onlineUser;
    private List<MerchantEntity> merchantListSilver=new ArrayList<>();
    
    
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
	
	
	@Override
	public List<RentEntity> getRentEntities() {
		return rentEntities;
	}

	public void setRentEntities(List<RentEntity> rentEntities) {
		this.rentEntities = rentEntities;
	}
	
	@Override
	public List<MerchantEntity> getMerchantListGold() {
		return merchantListGold;
	}

	public void setMerchantListGold(List<MerchantEntity> merchantListGold) {
		this.merchantListGold = merchantListGold;
	}
	@Override
	public List<MerchantEntity> getMerchantMobileListGold() {
		return merchantMobileListGold;
	}

	public void setMerchantMobileListGold(List<MerchantEntity> merchantMobileListGold) {
		this.merchantMobileListGold = merchantMobileListGold;
	}
	@Override
	public List<MerchantEntity> getMerchantKhanegiListGold() {
		return merchantKhanegiListGold;
	}

	public void setMerchantKhanegiListGold(List<MerchantEntity> merchantKhanegiListGold) {
		this.merchantKhanegiListGold = merchantKhanegiListGold;
	}
	@Override
	public List<MerchantEntity> getMerchantCarListGold() {
		return merchantCarListGold;
	}

	public void setMerchantCarListGold(List<MerchantEntity> merchantCarListGold) {
		this.merchantCarListGold = merchantCarListGold;
	}
	@Override
	public List<MerchantEntity> getMerchantMusicListGold() {
		return merchantMusicListGold;
	}

	public void setMerchantMusicListGold(List<MerchantEntity> merchantMusicListGold) {
		this.merchantMusicListGold = merchantMusicListGold;
	}
	@Override
	public List<MerchantEntity> getMerchantElecListGold() {
		return merchantElecListGold;
	}

	public void setMerchantElecListGold(List<MerchantEntity> merchantElecListGold) {
		this.merchantElecListGold = merchantElecListGold;
	}
	@Override
	public List<MerchantEntity> getMerchantCamListGold() {
		return merchantCamListGold;
	}

	public void setMerchantCamListGold(List<MerchantEntity> merchantCamListGold) {
		this.merchantCamListGold = merchantCamListGold;
	}
	@Override
	public List<MerchantEntity> getMerchantCctvListGold() {
		return merchantCctvListGold;
	}

	public void setMerchantCctvListGold(List<MerchantEntity> merchantCctvListGold) {
		this.merchantCctvListGold = merchantCctvListGold;
	}
	
	

	@Override
	public List<MerchantEntity> getMerchantCdListGold() {
		return merchantCdListGold;
	}

	public void setMerchantCdListGold(List<MerchantEntity> merchantCdListGold) {
		this.merchantCdListGold = merchantCdListGold;
	}
	
	
    @Override
	public List<MerchantEntity> getMerchantEntitiesGold() {
		return merchantEntitiesGold;
	}

	public void setMerchantEntitiesGold(List<MerchantEntity> merchantEntitiesGold) {
		this.merchantEntitiesGold = merchantEntitiesGold;
	}
	
	
	
	@Override
	public HomeEntity getHomeEntity() {
		return homeEntity;
	}

	public void setHomeEntity(HomeEntity homeEntity) {
		this.homeEntity = homeEntity;
	}
	
	
	
	@Override
	public List<ProductEntity> getProductEntities() {
		return productEntities;
	}

	public void setProductEntities(List<ProductEntity> productEntities) {
		this.productEntities = productEntities;
	}
	
	
	@Override
	public List<DedicatedEntity> getDedicatedEntities() {
		return dedicatedEntities;
	}

	public void setDedicatedEntities(List<DedicatedEntity> dedicatedEntities) {
		this.dedicatedEntities = dedicatedEntities;
	}
	
	
	@Override
	public List<MerchantEntity> getMerchantListSilver() {
		return merchantListSilver;
	}

	public void setMerchantListSilver(List<MerchantEntity> merchantListSilver) {
		this.merchantListSilver = merchantListSilver;
	}

	@PostConstruct
	public void fillLists() {
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
			this.rentEntities.addAll(rentServiceLocal.findAllRent());
			this.merchantEntitiesGold.addAll(merchantRegisterServiceLocal.findAllMerchantsByGroup("طلایی"));
			this.merchantListSilver.addAll(merchantRegisterServiceLocal.findAllMerchantsByGroup("نقره ای"));
			this.productEntities.addAll(productServiceLocal.findAllProducts());
			try {
				this.dedicatedEntities.addAll(dedicatedProductServiceLocal.findAllDedicatedProducts());
			} catch (Exception e) {
				System.err.println("dedicate error");
			}
			
			
			for (MerchantEntity merchantEntity : merchantEntitiesGold) {
				if ((merchantEntity.getMerchantRaste().equals("موبایل و لوازم جانبی"))) {
					this.merchantMobileListGold.add(merchantEntity);
				}
			}
			
			for (MerchantEntity merchantEntity : merchantEntitiesGold) {
				if ((merchantEntity.getMerchantRaste().equals("صوتی و تصویری و خانگی"))) {
					this.merchantKhanegiListGold.add(merchantEntity);
				}
			}
			
			for (MerchantEntity merchantEntity : merchantEntitiesGold) {
				if ((merchantEntity.getMerchantRaste().equals("صوتی و تصویری اتومبیل"))) {
					this.merchantCarListGold.add(merchantEntity);
				}
			}
			
			for (MerchantEntity merchantEntity : merchantEntitiesGold) {
				if ((merchantEntity.getMerchantRaste().equals("آلات موسیقی"))) {
					this.merchantMusicListGold.add(merchantEntity);
				}
			}
			
			for (MerchantEntity merchantEntity : merchantEntitiesGold) {
				if ((merchantEntity.getMerchantRaste().equals("قطعات الکترونیک"))) {
					this.merchantElecListGold.add(merchantEntity);
				}
			}
			
			for (MerchantEntity merchantEntity : merchantEntitiesGold) {
				if ((merchantEntity.getMerchantRaste().equals("دوربین عکاسی و فیلم برداری"))) {
					this.merchantCamListGold.add(merchantEntity);
				}
			}
			
			for (MerchantEntity merchantEntity : merchantEntitiesGold) {
				if ((merchantEntity.getMerchantRaste().equals("دوربین مدار بسته"))) {
					this.merchantCctvListGold.add(merchantEntity);
				}
			}
			
			for (MerchantEntity merchantEntity : merchantEntitiesGold) {
				if ((merchantEntity.getMerchantRaste().equals("سی دی"))) {
					this.merchantCdListGold.add(merchantEntity);
				}
			}
			this.homeEntity=homeServiceLocal.findHomeEntity(1);

			
			
	}

	@Schedule(hour = "*", minute = "*/20", persistent = false)
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
		rentEntities.clear();
		merchantEntitiesGold.clear();
		merchantCamListGold.clear();
		merchantCarListGold.clear();
		merchantCctvListGold.clear();
		merchantCdListGold.clear();
		merchantElecListGold.clear();
		merchantKhanegiListGold.clear();
		merchantMobileListGold.clear();
		merchantMusicListGold.clear();
		productEntities.clear();
		dedicatedEntities.clear();
		merchantListSilver.clear();
		
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
		this.rentEntities.addAll(rentServiceLocal.findAllRent());
		
		this.merchantEntitiesGold.addAll(merchantRegisterServiceLocal.findAllMerchantsByGroup("طلایی"));
		this.merchantListSilver.addAll(merchantRegisterServiceLocal.findAllMerchantsByGroup("نقره ای"));
		this.productEntities.addAll(productServiceLocal.findAllProducts());

		
		for (MerchantEntity merchantEntity : merchantEntitiesGold) {
			if ((merchantEntity.getMerchantRaste().equals("موبایل و لوازم جانبی"))) {
				this.merchantMobileListGold.add(merchantEntity);
			}
		}
		
		for (MerchantEntity merchantEntity : merchantEntitiesGold) {
			if ((merchantEntity.getMerchantRaste().equals("صوتی و تصویری و خانگی"))) {
				this.merchantKhanegiListGold.add(merchantEntity);
			}
		}
		
		for (MerchantEntity merchantEntity : merchantEntitiesGold) {
			if ((merchantEntity.getMerchantRaste().equals("صوتی و تصویری اتومبیل"))) {
				this.merchantCarListGold.add(merchantEntity);
			}
		}
		
		for (MerchantEntity merchantEntity : merchantEntitiesGold) {
			if ((merchantEntity.getMerchantRaste().equals("آلات موسیقی"))) {
				this.merchantMusicListGold.add(merchantEntity);
			}
		}
		
		for (MerchantEntity merchantEntity : merchantEntitiesGold) {
			if ((merchantEntity.getMerchantRaste().equals("قطعات الکترونیک"))) {
				this.merchantElecListGold.add(merchantEntity);
			}
		}
		
		for (MerchantEntity merchantEntity : merchantEntitiesGold) {
			if ((merchantEntity.getMerchantRaste().equals("دوربین عکاسی و فیلم برداری"))) {
				this.merchantCamListGold.add(merchantEntity);
			}
		}
		
		for (MerchantEntity merchantEntity : merchantEntitiesGold) {
			if ((merchantEntity.getMerchantRaste().equals("دوربین مدار بسته"))) {
				this.merchantCctvListGold.add(merchantEntity);
			}
		}
		
		for (MerchantEntity merchantEntity : merchantEntitiesGold) {
			if ((merchantEntity.getMerchantRaste().equals("سی دی"))) {
				this.merchantCdListGold.add(merchantEntity);
			}
		}
		
		this.homeEntity=homeServiceLocal.findHomeEntity(1);
		try {
			this.dedicatedEntities.addAll(dedicatedProductServiceLocal.findAllDedicatedProducts());
		} catch (Exception e) {
			System.err.println("dedicate error");
		}
		
	}
	


}
