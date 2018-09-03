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
@Table(name="mojtame_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllMojtame" , query="SELECT m FROM MojtameEntity m"),
	@NamedQuery(name="findMojtameById" , query="SELECT i FROM MojtameEntity i WHERE i.mojtameId=:v_mojtameId"),
})
public class MojtameEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mojtame_id")
	private long mojtameId;
	@Column(name = "mojtame_category", length = 300, nullable = true)
	private String category;
	@Column(name = "mojtame_title", length = 300, nullable = true)
	private String mojtameTitle;
	@Column(name = "mojtame_head1", length = 300, nullable = true)	
	private String mojtameHead1;
	@Column(name = "mojtame_text1", length = 5000, nullable = true)
	private String mojtameText1;
	@Column(name = "mojtame_head2", length = 300, nullable = true)	
	private String mojtameHead2;
	@Column(name = "mojtame_text2", length = 5000, nullable = true)	
	private String mojtameText2;
	@Column(name = "mojtame_head3", length = 300, nullable = true)
	private String mojtameHead3;
	@Column(name = "mojtame_text3", length = 5000, nullable = true)
	private String mojtameText3;
	@Column(name = "mojtame_head4", length = 300, nullable = true)
	private String mojtameHead4;
	@Column(name = "mojtame_text4", length = 5000, nullable = true)
	private String mojtameText4;
	@Column(name = "mojtame_head5", length = 300, nullable = true)
	private String mojtameHead5;
	@Column(name = "mojtame_text5", length = 5000, nullable = true)
	private String mojtameText5;
	
	@Column(name = "mojtame_pic1",nullable = true)
	@Lob
	private byte[] mojtamePic1;
	
	@Column(name = "mojtame_pic2",nullable = true)
	@Lob
	private byte[] mojtamePic2;
	
	@Column(name = "mojtame_width", nullable = true)
	private double gmapWhidth;
	@Column(name = "mojtame_height", nullable = true)
	private double gmapHeight;
	
	
	public long getMojtameId() {
		return mojtameId;
	}

	public void setMojtameId(long mojtameId) {
		this.mojtameId = mojtameId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMojtameTitle() {
		return mojtameTitle;
	}

	public void setMojtameTitle(String mojtameTitle) {
		this.mojtameTitle = mojtameTitle;
	}

	public String getMojtameHead1() {
		return mojtameHead1;
	}

	public void setMojtameHead1(String mojtameHead1) {
		this.mojtameHead1 = mojtameHead1;
	}

	public String getMojtameText1() {
		return mojtameText1;
	}

	public void setMojtameText1(String mojtameText1) {
		this.mojtameText1 = mojtameText1;
	}

	public String getMojtameHead2() {
		return mojtameHead2;
	}

	public void setMojtameHead2(String mojtameHead2) {
		this.mojtameHead2 = mojtameHead2;
	}

	public String getMojtameText2() {
		return mojtameText2;
	}

	public void setMojtameText2(String mojtameText2) {
		this.mojtameText2 = mojtameText2;
	}

	public String getMojtameHead3() {
		return mojtameHead3;
	}

	public void setMojtameHead3(String mojtameHead3) {
		this.mojtameHead3 = mojtameHead3;
	}

	public String getMojtameText3() {
		return mojtameText3;
	}

	public void setMojtameText3(String mojtameText3) {
		this.mojtameText3 = mojtameText3;
	}

	public String getMojtameHead4() {
		return mojtameHead4;
	}

	public void setMojtameHead4(String mojtameHead4) {
		this.mojtameHead4 = mojtameHead4;
	}

	public String getMojtameText4() {
		return mojtameText4;
	}

	public void setMojtameText4(String mojtameText4) {
		this.mojtameText4 = mojtameText4;
	}

	public String getMojtameHead5() {
		return mojtameHead5;
	}

	public void setMojtameHead5(String mojtameHead5) {
		this.mojtameHead5 = mojtameHead5;
	}

	public String getMojtameText5() {
		return mojtameText5;
	}

	public void setMojtameText5(String mojtameText5) {
		this.mojtameText5 = mojtameText5;
	}

	public byte[] getMojtamePic1() {
		return mojtamePic1;
	}

	public void setMojtamePic1(byte[] mojtamePic1) {
		this.mojtamePic1 = mojtamePic1;
	}


	
	public double getGmapWhidth() {
		return gmapWhidth;
	}

	public void setGmapWhidth(double gmapWhidth) {
		this.gmapWhidth = gmapWhidth;
	}

	public double getGmapHeight() {
		return gmapHeight;
	}

	public void setGmapHeight(double gmapHeight) {
		this.gmapHeight = gmapHeight;
	}
	
	

	public byte[] getMojtamePic2() {
		return mojtamePic2;
	}

	public void setMojtamePic2(byte[] mojtamePic2) {
		this.mojtamePic2 = mojtamePic2;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MojtameEntity))
			return false;
		MojtameEntity mojtameEntity=(MojtameEntity) obj;
		return ((mojtameEntity.mojtameId==this.mojtameId));
	}
	
	
}
