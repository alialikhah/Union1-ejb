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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

@Entity
@Table(name="dedicatedbrand_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllDeicatedBrand" , query="SELECT d FROM BrandEntity d"),
	@NamedQuery(name="findBrandByName" , query="SELECT i FROM BrandEntity i WHERE i.brandName=:v_brandName"),
	@NamedQuery(name="findBrandById" , query="SELECT i FROM BrandEntity i WHERE i.deicatedBrandId=:v_deicatedBrandId"),
})
public class BrandEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="brand_id")
	private long deicatedBrandId;
	@Column(name = "brand_pic",nullable = true)
	@Lob
	private byte[] brandPic;
	@Column(name = "brand_name", nullable = true)
	private String brandName;

	

	
	public long getDeicatedBrandId() {
		return deicatedBrandId;
	}



	public void setDeicatedBrandId(long deicatedBrandId) {
		this.deicatedBrandId = deicatedBrandId;
	}






	public String getBrandName() {
		return brandName;
	}



	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}






	public byte[] getBrandPic() {
		return brandPic;
	}



	public void setBrandPic(byte[] brandPic) {
		this.brandPic = brandPic;
	}



	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BrandEntity))
			return false;
		BrandEntity deicatedBrandEntity=(BrandEntity) obj;
		return ((deicatedBrandEntity.deicatedBrandId==this.deicatedBrandId)||(deicatedBrandEntity.brandName.equals(this.brandName)));
	}
	

}
