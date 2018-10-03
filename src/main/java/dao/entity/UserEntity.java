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
@Table(name="user_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllUsers" , query="SELECT a FROM UserEntity a"),
	@NamedQuery(name="findUserByEmail" , query="SELECT pp FROM UserEntity pp WHERE pp.userEmail=:v_userEmail"),
})
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;
	@Column(name = "username", length = 100, nullable = false)
	private String userName;

	@Column(name = "email", length = 100, nullable = false )
	private String userEmail;
	@Column(name = "user_taeed")
	private boolean usertaeed;
	@Column(name = "ramz", length = 11, nullable = false)
	private String UserRamz;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public boolean isUsertaeed() {
		return usertaeed;
	}
	public void setUsertaeed(boolean usertaeed) {
		this.usertaeed = usertaeed;
	}
	
	public String getUserRamz() {
		return UserRamz;
	}
	public void setUserRamz(String userRamz) {
		UserRamz = userRamz;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof UserEntity))
			return false;
		UserEntity userEntity=(UserEntity) obj;
		return ((userEntity.userId==this.userId)||(userEntity.userEmail.equals(this.userEmail)));
	}
	
	public void userLogin() {
		
	}
	
}
