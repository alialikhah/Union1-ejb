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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;
@Entity
@Table(name="lastprices_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllLastPricesEntity" , query="SELECT mm FROM LastPricesEntity mm"),
})
public class LastPricesEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lastprices_id")
	private long lastPricesId;
	@Column(name="lastprice" , nullable=true , length=20)
	private long lastPrice;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pricedate" , nullable=true)
	private Date priceDate;
	
/*	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_price" , unique=true)
    private ProductEntity productPrice;*/
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "price")
	private List<ProductEntity> productEntity = new ArrayList<>();

	public long getLastPricesId() {
		return lastPricesId;
	}

	public void setLastPricesId(long lastPricesId) {
		this.lastPricesId = lastPricesId;
	}

	public long getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(long lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Date getPriceDate() {
		return priceDate;
	}

	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof LastPricesEntity))
			return false;
		LastPricesEntity lastPricesEntity=(LastPricesEntity) obj;
		return (lastPricesEntity.lastPricesId==this.lastPricesId);
	}

}
