package dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

/**
 * Entity implementation class for Entity: MerchantEntity
 *
 */
@Entity
@Table(name="merchant_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllMerchant" , query="SELECT m FROM MerchantEntity m ORDER BY m.merchantId DESC"),
	@NamedQuery(name="findMerchantById" , query="SELECT i FROM MerchantEntity i WHERE i.merchantId=:v_merchantId"),
	@NamedQuery(name="findMerchantByGroup" , query="SELECT i FROM MerchantEntity i WHERE i.merchantGroup=:v_merchantGroup ORDER BY i.merchantId DESC"),
	@NamedQuery(name="findMerchantBySsn" , query="SELECT i FROM MerchantEntity i WHERE i.merchantSsn=:v_merchantSsn"),
	@NamedQuery(name="findMerchantByShomarehPar" , query="SELECT i FROM MerchantEntity i WHERE i.shomarehParPaano=:v_shomarehParvande"),
	@NamedQuery(name="findMerchantByRaste" , query="SELECT i FROM MerchantEntity i WHERE i.merchantRaste=:v_merchantRaste"),
	@NamedQuery(name="findMerchantByShopNameEng" , query="SELECT i FROM MerchantEntity i WHERE i.merchantShopNameEng=:v_merchantShopNameEng"),
	@NamedQuery(name="findMerchantByShopNamePer" , query="SELECT i FROM MerchantEntity i WHERE i.merchantShopNamePer like :v_merchantShopNamePer"),

})
public class MerchantEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "merchant_id")
	private long merchantId;
	
	@Column(name = "merchant_name", length = 150, nullable = true)
	private String merchantName;
	
	@Column(name="merchant_family" , nullable=true , length=200)
	private String merchantFamily;
	
	@Column(name="merchant_shoar" , nullable=true , length=200)
	private String merchantShoar;
	
	@Column(name="merchant_pass" , nullable=true , length=150)
	private String merchantPass;
	
	@Column(name="merchant_phone" , nullable=true , length=150)
	private String merchantPhone;
	
	@Column(name="merchant_email" , nullable=true , length=150)
	private String merchantEmail;
	
	@Column(name="merchant_mobile" , nullable=true , length=150)
	private String merchantMobile;
	
	@Column(name="merchant_ssn" , nullable=true , length=150 )
	private String merchantSsn;
	
	@Column(name="merchant_group" , nullable=true , length=10)
	private String merchantGroup;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="merchant_birthday" , nullable=true)
	private Date merchantBirthDay;
	
	@Column(name="merchant_sailmanagername" , nullable=true , length=150)
	private String merchantSaliManagerName;
	
	@Column(name="merchant_sailmanagermobile" , nullable=true , length=150)
	private String merchantSailManagerMobile;
	
	@Column(name="merchant_interfacename" , nullable=true , length=200)
	private String merchantّInterfaceName;
	
	
	@Column(name="merchant_interfacemobile" , nullable=true , length=150)
	private String merchantInterfaceMobile;
	

	

	

	
	@Column(name="merchant_fax" , nullable=true , length=150)
	private String merchantFax;
	
	@Column(name="merchant_siteaddres" , nullable=true , length=150)
	private String merchantSiteAddres;
	
	@Column(name="merchant_telegramadrs" , nullable=true , length=200)
	private String merchantTelegramAddres;
	@Column(name="merchant_telegramnum" , nullable=true , length=200)
	private String merchantTelegramNumber;
	
	@Column(name="merchant_instagramAdrs" , nullable=true , length=200)
	private String merchantInstagramAddres;
	
	@Column(name="merchant_watsup" , nullable=true , length=200)
	private String merchantWatsup;
	
	@Column(name="merchant_twiter" , nullable=true , length=200)
	private String merchantTwiter;
	
	@Column(name="merchant_instagramnum" , nullable=true , length=200)
	private String merchantInstagramNumber;
	
	@Column(name="merchant_licensenumber" , nullable=true)
	private long merchantLicenseNumber;
	
	@Column(name="merchant_start" , nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date merchantStart;
	
	@Column(name="merchant_khatemedate" , nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date merchantKhateme;
	
	@Column(name="merchant_shopnameper" , nullable=true , length=150)
	private String merchantShopNamePer;
	
	@Column(name="merchant_shopnameeng" , nullable=true , length=150 , unique=true)
	private String merchantShopNameEng;
	
	@Column(name="merchant_mobasherat" , nullable=true)
	private boolean merchantMobasherat;
	
	@Column(name="merchant_mobashername" , nullable=true , length=200)
	private String merchantMobasherName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="merchant_mobasherdate" , nullable=true)
	private Date merchantMobasherDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="merchant_etebar" , nullable=true)
	private Date merchantEtebar;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="merchant_garardad" , nullable=true)
	private Date merchantGarardad;
	
	@Column(name="merchant_emark" , nullable=true)
	private boolean merchantEMark;
	
	@Column(name="merchant_picjavaz" , nullable=true)
	private boolean merchantPicJavaz;
	
	@Column(name="merchant_raste" , nullable=true , length=150)
	private String merchantRaste;
	
	
	@Column(name="merchant_etehadie" , nullable=true , length=150)
	private String merchantEtehadie;
	@Column(name="merchant_descri" , nullable=true , length=5000)
	private String merchantDescription;
	@Column(name="merchant_brands" , nullable=true , length=500)
	private String brands;
	@Column(name="merchant_shomareparpaano" , nullable=true)
	private long shomarehParPaano;
	@Column(name="merchant_shomareparunion" , nullable=true)
	private long shomarehParUnion;
	@Column(name="merchant_havelic" , nullable=true , length=200)
	private String haveLicenese;
	@Column(name="merchant_havemob" , nullable=true)
	private boolean haveMobasher;
	@Column(name="merchant_haveete" , nullable=true , length=100)
	private String haveEtebar;
	@Column(name="merchant_phoneshow" , nullable=true)
	private boolean phoneShow;
	@Column(name="merchant_faxshow" , nullable=true)
	private boolean faxShow;
	@Column(name="merchant_siteshow" , nullable=true)
	private boolean siteShow;
	@Column(name="merchant_instashow" , nullable=true)
	private boolean instagramShow;
	@Column(name="merchant_telegshow" , nullable=true)
	private boolean telegramShow;
	@Column(name="merchant_watsshow" , nullable=true)
	private boolean watsupShow;
	@Column(name="merchant_twitshow" , nullable=true)
	private boolean twiterShow;
	@Column(name="merchant_havelogo" , nullable=true)
	private boolean haveLogo;
	
	@Lob
	@Column(name="merchant_licenceImg" , nullable=true)
	private byte[] licenceImg;
	@Lob
	@Column(name="merchant_shopImg2" , nullable=true)
	private byte[] shopImg2;
	@Lob
	@Column(name="merchant_shopImg3" , nullable=true)
	private byte[] shopImg3;
	@Lob
	@Column(name="merchant_shopImg4" , nullable=true)
	private byte[] shopImg4;
	@Lob
	@Column(name="merchant_shopImg5" , nullable=true)
	private byte[] shopImg5;
	
	@Lob
	@Column(name="merchant_logo" , nullable=true)
	private byte[] logo;
	@Column(name="view_page" , nullable=true)
	private int viewPage;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "merchant")
	private List<DedicatedEntity> merchantDedicate = new ArrayList<>();
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "merchantaddr")
	private List<MerchantAddresEntity> merchantAddresEntities = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "merchantcom")
	private List<CommercialEntity> commercial = new ArrayList<>();
	
	
	
	
	private static final long serialVersionUID = 1L;

	public MerchantEntity() {
		super();
	}
	





	public Date getMerchantStart() {
		return merchantStart;
	}






	public void setMerchantStart(Date merchantStart) {
		this.merchantStart = merchantStart;
	}






	public Date getMerchantGarardad() {
		return merchantGarardad;
	}






	public void setMerchantGarardad(Date merchantGarardad) {
		this.merchantGarardad = merchantGarardad;
	}






	public boolean isPhoneShow() {
		return phoneShow;
	}






	public void setPhoneShow(boolean phoneShow) {
		this.phoneShow = phoneShow;
	}






	public boolean isFaxShow() {
		return faxShow;
	}






	public void setFaxShow(boolean faxShow) {
		this.faxShow = faxShow;
	}






	public boolean isSiteShow() {
		return siteShow;
	}






	public void setSiteShow(boolean siteShow) {
		this.siteShow = siteShow;
	}






	public boolean isInstagramShow() {
		return instagramShow;
	}






	public void setInstagramShow(boolean instagramShow) {
		this.instagramShow = instagramShow;
	}






	public boolean isTelegramShow() {
		return telegramShow;
	}






	public void setTelegramShow(boolean telegramShow) {
		this.telegramShow = telegramShow;
	}






	public boolean isWatsupShow() {
		return watsupShow;
	}






	public void setWatsupShow(boolean watsupShow) {
		this.watsupShow = watsupShow;
	}






	public boolean isTwiterShow() {
		return twiterShow;
	}






	public void setTwiterShow(boolean twiterShow) {
		this.twiterShow = twiterShow;
	}






	public String getHaveLicenese() {
		return haveLicenese;
	}






	public void setHaveLicenese(String haveLicenese) {
		this.haveLicenese = haveLicenese;
	}






	public boolean isHaveMobasher() {
		return haveMobasher;
	}






	public void setHaveMobasher(boolean haveMobasher) {
		this.haveMobasher = haveMobasher;
	}






	public String getHaveEtebar() {
		return haveEtebar;
	}






	public void setHaveEtebar(String haveEtebar) {
		this.haveEtebar = haveEtebar;
	}






	public byte[] getLicenceImg() {
		return licenceImg;
	}






	public String getMerchantWatsup() {
		return merchantWatsup;
	}






	public boolean isMerchantPicJavaz() {
		return merchantPicJavaz;
	}






	public void setMerchantPicJavaz(boolean merchantPicJavaz) {
		this.merchantPicJavaz = merchantPicJavaz;
	}






	public void setMerchantWatsup(String merchantWatsup) {
		this.merchantWatsup = merchantWatsup;
	}






	public String getMerchantTwiter() {
		return merchantTwiter;
	}






	public void setMerchantTwiter(String merchantTwiter) {
		this.merchantTwiter = merchantTwiter;
	}






	public String getMerchantInstagramNumber() {
		return merchantInstagramNumber;
	}






	public void setMerchantInstagramNumber(String merchantInstagramNumber) {
		this.merchantInstagramNumber = merchantInstagramNumber;
	}






	public Date getMerchantEtebar() {
		return merchantEtebar;
	}






	public void setMerchantEtebar(Date merchantEtebar) {
		this.merchantEtebar = merchantEtebar;
	}






	public void setLicenceImg(byte[] licenceImg) {
		this.licenceImg = licenceImg;
	}






	public byte[] getShopImg2() {
		return shopImg2;
	}






	public void setShopImg2(byte[] shopImg2) {
		this.shopImg2 = shopImg2;
	}






	public byte[] getShopImg3() {
		return shopImg3;
	}






	public void setShopImg3(byte[] shopImg3) {
		this.shopImg3 = shopImg3;
	}






	public String getMerchantTelegramNumber() {
		return merchantTelegramNumber;
	}






	public void setMerchantTelegramNumber(String merchantTelegramNumber) {
		this.merchantTelegramNumber = merchantTelegramNumber;
	}






	public byte[] getShopImg4() {
		return shopImg4;
	}






	public void setShopImg4(byte[] shopImg4) {
		this.shopImg4 = shopImg4;
	}






	public byte[] getShopImg5() {
		return shopImg5;
	}






	public void setShopImg5(byte[] shopImg5) {
		this.shopImg5 = shopImg5;
	}






	public long getMerchantLicenseNumber() {
		return merchantLicenseNumber;
	}



	public void setMerchantLicenseNumber(long merchantLicenseNumber) {
		this.merchantLicenseNumber = merchantLicenseNumber;
	}



	public String getBrands() {
		return brands;
	}



	public void setBrands(String brands) {
		this.brands = brands;
	}



	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantFamily() {
		return merchantFamily;
	}

	public void setMerchantFamily(String merchantFamily) {
		this.merchantFamily = merchantFamily;
	}

	public String getMerchantShoar() {
		return merchantShoar;
	}

	public void setMerchantShoar(String userName) {
		this.merchantShoar = userName;
	}

	public String getMerchantPass() {
		return merchantPass;
	}

	public void setMerchantPass(String merchantPass) {
		this.merchantPass = merchantPass;
	}

	public String getMerchantPhone() {
		return merchantPhone;
	}

	public void setMerchantPhone(String merchantPhone) {
		this.merchantPhone = merchantPhone;
	}

	public String getMerchantEmail() {
		return merchantEmail;
	}

	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}

	public String getMerchantMobile() {
		return merchantMobile;
	}

	public void setMerchantMobile(String merchantMobile) {
		this.merchantMobile = merchantMobile;
	}

	public String getMerchantSsn() {
		return merchantSsn;
	}

	public void setMerchantSsn(String merchantSsn) {
		this.merchantSsn = merchantSsn;
	}

	public String getMerchantGroup() {
		return merchantGroup;
	}

	public void setMerchantGroup(String merchantGroup) {
		this.merchantGroup = merchantGroup;
	}

	public Date getMerchantBirthDay() {
		return merchantBirthDay;
	}

	public void setMerchantBirthDay(Date merchantBirthDay) {
		this.merchantBirthDay = merchantBirthDay;
	}

	public String getMerchantSaliManagerName() {
		return merchantSaliManagerName;
	}

	public void setMerchantSaliManagerName(String merchantSaliManagerName) {
		this.merchantSaliManagerName = merchantSaliManagerName;
	}

	public String getMerchantSailManagerMobile() {
		return merchantSailManagerMobile;
	}

	public void setMerchantSailManagerMobile(String merchantSailManagerMobile) {
		this.merchantSailManagerMobile = merchantSailManagerMobile;
	}

	public String getMerchantّInterfaceName() {
		return merchantّInterfaceName;
	}

	public void setMerchantّInterfaceName(String merchantّInterfaceName) {
		this.merchantّInterfaceName = merchantّInterfaceName;
	}


	public String getMerchantInterfaceMobile() {
		return merchantInterfaceMobile;
	}

	public void setMerchantInterfaceMobile(String merchantInterfaceMobile) {
		this.merchantInterfaceMobile = merchantInterfaceMobile;
	}


	public String getMerchantFax() {
		return merchantFax;
	}

	public void setMerchantFax(String merchantFax) {
		this.merchantFax = merchantFax;
	}

	public String getMerchantSiteAddres() {
		return merchantSiteAddres;
	}

	public void setMerchantSiteAddres(String merchantSiteAddres) {
		this.merchantSiteAddres = merchantSiteAddres;
	}

	public String getMerchantTelegramAddres() {
		return merchantTelegramAddres;
	}

	public void setMerchantTelegramAddres(String merchantTelegram) {
		this.merchantTelegramAddres = merchantTelegram;
	}

	public String getMerchantInstagramAddres() {
		return merchantInstagramAddres;
	}

	public void setMerchantInstagramAddres(String merchantInstagram) {
		this.merchantInstagramAddres = merchantInstagram;
	}


	public Date getMerchantKhateme() {
		return merchantKhateme;
	}

	public void setMerchantKhateme(Date merchantCreditDate) {
		this.merchantKhateme = merchantCreditDate;
	}

	public String getMerchantShopNamePer() {
		return merchantShopNamePer;
	}

	public void setMerchantShopNamePer(String merchantShopNamePer) {
		this.merchantShopNamePer = merchantShopNamePer;
	}

	public String getMerchantShopNameEng() {
		return merchantShopNameEng;
	}

	public void setMerchantShopNameEng(String merchantShopNameEng) {
		this.merchantShopNameEng = merchantShopNameEng;
	}

	public boolean isMerchantMobasherat() {
		return merchantMobasherat;
	}

	public void setMerchantMobasherat(boolean merchantMobasherat) {
		this.merchantMobasherat = merchantMobasherat;
	}

	public String getMerchantMobasherName() {
		return merchantMobasherName;
	}

	public void setMerchantMobasherName(String merchantMobasherName) {
		this.merchantMobasherName = merchantMobasherName;
	}

	public Date getMerchantMobasherDate() {
		return merchantMobasherDate;
	}

	public void setMerchantMobasherDate(Date merchantMobasherDate) {
		this.merchantMobasherDate = merchantMobasherDate;
	}

	public boolean isMerchantEMark() {
		return merchantEMark;
	}

	public void setMerchantEMark(boolean merchantEMark) {
		this.merchantEMark = merchantEMark;
	}

	public String getMerchantRaste() {
		return merchantRaste;
	}

	public void setMerchantRaste(String merchantRaste) {
		this.merchantRaste = merchantRaste;
	}


	public String getMerchantEtehadie() {
		return merchantEtehadie;
	}

	public void setMerchantEtehadie(String merchantEtehadie) {
		this.merchantEtehadie = merchantEtehadie;
	}

	public List<DedicatedEntity> getMerchantDedicate() {
		return merchantDedicate;
	}

	public void setMerchantDedicate(List<DedicatedEntity> merchantDedicate) {
		this.merchantDedicate = merchantDedicate;
	}

	


	public String getMerchantDescription() {
		return merchantDescription;
	}

	public void setMerchantDescription(String merchantDescription) {
		this.merchantDescription = merchantDescription;
	}
	




	public long getShomarehParUnion() {
		return shomarehParUnion;
	}






	public void setShomarehParUnion(long shomarehParUnion) {
		this.shomarehParUnion = shomarehParUnion;
	}






	public boolean isHaveLogo() {
		return haveLogo;
	}






	public void setHaveLogo(boolean haveLogo) {
		this.haveLogo = haveLogo;
	}






	public byte[] getLogo() {
		return logo;
	}






	public void setLogo(byte[] logo) {
		this.logo = logo;
	}






	public long getShomarehParPaano() {
		return shomarehParPaano;
	}



	public void setShomarehParPaano(long shomarehParvande) {
		this.shomarehParPaano = shomarehParvande;
	}
	
	



	public int getViewPage() {
		return viewPage;
	}






	public void setViewPage(int viewPage) {
		this.viewPage = viewPage;
	}






	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MerchantEntity))
			return false;
		MerchantEntity merchantEntity=(MerchantEntity) obj;
		return ((merchantEntity.merchantId==this.merchantId)||(merchantEntity.merchantGroup.equals(this.merchantGroup))||(merchantEntity.merchantSsn.equals(this.merchantSsn))||(merchantEntity.shomarehParPaano==this.merchantLicenseNumber)||(merchantEntity.merchantRaste.equals(this.merchantRaste)||(merchantEntity.merchantShopNameEng.equals(this.merchantShopNameEng))));
	}
	
	
	
	
}