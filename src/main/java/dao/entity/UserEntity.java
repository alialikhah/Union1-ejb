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
})
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;
	@Column(name = "username", length = 100, nullable = true)
	private String userName;
	@Column(name = "family", length = 100, nullable = true)
	private String userFamily;
	@Column(name = "ssn", length = 100, nullable = true)
	private String userSsn;
	@Column(name = "email", length = 100, nullable = true)
	private String userEmail;
	@Column(name = "mobile", length = 100, nullable = true)
	private String userMobile;
	@Column(name = "access", length = 100, nullable = true)
	private String access;
	@Column(name = "password", length = 100, nullable = true)
	private String password;
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
	public String getUserFamily() {
		return userFamily;
	}
	public void setUserFamily(String userFamily) {
		this.userFamily = userFamily;
	}
	public String getUserSsn() {
		return userSsn;
	}
	public void setUserSsn(String userSsn) {
		this.userSsn = userSsn;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof UserEntity))
			return false;
		UserEntity userEntity=(UserEntity) obj;
		return (userEntity.userId==this.userId);
	}
	
}
