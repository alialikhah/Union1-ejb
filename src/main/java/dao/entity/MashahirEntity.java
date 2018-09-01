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
@Table(name="mashahir_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllMashahir" , query="SELECT a FROM MashahirEntity a"),
	@NamedQuery(name="findMashahirById" , query="SELECT i FROM MashahirEntity i WHERE i.mashahirId=:v_mashahirId"),
})
public class MashahirEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mashahir_id")
	private long mashahirId;
	
	@Column(name = "mashahir_name",nullable = true,length=200)
	private String mashahirName;
	
	@Column(name = "mashahir_field",nullable = true,length=100)
	private String personField;
	
	@Column(name = "mashahir_pic1",nullable = true)
	@Lob
	private byte[] mashahirPic1;
	
	@Column(name = "mashahir_pic2",nullable = true)
	@Lob
	private byte[] mashahirPic2;
	
	@Column(name = "mashahir_pic3",nullable = true)
	@Lob
	private byte[] mashahirPic3;
	
	@Column(name = "mashahir_pic4",nullable = true)
	@Lob
	private byte[] mashahirPic4;
	
	@Column(name = "mashahir_pic5",nullable = true)
	@Lob
	private byte[] mashahirPic5;
	
	@Column(name = "mashahir_pic6",nullable = true)
	@Lob
	private byte[] mashahirPic6;

	@Column(name = "mashahir_head1",nullable = true,length=500)
	private String mashahirHead1;
	@Column(name = "mashahir_text1",nullable = true,length=5000)
	private String mashahirText1;
	@Column(name = "mashahir_head2",nullable = true,length=500)
	private String mashahirHead2;
	@Column(name = "mashahir_text2",nullable = true,length=5000)
	private String mashahirText2;
	@Column(name = "mashahir_head3",nullable = true,length=500)
	private String mashahirHead3;
	@Column(name = "mashahir_text3",nullable = true,length=5000)
	private String mashahirText3;
	@Column(name = "mashahir_head4",nullable = true,length=500)
	private String mashahirHead4;
	@Column(name = "mashahir_text4",nullable = true,length=5000)
	private String mashahirText4;
	@Column(name = "mashahir_head5",nullable = true,length=500)
	private String mashahirHead5;
	@Column(name = "mashahir_text5",nullable = true,length=5000)
	private String mashahirText5;
	
	@Column(name = "in_head",nullable = true)
	private boolean isInHead;
	
	
	public byte[] getMashahirPic4() {
		return mashahirPic4;
	}





	public void setMashahirPic4(byte[] mashahirPic4) {
		this.mashahirPic4 = mashahirPic4;
	}





	public byte[] getMashahirPic5() {
		return mashahirPic5;
	}





	public void setMashahirPic5(byte[] mashahirPic5) {
		this.mashahirPic5 = mashahirPic5;
	}





	public byte[] getMashahirPic6() {
		return mashahirPic6;
	}





	public void setMashahirPic6(byte[] mashahirPic6) {
		this.mashahirPic6 = mashahirPic6;
	}





	public String getPersonField() {
		return personField;
	}





	public void setPersonField(String personField) {
		this.personField = personField;
	}





	public long getMashahirId() {
		return mashahirId;
	}





	public void setMashahirId(long mashahirId) {
		this.mashahirId = mashahirId;
	}





	public String getMashahirName() {
		return mashahirName;
	}





	public void setMashahirName(String mashahirName) {
		this.mashahirName = mashahirName;
	}





	public byte[] getMashahirPic1() {
		return mashahirPic1;
	}





	public void setMashahirPic1(byte[] mashahirPic1) {
		this.mashahirPic1 = mashahirPic1;
	}





	public byte[] getMashahirPic2() {
		return mashahirPic2;
	}





	public void setMashahirPic2(byte[] mashahirPic2) {
		this.mashahirPic2 = mashahirPic2;
	}





	public byte[] getMashahirPic3() {
		return mashahirPic3;
	}





	public void setMashahirPic3(byte[] mashahirPic3) {
		this.mashahirPic3 = mashahirPic3;
	}





	public String getMashahirHead1() {
		return mashahirHead1;
	}





	public void setMashahirHead1(String mashahirHead1) {
		this.mashahirHead1 = mashahirHead1;
	}





	public String getMashahirText1() {
		return mashahirText1;
	}





	public void setMashahirText1(String mashahirText1) {
		this.mashahirText1 = mashahirText1;
	}





	public String getMashahirHead2() {
		return mashahirHead2;
	}





	public void setMashahirHead2(String mashahirHead2) {
		this.mashahirHead2 = mashahirHead2;
	}





	public String getMashahirText2() {
		return mashahirText2;
	}





	public void setMashahirText2(String mashahirText2) {
		this.mashahirText2 = mashahirText2;
	}





	public String getMashahirHead3() {
		return mashahirHead3;
	}





	public void setMashahirHead3(String mashahirHead3) {
		this.mashahirHead3 = mashahirHead3;
	}





	public String getMashahirText3() {
		return mashahirText3;
	}





	public void setMashahirText3(String mashahirText3) {
		this.mashahirText3 = mashahirText3;
	}





	public String getMashahirHead4() {
		return mashahirHead4;
	}





	public void setMashahirHead4(String mashahirHead4) {
		this.mashahirHead4 = mashahirHead4;
	}





	public String getMashahirText4() {
		return mashahirText4;
	}





	public void setMashahirText4(String mashahirText4) {
		this.mashahirText4 = mashahirText4;
	}





	public String getMashahirHead5() {
		return mashahirHead5;
	}





	public void setMashahirHead5(String mashahirHead5) {
		this.mashahirHead5 = mashahirHead5;
	}





	public String getMashahirText5() {
		return mashahirText5;
	}





	public void setMashahirText5(String mashahirText5) {
		this.mashahirText5 = mashahirText5;
	}





	public boolean isInHead() {
		return isInHead;
	}





	public void setInHead(boolean isInHead) {
		this.isInHead = isInHead;
	}





	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MashahirEntity))
			return false;
		MashahirEntity mashahirEntity=(MashahirEntity) obj;
		return (mashahirEntity.mashahirId==this.mashahirId);
	}
}
