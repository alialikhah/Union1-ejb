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
@Table(name="naghd_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllNaghd" , query="SELECT n FROM NaghdOBaresiEntity n"),
	@NamedQuery(name="findNaghdById" , query="SELECT i FROM NaghdOBaresiEntity i WHERE i.naghdId=:v_naghdId"),
})
public class NaghdOBaresiEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "naghd_id")
	private long naghdId;
	@Column(name = "nsghd_category", length = 300, nullable = true)
	private String category;
	@Column(name = "nsghd_title", length = 300, nullable = true)
	private String naghdTitle;
	@Column(name = "nsghd_head1", length = 300, nullable = true)	
	private String naghdHead1;
	@Column(name = "nsghd_text1", length = 5000, nullable = true)
	private String naghdText1;
	@Column(name = "nsghd_head2", length = 300, nullable = true)	
	private String naghdHead2;
	@Column(name = "nsghd_text2", length = 5000, nullable = true)	
	private String naghdText2;
	@Column(name = "nsghd_head3", length = 300, nullable = true)
	private String naghdHead3;
	@Column(name = "nsghd_text3", length = 5000, nullable = true)
	private String naghdText3;
	@Column(name = "nsghd_head4", length = 300, nullable = true)
	private String naghdHead4;
	@Column(name = "nsghd_text4", length = 5000, nullable = true)
	private String naghdText4;
	@Column(name = "nsghd_head5", length = 300, nullable = true)
	private String naghdHead5;
	@Column(name = "nsghd_text5", length = 5000, nullable = true)
	private String naghdText5;
	
	@Column(name = "naghd_pic1",nullable = true)
	@Lob
	private byte[] naghdPic1;
	
	@Column(name = "naghd_pic2",nullable = true)
	@Lob
	private byte[] naghdPic2;
	
	@Column(name = "naghd_pic3",nullable = true)
	@Lob
	private byte[] naghdPic3;
	
	@Column(name = "naghd_pic4",nullable = true)
	@Lob
	private byte[] naghdPic4;
	
	@Column(name = "naghd_pic5",nullable = true)
	@Lob
	private byte[] naghdPic5;
	
	@Column(name = "naghd_pic6",nullable = true)
	@Lob
	private byte[] naghdPic6;
	
	@Column(name = "naghd_pic7",nullable = true)
	@Lob
	private byte[] naghdPic7;
	
	@Column(name = "naghd_pic8",nullable = true)
	@Lob
	private byte[] naghdPic8;
	
	@Column(name = "naghd_pic9",nullable = true)
	@Lob
	private byte[] naghdPic9;
	
	@Column(name = "naghd_pic10",nullable = true)
	@Lob
	private byte[] naghdPic10;
	
	public long getNaghdId() {
		return naghdId;
	}
	public void setNaghdId(long naghdId) {
		this.naghdId = naghdId;
	}
	public String getNaghdTitle() {
		return naghdTitle;
	}
	public void setNaghdTitle(String naghdTitle) {
		this.naghdTitle = naghdTitle;
	}
	public String getNaghdHead1() {
		return naghdHead1;
	}
	public void setNaghdHead1(String naghdHead1) {
		this.naghdHead1 = naghdHead1;
	}
	public String getNaghdText1() {
		return naghdText1;
	}
	public void setNaghdText1(String naghdText1) {
		this.naghdText1 = naghdText1;
	}
	public String getNaghdHead2() {
		return naghdHead2;
	}
	public void setNaghdHead2(String naghdHead2) {
		this.naghdHead2 = naghdHead2;
	}
	public String getNaghdText2() {
		return naghdText2;
	}
	public void setNaghdText2(String naghdText2) {
		this.naghdText2 = naghdText2;
	}
	public String getNaghdHead3() {
		return naghdHead3;
	}
	public void setNaghdHead3(String naghdHead3) {
		this.naghdHead3 = naghdHead3;
	}
	public String getNaghdText3() {
		return naghdText3;
	}
	public void setNaghdText3(String naghdText3) {
		this.naghdText3 = naghdText3;
	}
	public String getNaghdHead4() {
		return naghdHead4;
	}
	public void setNaghdHead4(String naghdHead4) {
		this.naghdHead4 = naghdHead4;
	}
	public String getNaghdText4() {
		return naghdText4;
	}
	public void setNaghdText4(String naghdText4) {
		this.naghdText4 = naghdText4;
	}
	public String getNaghdHead5() {
		return naghdHead5;
	}
	public void setNaghdHead5(String naghdHead5) {
		this.naghdHead5 = naghdHead5;
	}
	public String getNaghdText5() {
		return naghdText5;
	}
	public void setNaghdText5(String naghdText5) {
		this.naghdText5 = naghdText5;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
	public byte[] getNaghdPic1() {
		return naghdPic1;
	}
	public void setNaghdPic1(byte[] naghdPic1) {
		this.naghdPic1 = naghdPic1;
	}
	public byte[] getNaghdPic2() {
		return naghdPic2;
	}
	public void setNaghdPic2(byte[] naghdPic2) {
		this.naghdPic2 = naghdPic2;
	}
	public byte[] getNaghdPic3() {
		return naghdPic3;
	}
	public void setNaghdPic3(byte[] naghdPic3) {
		this.naghdPic3 = naghdPic3;
	}
	public byte[] getNaghdPic4() {
		return naghdPic4;
	}
	public void setNaghdPic4(byte[] naghdPic4) {
		this.naghdPic4 = naghdPic4;
	}
	public byte[] getNaghdPic5() {
		return naghdPic5;
	}
	public void setNaghdPic5(byte[] naghdPic5) {
		this.naghdPic5 = naghdPic5;
	}
	

	public byte[] getNaghdPic6() {
		return naghdPic6;
	}
	public void setNaghdPic6(byte[] naghdPic6) {
		this.naghdPic6 = naghdPic6;
	}
	public byte[] getNaghdPic7() {
		return naghdPic7;
	}
	public void setNaghdPic7(byte[] naghdPic7) {
		this.naghdPic7 = naghdPic7;
	}
	public byte[] getNaghdPic8() {
		return naghdPic8;
	}
	public void setNaghdPic8(byte[] naghdPic8) {
		this.naghdPic8 = naghdPic8;
	}
	public byte[] getNaghdPic9() {
		return naghdPic9;
	}
	public void setNaghdPic9(byte[] naghdPic9) {
		this.naghdPic9 = naghdPic9;
	}
	public byte[] getNaghdPic10() {
		return naghdPic10;
	}
	public void setNaghdPic10(byte[] naghdPic10) {
		this.naghdPic10 = naghdPic10;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof NaghdOBaresiEntity))
			return false;
		NaghdOBaresiEntity naghdOBaresi=(NaghdOBaresiEntity) obj;
		return ((naghdOBaresi.naghdId==this.naghdId));
	}
	
	

}
