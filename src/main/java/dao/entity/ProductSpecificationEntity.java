package dao.entity;

import java.io.Serializable;

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

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;
@Entity
@Table(name="productspecification_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllProductSpecificationEntity" , query="SELECT p FROM ProductSpecificationEntity p"),
	@NamedQuery(name="findProductSpecificationEntityById" , query="SELECT i FROM ProductSpecificationEntity i WHERE i.productSpeId=:v_productSpeId"),
})
public class ProductSpecificationEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productspe_id")
	private long productSpeId;
	@Column(name = "weight_product", length = 50, nullable = true)
	private String weight;
	@Column(name = "height_product", length = 50, nullable = true)
	private String height;
	@Column(name = "width_product", length = 50, nullable = true)
	private String width;
	@Column(name = "made_product", length = 50, nullable = true)
	private String made;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "dedicate_producrspe",unique=true)
    private DedicatedEntity dedicate;
	
	
	public long getProductSpeId() {
		return productSpeId;
	}
	public void setProductSpeId(long productSpeId) {
		this.productSpeId = productSpeId;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductSpecificationEntity))
			return false;
		ProductSpecificationEntity productSpecificationEntity=(ProductSpecificationEntity) obj;
		return (productSpecificationEntity.productSpeId==this.productSpeId);
	}

}
