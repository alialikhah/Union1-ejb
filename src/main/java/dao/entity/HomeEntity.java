package dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

@Entity
@Table(name="home_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllHome" , query="SELECT a FROM HomeEntity a"),
	@NamedQuery(name="findByHomeId" , query="SELECT u FROM HomeEntity u WHERE u.homeId=:v_homeId"),
})
public class HomeEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5139396321666150578L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "home_id")
	private long homeId;
	@Column(name = "bazdid", nullable = true)
	private long bazdid;
	@Column(name="date" , nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	
	
	
	
	
	
	
	public long getHomeId() {
		return homeId;
	}






	public void setHomeId(long homeId) {
		this.homeId = homeId;
	}






	public long getBazdid() {
		return bazdid;
	}






	public void setBazdid(long bazdid) {
		this.bazdid = bazdid;
	}






	public Date getDate() {
		return date;
	}






	public void setDate(Date date) {
		this.date = date;
	}






	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof HomeEntity))
			return false;
		HomeEntity homeEntity=(HomeEntity) obj;
		return (homeEntity.homeId==this.homeId);
	}

}
