
package dao.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

/**
 * Entity implementation class for Entity: ProductEntity
 *
 */
@Entity
@Table(name="product_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllProduct" , query="SELECT p FROM ProductEntity p"),
	@NamedQuery(name="findProductById" , query="SELECT i FROM ProductEntity i WHERE i.productId=:v_productId"),
	@NamedQuery(name="findAllProductByBrand" , query="SELECT pp FROM ProductEntity pp WHERE pp.productBrand=:v_productBrand AND pp.productCategry=:v_productCategry ORDER BY pp.productId DESC"),
	@NamedQuery(name="findAllProductByBrandOnly" , query="SELECT pp FROM ProductEntity pp WHERE pp.productBrand=:v_productBrand"),

})
public class ProductEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long productId;
	@Column(name = "product_name", length = 200, nullable = true)
	private String productName;
	@Column(name = "product_title", length = 200, nullable = true)
	private String productTitle;
	@Column(name = "product_description", length =5000, nullable = true)
	private String productDescription;
	@Column(name = "product_category", length = 200, nullable = true)
	private String productCategry;
	@Column(name = "product_model", length = 200, nullable = true)
	private String productModel;
	@Column(name = "product_brand", length = 200, nullable = true)
	private String productBrand;
	@Lob
	@Column(name="product_img1" , nullable=true)
	private byte[] productImage1;
	@Lob
	@Column(name="product_img2" , nullable=true)
	private byte[] productImage2;
	@Lob
	@Column(name="product_img3" , nullable=true)
	private byte[] productImage3;
	@Lob
	@Column(name="product_img4" , nullable=true)
	private byte[] productImage4;
	@Lob
	@Column(name="product_img5" , nullable=true)
	private byte[] productImage5;
	


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
	private List<DedicatedEntity> productDedicate = new ArrayList<>();
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_price" , unique=true)
    private LastPricesEntity price;
	
	
	public ProductEntity() {
		super();
	}   
	public long getProductId() {
		return this.productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}   
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}   
	public String getProductTitle() {
		return this.productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}   
	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}   
	public String getProductCategry() {
		return this.productCategry;
	}

	public void setProductCategry(String productCategry) {
		this.productCategry = productCategry;
	}   	
	
	
	public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	
	
	public byte[] getProductImage1() {
		return productImage1;
	}
	public void setProductImage1(byte[] productImage1) {
		this.productImage1 = productImage1;
	}
	public byte[] getProductImage2() {
		return productImage2;
	}
	public void setProductImage2(byte[] productImage2) {
		this.productImage2 = productImage2;
	}
	public byte[] getProductImage3() {
		return productImage3;
	}
	public void setProductImage3(byte[] productImage3) {
		this.productImage3 = productImage3;
	}
	public byte[] getProductImage4() {
		return productImage4;
	}
	public void setProductImage4(byte[] productImage4) {
		this.productImage4 = productImage4;
	}
	public byte[] getProductImage5() {
		return productImage5;
	}
	public void setProductImage5(byte[] productImage5) {
		this.productImage5 = productImage5;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductEntity))
			return false;
		ProductEntity productEntity=(ProductEntity) obj;
		return ((productEntity.productId==this.productId)||(productEntity.productBrand.equals(this.productBrand)||(productEntity.productCategry.equals(this.productCategry))));
	}
   
}