package dao.entity;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

@Entity
@Table(name = "specialpro_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({ @NamedQuery(name = "findAllSpecialProduct", query = "SELECT d FROM SpecialProductEntity d"),
})
public class SpecialProductEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "special_id")
	private long specialProductId;

	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "dedicate_special")
	private DedicatedEntity dedicate;
	
	
	@Column(name = "special_price", nullable = true)
	private long spacialPrice;
	@Column(name = "special_time", nullable = true)
	@Temporal(TemporalType.TIME)
	private Date specialTime;
	@Column(name = "special_desc", nullable = true,length=100)
	private String specialDescription;
	public long getSpecialProductId() {
		return specialProductId;
	}
	public void setSpecialProductId(long specialProductId) {
		this.specialProductId = specialProductId;
	}
	public DedicatedEntity getDedicate() {
		return dedicate;
	}
	public void setDedicate(DedicatedEntity dedicate) {
		this.dedicate = dedicate;
	}
	public long getSpacialPrice() {
		return spacialPrice;
	}
	public void setSpacialPrice(long spacialPrice) {
		this.spacialPrice = spacialPrice;
	}
	public Date getSpecialTime() {
		return specialTime;
	}
	public void setSpecialTime(Date specialTime) {
		this.specialTime = specialTime;
	}
	public String getSpecialDescription() {
		return specialDescription;
	}
	public void setSpecialDescription(String specialDescription) {
		this.specialDescription = specialDescription;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SpecialProductEntity))
			return false;
		SpecialProductEntity specialProductEntity=(SpecialProductEntity) obj;
		return (specialProductEntity.specialProductId==this.specialProductId);
	}
	
}
