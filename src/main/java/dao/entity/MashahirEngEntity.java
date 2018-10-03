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
@Table(name="mashahirEng_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllMashahirEng" , query="SELECT a FROM MashahirEngEntity a"),
	@NamedQuery(name="findMashahirEngById" , query="SELECT i FROM MashahirEngEntity i WHERE i.mashahirEngId=:v_mashahirEngId"),
	@NamedQuery(name="findMashahirEngByName" , query="SELECT i FROM MashahirEngEntity i WHERE i.mashahirEngName like :v_mashahirEngName"),
})
public class MashahirEngEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mashahireng_id")
	private long mashahirEngId;
	
	@Column(name = "mashahir_name",nullable = true,length=200)
	private String mashahirEngName;
	
	
	@Column(name = "mashahirEng_pic1",nullable = true)
	@Lob
	private byte[] mashahirEngPic1;
	
	@Column(name = "mashahirEng_pic2",nullable = true)
	@Lob
	private byte[] mashahirEngPic2;
	
	@Column(name = "mashahirEng_pic3",nullable = true)
	@Lob
	private byte[] mashahirEngPic3;
	
	@Column(name = "mashahirEng_pic4",nullable = true)
	@Lob
	private byte[] mashahirEngPic4;
	
	@Column(name = "mashahirEng_pic5",nullable = true)
	@Lob
	private byte[] mashahirEngPic5;
	
	@Column(name = "mashahirEng_pic6",nullable = true)
	@Lob
	private byte[] mashahirEngPic6;

	@Column(name = "mashahirEng_head1",nullable = true,length=500)
	private String mashahirEngHead1;
	@Column(name = "mashahirEng_text1",nullable = true,length=5000)
	private String mashahirEngText1;
	@Column(name = "mashahirEng_head2",nullable = true,length=500)
	private String mashahirEngHead2;
	@Column(name = "mashahirEng_text2",nullable = true,length=5000)
	private String mashahirEngText2;
	@Column(name = "mashahirEng_head3",nullable = true,length=500)
	private String mashahirEngHead3;
	@Column(name = "mashahirEng_text3",nullable = true,length=5000)
	private String mashahirEngText3;
	@Column(name = "mashahirEng_head4",nullable = true,length=500)
	private String mashahirEngHead4;
	@Column(name = "mashahirEng_text4",nullable = true,length=5000)
	private String mashahirEngText4;
	@Column(name = "mashahirEng_head5",nullable = true,length=500)
	private String mashahirEngHead5;
	@Column(name = "mashahirEng_text5",nullable = true,length=5000)
	private String mashahirEngText5;
	public long getMashahirEngId() {
		return mashahirEngId;
	}
	public void setMashahirEngId(long mashahirEngId) {
		this.mashahirEngId = mashahirEngId;
	}
	public String getMashahirEngName() {
		return mashahirEngName;
	}
	public void setMashahirEngName(String mashahirEngName) {
		this.mashahirEngName = mashahirEngName;
	}
	public byte[] getMashahirEngPic1() {
		return mashahirEngPic1;
	}
	public void setMashahirEngPic1(byte[] mashahirEngPic1) {
		this.mashahirEngPic1 = mashahirEngPic1;
	}
	public byte[] getMashahirEngPic2() {
		return mashahirEngPic2;
	}
	public void setMashahirEngPic2(byte[] mashahirEngPic2) {
		this.mashahirEngPic2 = mashahirEngPic2;
	}
	public byte[] getMashahirEngPic3() {
		return mashahirEngPic3;
	}
	public void setMashahirEngPic3(byte[] mashahirEngPic3) {
		this.mashahirEngPic3 = mashahirEngPic3;
	}
	public byte[] getMashahirEngPic4() {
		return mashahirEngPic4;
	}
	public void setMashahirEngPic4(byte[] mashahirEngPic4) {
		this.mashahirEngPic4 = mashahirEngPic4;
	}
	public byte[] getMashahirEngPic5() {
		return mashahirEngPic5;
	}
	public void setMashahirEngPic5(byte[] mashahirEngPic5) {
		this.mashahirEngPic5 = mashahirEngPic5;
	}
	public byte[] getMashahirEngPic6() {
		return mashahirEngPic6;
	}
	public void setMashahirEngPic6(byte[] mashahirEngPic6) {
		this.mashahirEngPic6 = mashahirEngPic6;
	}
	public String getMashahirEngHead1() {
		return mashahirEngHead1;
	}
	public void setMashahirEngHead1(String mashahirEngHead1) {
		this.mashahirEngHead1 = mashahirEngHead1;
	}
	public String getMashahirEngText1() {
		return mashahirEngText1;
	}
	public void setMashahirEngText1(String mashahirEngText1) {
		this.mashahirEngText1 = mashahirEngText1;
	}
	public String getMashahirEngHead2() {
		return mashahirEngHead2;
	}
	public void setMashahirEngHead2(String mashahirEngHead2) {
		this.mashahirEngHead2 = mashahirEngHead2;
	}
	public String getMashahirEngText2() {
		return mashahirEngText2;
	}
	public void setMashahirEngText2(String mashahirEngText2) {
		this.mashahirEngText2 = mashahirEngText2;
	}
	public String getMashahirEngHead3() {
		return mashahirEngHead3;
	}
	public void setMashahirEngHead3(String mashahirEngHead3) {
		this.mashahirEngHead3 = mashahirEngHead3;
	}
	public String getMashahirEngText3() {
		return mashahirEngText3;
	}
	public void setMashahirEngText3(String mashahirEngText3) {
		this.mashahirEngText3 = mashahirEngText3;
	}
	public String getMashahirEngHead4() {
		return mashahirEngHead4;
	}
	public void setMashahirEngHead4(String mashahirEngHead4) {
		this.mashahirEngHead4 = mashahirEngHead4;
	}
	public String getMashahirEngText4() {
		return mashahirEngText4;
	}
	public void setMashahirEngText4(String mashahirEngText4) {
		this.mashahirEngText4 = mashahirEngText4;
	}
	public String getMashahirEngHead5() {
		return mashahirEngHead5;
	}
	public void setMashahirEngHead5(String mashahirEngHead5) {
		this.mashahirEngHead5 = mashahirEngHead5;
	}
	public String getMashahirEngText5() {
		return mashahirEngText5;
	}
	public void setMashahirEngText5(String mashahirEngText5) {
		this.mashahirEngText5 = mashahirEngText5;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MashahirEngEntity))
			return false;
		MashahirEngEntity mashahirEngEntity=(MashahirEngEntity) obj;
		return ((mashahirEngEntity.mashahirEngId==this.mashahirEngId)||(mashahirEngEntity.mashahirEngName==this.mashahirEngName));
	}

}
