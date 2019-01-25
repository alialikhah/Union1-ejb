
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
  ////GENERAL
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long productId;
	@Column(name = "product_category", length = 200, nullable = true)
	private String productCategry;
	@Column(name = "product_model", length = 200, nullable = true)
	private String productModel;
	@Column(name = "product_brand", length = 200, nullable = true)
	private String productBrand;
	@Column(name = "product_description", length =5000, nullable = true)
	private String productDescription;
	@Column(name = "raste", length = 100, nullable = true)
	private String raste;
	
	@Lob
	@Column(name="product_img1" , nullable=true)
	private byte[] productImage1;
	@Lob
	@Column(name="product_img2" , nullable=true)
	private byte[] productImage2;
	@Lob
	@Column(name="product_img3" , nullable=true)
	private byte[] productImage3;
	///////////////////////////////////////////////////
	@Column(name = "ports", length = 200, nullable = true)
	private String ports;
	@Column(name = "net_mobile", length = 100, nullable = true)
	private String netMobile;//3g 4g
	@Column(name = "size", length = 100, nullable = true)
	private String size;
	@Column(name = "screen_size", length = 100, nullable = true)
	private String screenSize;
	@Column(name = "pixel", length = 100, nullable = true)
	private String pixel;
	@Column(name = "quality", length = 100, nullable = true)//hd fhd
	private String quality;
	@Column(name = "battery", length = 100, nullable = true)
	private String battery;
	@Column(name = "color", length = 100, nullable = true)
	private String color;
	@Column(name = "memory", length = 100, nullable = true)
	private String memory;
	@Column(name = "inner_memory", length = 100, nullable = true)
	private String innerMemory;
	@Column(name = "weight", length = 100, nullable = true)
	private String weight;
	@Column(name = "camera", length = 200, nullable = true)
	private String camera;
	@Column(name = "cpu", length = 100, nullable = true)
	private String cpu;
	@Column(name = "gpu", length = 100, nullable = true)
	private String gpu;
	@Column(name = "os", length = 100, nullable = true)
	private String os;
	@Column(name = "other", length = 1000, nullable = true)
	private String other;
	


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
	
	public String getPorts() {
		return ports;
	}
	public void setPorts(String ports) {
		this.ports = ports;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getPixel() {
		return pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getInnerMemory() {
		return innerMemory;
	}
	public void setInnerMemory(String innerMemory) {
		this.innerMemory = innerMemory;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public List<DedicatedEntity> getProductDedicate() {
		return productDedicate;
	}
	public void setProductDedicate(List<DedicatedEntity> productDedicate) {
		this.productDedicate = productDedicate;
	}
	public LastPricesEntity getPrice() {
		return price;
	}
	public void setPrice(LastPricesEntity price) {
		this.price = price;
	}

	public String getRaste() {
		return raste;
	}
	public void setRaste(String raste) {
		this.raste = raste;
	}
	public String getNetMobile() {
		return netMobile;
	}
	public void setNetMobile(String netMobile) {
		this.netMobile = netMobile;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductEntity))
			return false;
		ProductEntity productEntity=(ProductEntity) obj;
		return ((productEntity.productId==this.productId)||(productEntity.productBrand.equals(this.productBrand)||(productEntity.productCategry.equals(this.productCategry))));
	}
   
}