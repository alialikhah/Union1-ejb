package dao.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

/**
 * Entity implementation class for Entity: MerchantAddres
 *
 */
@Entity
@Table(name="merchamtaddr_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllMerchantAddres" , query="SELECT mm FROM MerchantAddresEntity mm"),
	@NamedQuery(name="findMerchantAddres" , query="SELECT i FROM MerchantAddresEntity i WHERE i.merchantaddr=:v_merchantaddr"),
})
public class MerchantAddresEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "merchantaddr_id")
	private long merchantAddresId;
	@Column(name = "merchant_width", nullable = true)
	private double merchandWidth;
	@Column(name = "merchant_height", nullable = true)
	private double merchantHeight;
	@Column(name = "merchant_area", length = 200, nullable = true)
	private String merchantArea;
	@Column(name = "merchant_state", length = 200, nullable = true)
	private String merchantState;
	@Column(name = "merchant_city", length = 200, nullable = true)
	private String merchantCity;
	
	@Column(name="merchant_postaddres" , nullable=true , length=300)
	private String merchantPostAddres;
	
	@Column(name="merchant_postcode" , nullable=true , length=50)
	private String merchantPostCode;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "merchant_addres" , unique=true)
    private MerchantEntity merchantaddr;
	
	public String getMerchantPostCode() {
		return merchantPostCode;
	}

	public void setMerchantPostCode(String merchantPostCode) {
		this.merchantPostCode = merchantPostCode;
	}

	private static final long serialVersionUID = 1L;
	
	
	
	


	public MerchantEntity getMerchantaddr() {
		return merchantaddr;
	}

	public void setMerchantaddr(MerchantEntity merchantaddr) {
		this.merchantaddr = merchantaddr;
	}

	public MerchantAddresEntity() {
		super();
	}

	public long getMerchantAddresId() {
		return merchantAddresId;
	}

	public void setMerchantAddresId(long merchantAddresId) {
		this.merchantAddresId = merchantAddresId;
	}

	public double getMerchandWidth() {
		return merchandWidth;
	}

	public void setMerchandWidth(double merchandWidth) {
		this.merchandWidth = merchandWidth;
	}

	public double getMerchantHeight() {
		return merchantHeight;
	}

	public void setMerchantHeight(double merchantHeight) {
		this.merchantHeight = merchantHeight;
	}

	public String getMerchantArea() {
		return merchantArea;
	}

	public void setMerchantArea(String merchantArea) {
		this.merchantArea = merchantArea;
	}



	public String getMerchantPostAddres() {
		return merchantPostAddres;
	}

	public void setMerchantPostAddres(String merchantPostAddres) {
		this.merchantPostAddres = merchantPostAddres;
	}

	public String getMerchantState() {
		return merchantState;
	}

	public void setMerchantState(String merchantState) {
		this.merchantState = merchantState;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MerchantAddresEntity))
			return false;
		MerchantAddresEntity merchantAddresEntity=(MerchantAddresEntity) obj;
		return ((merchantAddresEntity.merchantAddresId==this.merchantAddresId)||(merchantAddresEntity.merchantaddr.equals(this.merchantaddr)));
	}
  

   
}
