package dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;
@Entity
@Table(name="admin_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllAdmin" , query="SELECT a FROM AdminEntity a"),
	@NamedQuery(name="findByUsername" , query="SELECT u FROM AdminEntity u WHERE u.adminUsername=:v_adminUsername"),
})
public class AdminEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private long adminId;
	@Column(name = "admin_username", length = 100, nullable = true)
	private String adminUsername;
	@Column(name = "admin_pass", length =100, nullable = true)
	private String adminPass;
	@Column(name = "admin_accessing", length =50, nullable = true)
	private String adminAccessing;
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	public String getAdminAccessing() {
		return adminAccessing;
	}
	public void setAdminAccessing(String adminAccessing) {
		this.adminAccessing = adminAccessing;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof AdminEntity))
			return false;
		AdminEntity adminEntity=(AdminEntity) obj;
		return (adminEntity.adminUsername.equals(this.adminUsername));
	}
	@Override
	public String toString() {
		return "AdminEntity [adminId=" + adminId + ", adminUsername=" + adminUsername + ", adminPass=" + adminPass
				+ ", adminAccessing=" + adminAccessing + "]";
	}

	
	
}
