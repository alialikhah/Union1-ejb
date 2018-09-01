package dao.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;
@Entity
@Table(name="commercial_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllCommercial" , query="SELECT a FROM CommercialEntity a"),
	@NamedQuery(name="findCommercialByMerchant" , query="SELECT i FROM CommercialEntity i WHERE i.merchantcom=:v_merchantcom"),
	@NamedQuery(name="findCommercialById" , query="SELECT i FROM CommercialEntity i WHERE i.commercialId=:v_commercialId"),
	
})
public class CommercialEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "commercialpictures_id")
	private long commercialId;
	@Column(name = "commercial_picture", nullable = true)
	@Lob
	private byte[] commercialPicture;
	@Column(name = "comm_title", nullable = true , length=100)
	private String commercialTitle;
	
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "merchant_commercial")
    private MerchantEntity merchantcom;
	
	public long getCommercialPicturesId() {
		return commercialId;
	}



	public void setCommercialPicturesId(long commercialId) {
		this.commercialId = commercialId;
	}







	public byte[] getCommercialPicture() {
		return commercialPicture;
	}



	public void setCommercialPicture(byte[] commercialPicture) {
		this.commercialPicture = commercialPicture;
	}



	public String getCommercialTitle() {
		return commercialTitle;
	}



	public void setCommercialTitle(String commercialTitle) {
		this.commercialTitle = commercialTitle;
	}



	public MerchantEntity getMerchantcom() {
		return merchantcom;
	}



	public void setMerchantcom(MerchantEntity merchantcom) {
		this.merchantcom = merchantcom;
	}



	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CommercialEntity))
			return false;
		CommercialEntity commercialPictures=(CommercialEntity) obj;
		return ((commercialPictures.commercialId==this.commercialId)||(commercialPictures.merchantcom.equals(this.merchantcom)));
	}
	
	

}
