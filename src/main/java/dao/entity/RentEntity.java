package dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

@Entity
@Table(name = "rent_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({ 
@NamedQuery(name = "findAllRent", query = "SELECT a FROM RentEntity a"),
@NamedQuery(name = "findRentById", query = "SELECT i FROM RentEntity i WHERE i.rentId=:v_rentId"),
})
public class RentEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rent_id")
	private long rentId;
	@Column(name = "rentType", nullable = true, length = 100)
	private String rentType;

	@Column(name = "homeType", nullable = true, length = 100)
	private String homeType;

	@Column(name = "address", nullable = true, length = 500)
	private String address;

	@Column(name = "vage", nullable = true, length = 100)
	private String vage;

	@Column(name = "mogeiat", nullable = true, length = 100)
	private String mogeiat;

	@Column(name = "tedadTabage", nullable = true)
	private int tedadTabage;

	@Column(name = "tedadVahed", nullable = true)
	private int tedadVahed;

	@Column(name = "vadieeMoney", nullable = true)
	private int vadieeMoney;

	@Column(name = "ejareMony", nullable = true)
	private int ejareMony;

	@Column(name = "emkanat", nullable = true, length = 200)
	private String emkanat;

	@Column(name = "vaziatSanad", nullable = true, length = 100)
	private String vaziatSanad;

	@Column(name = "senBana", nullable = true)
	private int senBana;

	@Column(name = "masahat", nullable = true)
	private int masahat;

	@Column(name = "vaziatMelk", nullable = true)
	private String vaziatMelk;

	@Column(name = "description", nullable = true)
	private String description;

	@Column(name = "parvane", nullable = true)
	private boolean parvane;

	@Column(name = "etehadieName", nullable = true, length = 200)
	private String etehadieName;

	@Column(name = "phone", nullable = true)
	private String phone;

	@Lob
	@Column(name = "pic1", nullable = true)
	private byte[] pic1;

	@Column(name = "show")
	private boolean show;

	public long getRentId() {
		return rentId;
	}

	public void setRentId(long rentId) {
		this.rentId = rentId;
	}

	public String getRentType() {
		return rentType;
	}

	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public String getHomeType() {
		return homeType;
	}

	public void setHomeType(String homeType) {
		this.homeType = homeType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVage() {
		return vage;
	}

	public void setVage(String vage) {
		this.vage = vage;
	}

	public String getMogeiat() {
		return mogeiat;
	}

	public void setMogeiat(String mogeiat) {
		this.mogeiat = mogeiat;
	}

	public int getTedadTabage() {
		return tedadTabage;
	}

	public void setTedadTabage(int tedadTabage) {
		this.tedadTabage = tedadTabage;
	}

	public int getTedadVahed() {
		return tedadVahed;
	}

	public void setTedadVahed(int tedadVahed) {
		this.tedadVahed = tedadVahed;
	}

	public int getVadieeMoney() {
		return vadieeMoney;
	}

	public void setVadieeMoney(int vadieeMoney) {
		this.vadieeMoney = vadieeMoney;
	}

	public int getEjareMony() {
		return ejareMony;
	}

	public void setEjareMony(int ejareMony) {
		this.ejareMony = ejareMony;
	}

	public String getEmkanat() {
		return emkanat;
	}

	public void setEmkanat(String emkanat) {
		this.emkanat = emkanat;
	}

	public String getVaziatSanad() {
		return vaziatSanad;
	}

	public void setVaziatSanad(String vaziatSanad) {
		this.vaziatSanad = vaziatSanad;
	}

	public int getSenBana() {
		return senBana;
	}

	public void setSenBana(int senBana) {
		this.senBana = senBana;
	}

	public int getMasahat() {
		return masahat;
	}

	public void setMasahat(int masahat) {
		this.masahat = masahat;
	}

	public String getVaziatMelk() {
		return vaziatMelk;
	}

	public void setVaziatMelk(String vaziatMelk) {
		this.vaziatMelk = vaziatMelk;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isParvane() {
		return parvane;
	}

	public void setParvane(boolean parvane) {
		this.parvane = parvane;
	}

	public String getEtehadieName() {
		return etehadieName;
	}

	public void setEtehadieName(String etehadieName) {
		this.etehadieName = etehadieName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte[] getPic1() {
		return pic1;
	}

	public void setPic1(byte[] pic1) {
		this.pic1 = pic1;
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof RentEntity))
			return false;
		RentEntity rentEntity = (RentEntity) obj;
		return (rentEntity.rentId == this.rentId);
	}

}
