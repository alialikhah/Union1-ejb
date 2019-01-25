package dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

@Entity
@Table(name = "dedicated_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({ @NamedQuery(name = "findAllDedicatedEntity", query = "SELECT d FROM DedicatedEntity d ORDER BY d.dedicatedId DESC"),
		@NamedQuery(name = "findDedicatedEntityById", query = "SELECT dd FROM DedicatedEntity dd WHERE dd.dedicatedId=:v_dedicatedId"),
		@NamedQuery(name = "findAllProductDesc", query = "SELECT de FROM DedicatedEntity de ORDER BY de.popularity DESC"),
		@NamedQuery(name = "findDedicatedEntityByMerchant", query = "SELECT dd FROM DedicatedEntity dd WHERE dd.merchant=:v_merchant"), })
public class DedicatedEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dedicated_id")
	private long dedicatedId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "merchant_dedicate")
	private MerchantEntity merchant;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_dedicate")
	private ProductEntity product;

	@Column(name = "merchant_price", nullable = true)
	private long price;
	@Column(name = "popularity", nullable = true)
	private long popularity;
	@Column(name = "saled", nullable = true)
	private long saled;
	@Column(name = "old_price", nullable = true)
	private long oldPrice;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "dedicate")
	private List<ProductSpecificationEntity> productSpecificationEntity = new ArrayList<>();

	public MerchantEntity getMerchant() {
		return merchant;
	}

	public long getDedicatedId() {
		return dedicatedId;
	}

	public void setDedicatedId(long dedicatedId) {
		this.dedicatedId = dedicatedId;
	}

	public void setMerchant(MerchantEntity merchant) {
		this.merchant = merchant;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getPopularity() {
		return popularity;
	}

	public void setPopularity(long popularity) {
		this.popularity = popularity;
	}

	public long getSaled() {
		return saled;
	}

	public void setSaled(long saled) {
		this.saled = saled;
	}
	
	

	public long getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(long oldPrice) {
		this.oldPrice = oldPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof DedicatedEntity))
			return false;
		DedicatedEntity dedicatedEntity = (DedicatedEntity) obj;
		return ((dedicatedEntity.dedicatedId == this.dedicatedId) || (dedicatedEntity.price == this.price)
				|| (dedicatedEntity.popularity == this.popularity) || (dedicatedEntity.saled == this.saled)
				|| (dedicatedEntity.merchant.equals(this.merchant)));
	}

	@Override
	public String toString() {
		return "DedicatedEntity [dedicatedId=" + dedicatedId + ", merchant=" + merchant + ", product=" + product
				+ ", price=" + price + ", popularity=" + popularity + ", saled=" + saled
				+ ", productSpecificationEntity=" + productSpecificationEntity + "]";
	}

}
