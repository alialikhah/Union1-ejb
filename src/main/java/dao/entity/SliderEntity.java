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
@Table(name="slider_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllSlider" , query="SELECT a FROM SliderEntity a"),
	@NamedQuery(name="findSliderById" , query="SELECT i FROM SliderEntity i WHERE i.sliderId=:v_sliderId"),
})
public class SliderEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "slider_id")
	private long sliderId;
	
	@Lob
	@Column(name="slider_img" , nullable=true)
	private byte[] sliderImage;
	@Column(name = "slider_title", length = 100, nullable = true)
	private String sliderTitle;
	public long getSliderId() {
		return sliderId;
	}
	public void setSliderId(long sliderId) {
		this.sliderId = sliderId;
	}
	public byte[] getSliderImage() {
		return sliderImage;
	}
	public void setSliderImage(byte[] sliderImage) {
		this.sliderImage = sliderImage;
	}
	public String getSliderTitle() {
		return sliderTitle;
	}
	public void setSliderTitle(String sliderTitle) {
		this.sliderTitle = sliderTitle;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SliderEntity))
			return false;
		SliderEntity sliderEntity=(SliderEntity) obj;
		return (sliderEntity.sliderId==this.sliderId);
		}
	

}
