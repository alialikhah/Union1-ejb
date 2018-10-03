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
@Table(name="karjo_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllkarjo" , query="SELECT a FROM JobKarjoEntity a"),
})
public class JobKarjoEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "karjo_id")
	private long karjoId;
	@Column(name = "karjo_name", length = 150, nullable = true)
	private String karjoName;
	@Column(name = "karjo_ssn", length = 20, nullable = true)
	private String karjoSsn;
	@Column(name = "karjo_father", length = 150, nullable = true)
	private String karjoFather;
	@Column(name = "karjo_gender", length = 20, nullable = true)
	private String karjoGender;
	@Column(name = "karjo_city", length = 100, nullable = true)
	private String karjoCityName;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="karjo_birthday" , nullable=true)
	private Date karjoBirth;
	@Column(name = "karjo_phone", length = 20, nullable = true)
	private String karjoPhone;
	@Column(name = "karjo_mobile", length = 20, nullable = true)
	private String karjoMobile;
	@Column(name = "karjo_email", length = 100, nullable = true)
	private String karjoEmail;
	@Column(name = "karjo_field", length = 100, nullable = true)
	private String karjoField;
	@Column(name = "karjo_madrak", length = 100, nullable = true)
	private String karjoMadrak;
	@Column(name = "karjo_maharat", length = 100, nullable = true)	
	private String karjoMaharat;
	@Column(name = "karjo_noefaal", length = 200, nullable = true)
	private String karjoNoeFaal;
	@Column(name = "karjo_description", length = 500, nullable = true)
	private String karjoDescription;
	@Column(name = "karjo_noehamkari", length = 20, nullable = true)
	private String karjoNoeHamkari;
	@Lob
	@Column(name="karjo_resume" , nullable=true)
	private byte[] karjoResume;
	
	public long getKarjoId() {
		return karjoId;
	}
	public void setKarjoId(long karjoId) {
		this.karjoId = karjoId;
	}
	public String getKarjoName() {
		return karjoName;
	}
	public void setKarjoName(String karjoName) {
		this.karjoName = karjoName;
	}
	public String getKarjoSsn() {
		return karjoSsn;
	}
	public void setKarjoSsn(String karjoSsn) {
		this.karjoSsn = karjoSsn;
	}
	public String getKarjoFather() {
		return karjoFather;
	}
	public void setKarjoFather(String karjoFather) {
		this.karjoFather = karjoFather;
	}
	public String getKarjoGender() {
		return karjoGender;
	}
	public void setKarjoGender(String karjoGender) {
		this.karjoGender = karjoGender;
	}
	public String getKarjoCityName() {
		return karjoCityName;
	}
	public void setKarjoCityName(String karjoCityName) {
		this.karjoCityName = karjoCityName;
	}
	public Date getKarjoBirth() {
		return karjoBirth;
	}
	public void setKarjoBirth(Date karjoBirth) {
		this.karjoBirth = karjoBirth;
	}
	public String getKarjoPhone() {
		return karjoPhone;
	}
	public void setKarjoPhone(String karjoPhone) {
		this.karjoPhone = karjoPhone;
	}
	public String getKarjoMobile() {
		return karjoMobile;
	}
	public void setKarjoMobile(String karjoMobile) {
		this.karjoMobile = karjoMobile;
	}
	public String getKarjoEmail() {
		return karjoEmail;
	}
	public void setKarjoEmail(String karjoEmail) {
		this.karjoEmail = karjoEmail;
	}
	public String getKarjoField() {
		return karjoField;
	}
	public void setKarjoField(String karjoField) {
		this.karjoField = karjoField;
	}
	public String getKarjoMadrak() {
		return karjoMadrak;
	}
	public void setKarjoMadrak(String karjoMadrak) {
		this.karjoMadrak = karjoMadrak;
	}
	public String getKarjoMaharat() {
		return karjoMaharat;
	}
	public void setKarjoMaharat(String karjoMaharat) {
		this.karjoMaharat = karjoMaharat;
	}
	public String getKarjoNoeFaal() {
		return karjoNoeFaal;
	}
	public void setKarjoNoeFaal(String karjoNoeFaal) {
		this.karjoNoeFaal = karjoNoeFaal;
	}
	public String getKarjoDescription() {
		return karjoDescription;
	}
	public void setKarjoDescription(String karjoDescription) {
		this.karjoDescription = karjoDescription;
	}
	public String getKarjoNoeHamkari() {
		return karjoNoeHamkari;
	}
	public void setKarjoNoeHamkari(String karjoNoeHamkari) {
		this.karjoNoeHamkari = karjoNoeHamkari;
	}
	

	public byte[] getKarjoResume() {
		return karjoResume;
	}
	public void setKarjoResume(byte[] karjoResume) {
		this.karjoResume = karjoResume;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof JobKarjoEntity))
			return false;
		JobKarjoEntity jobKarjoEntity=(JobKarjoEntity) obj;
		return (jobKarjoEntity.karjoId==this.karjoId);
	}

}
