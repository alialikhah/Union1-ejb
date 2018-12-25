package dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;
@Entity
@Table(name="shekayat_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllShekayat" , query="SELECT a FROM Shekayat1 a"),
	@NamedQuery(name="findById" , query="SELECT u FROM Shekayat1 u WHERE u.shekayatId=:v_shekayatId"),
	@NamedQuery(name="findAllById2" , query="SELECT pp FROM Shekayat1 pp ORDER BY pp.shekayatId DESC"),

})
public class Shekayat1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shekayat_id")
	private long shekayatId;
	@Column(name = "shakiName", length = 100, nullable = true)
	private String shakiName;
	@Column(name = "shakiSsn", length = 100, nullable = true)
	private String shakiSsn;
	@Column(name = "shakiPhone", length = 100, nullable = true)
	private String shakiPhone;
	@Column(name = "shakiMobile", length = 100, nullable = true)
	private String shakiMobile;
	@Column(name = "shakiEmail", length = 100, nullable = true)
	private String shakiEmail;
	@Column(name = "shakiPostCode", length =100, nullable = true)
	private String shakiPostCode;
	@Column(name = "shakiAddres", length = 500, nullable = true)
	private String shakiAddres;
	@Column(name = "vahedeSenfiName", length = 100, nullable = true)
	private String vahedeSenfiName;
	@Column(name = "motesadiName", length = 100, nullable = true)
	private String motesadiName;
	@Column(name = "vahedeSenfiPhone", length = 100, nullable = true)
	private String vahedeSenfiPhone;
	@Column(name = "vahedeSenfiMobile", length = 100, nullable = true)
	private String vahedeSenfiMobile;
	@Column(name = "vahedeShenaseSenfi", length = 100, nullable = true)
	private String vahedeShenaseSenfi;
	@Column(name = "vahedeSenfiPostCode", length = 100, nullable = true)
	private String vahedeSenfiPostCode;
	@Column(name = "vahedeShenaseAddres", length = 500, nullable = true)
	private String vahedeShenaseAddres;
	@Column(name = "shekayatTitle", length = 100, nullable = true)
	private String shekayatTitle;
	@Column(name = "sharh", length = 5000, nullable = true)
	private String sharh;
	@Column(name = "shakiFactor", nullable = true)
	@Lob
	private byte[] shakiFactor;
	
	//after shekayat
	@Column(name = "vaziat", length = 5000, nullable = true)
	private String vaziat;
	@Column(name = "tarikh", length = 100 , nullable = true)
	private String tarikh;
	@Column(name = "shomare" , nullable = true)
	private long shomare;
	@Column(name = "checkO", nullable = true)
	private boolean checkO;
	@Column(name="date" , nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	public long getShekayatId() {
		return shekayatId;
	}
	public void setShekayatId(long shekayatId) {
		this.shekayatId = shekayatId;
	}

	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isCheckO() {
		return checkO;
	}
	public void setCheckO(boolean checkO) {
		this.checkO = checkO;
	}
	public String getShakiName() {
		return shakiName;
	}
	public void setShakiName(String shakiName) {
		this.shakiName = shakiName;
	}
	public String getShakiSsn() {
		return shakiSsn;
	}
	public void setShakiSsn(String shakiSsn) {
		this.shakiSsn = shakiSsn;
	}
	public String getShakiPhone() {
		return shakiPhone;
	}
	public void setShakiPhone(String shakiPhone) {
		this.shakiPhone = shakiPhone;
	}
	public String getShakiMobile() {
		return shakiMobile;
	}
	public void setShakiMobile(String shakiMobile) {
		this.shakiMobile = shakiMobile;
	}
	public String getShakiEmail() {
		return shakiEmail;
	}
	public void setShakiEmail(String shakiEmail) {
		this.shakiEmail = shakiEmail;
	}
	public String getShakiPostCode() {
		return shakiPostCode;
	}
	public void setShakiPostCode(String shakiPostCode) {
		this.shakiPostCode = shakiPostCode;
	}
	public String getShakiAddres() {
		return shakiAddres;
	}
	public void setShakiAddres(String shakiAddres) {
		this.shakiAddres = shakiAddres;
	}
	public String getVahedeSenfiName() {
		return vahedeSenfiName;
	}
	public void setVahedeSenfiName(String vahedeSenfiName) {
		this.vahedeSenfiName = vahedeSenfiName;
	}
	public String getMotesadiName() {
		return motesadiName;
	}
	public void setMotesadiName(String motesadiName) {
		this.motesadiName = motesadiName;
	}
	public String getVahedeSenfiPhone() {
		return vahedeSenfiPhone;
	}
	public void setVahedeSenfiPhone(String vahedeSenfiPhone) {
		this.vahedeSenfiPhone = vahedeSenfiPhone;
	}
	public String getVahedeSenfiMobile() {
		return vahedeSenfiMobile;
	}
	public void setVahedeSenfiMobile(String vahedeSenfiMobile) {
		this.vahedeSenfiMobile = vahedeSenfiMobile;
	}
	public String getVahedeShenaseSenfi() {
		return vahedeShenaseSenfi;
	}
	public void setVahedeShenaseSenfi(String vahedeShenaseSenfi) {
		this.vahedeShenaseSenfi = vahedeShenaseSenfi;
	}
	public String getVahedeSenfiPostCode() {
		return vahedeSenfiPostCode;
	}
	public void setVahedeSenfiPostCode(String vahedeSenfiPostCode) {
		this.vahedeSenfiPostCode = vahedeSenfiPostCode;
	}
	public String getVahedeShenaseAddres() {
		return vahedeShenaseAddres;
	}
	public void setVahedeShenaseAddres(String vahedeShenaseAddres) {
		this.vahedeShenaseAddres = vahedeShenaseAddres;
	}
	public String getShekayatTitle() {
		return shekayatTitle;
	}
	public void setShekayatTitle(String shekayatTitle) {
		this.shekayatTitle = shekayatTitle;
	}
	public String getSharh() {
		return sharh;
	}
	public void setSharh(String sharh) {
		this.sharh = sharh;
	}
	public byte[] getShakiFactor() {
		return shakiFactor;
	}
	public void setShakiFactor(byte[] shakiFactor) {
		this.shakiFactor = shakiFactor;
	}
	public String getVaziat() {
		return vaziat;
	}
	public void setVaziat(String vaziat) {
		this.vaziat = vaziat;
	}
	
	

	public String getTarikh() {
		return tarikh;
	}
	public void setTarikh(String tarikh) {
		this.tarikh = tarikh;
	}
	public long getShomare() {
		return shomare;
	}
	public void setShomare(long shomare) {
		this.shomare = shomare;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Shekayat1))
			return false;
		Shekayat1 shekayat1=(Shekayat1) obj;
		return (shekayat1.shekayatId== this.shekayatId);
	}
	
	
}
