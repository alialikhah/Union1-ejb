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
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

@Entity
@Table(name="user_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllUsers" , query="SELECT a FROM UserEntity a"),
	@NamedQuery(name="findUserByName" , query="SELECT pp FROM UserEntity pp WHERE pp.userName=:v_userName"),
})
public class UserEntity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1259013225533433795L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;
	@Column(name = "whole_name", length = 100)
	private String wholeName;
	
	@Column(name = "username", length = 100, nullable = true, unique=true)
	private String userName;

	@Column(name = "password", length = 300, nullable = false)
	private String password;
	@Column(name = "role", length = 100, nullable = false)
	private String role;
	
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
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	
	public String getWholeName() {
		return wholeName;
	}
	public void setWholeName(String wholeName) {
		this.wholeName = wholeName;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof UserEntity))
			return false;
		UserEntity userEntity=(UserEntity) obj;
		return ((userEntity.userId==this.userId)||(userEntity.userName.equals(this.userName)));
	}
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", wholeName=" + wholeName + ", userName=" + userName + ", password="
				+ password + ", role=" + role + "]";
	}
	
	
	
	
}
