package dao.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

/**
 * Entity implementation class for Entity: CustomerEntity
 *
 */
@Entity
@Table(name="customer_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllCustomer" , query="SELECT c FROM CustomerEntity c"),
})
public class CustomerEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private long customerId;
	@Column(name = "customer_name", length = 50, nullable = false)
	private String customerName;
	@Column(name = "customer_username", length = 50, nullable = false)
	private String customerUserName;
	@Column(name = "customer_family", length = 100, nullable = false)
	private String customerFamily;
	@Column(name = "customer_email", length = 50, nullable = true)
	private String customerEmail;
	@Column(name = "customer_phone", length = 50, nullable = false)
	private String customerPhone;
	@Column(name = "customer_mobile", length = 20, nullable = false)
	private String customerMobile;
	@Column(name = "customer_password", length = 50, nullable = false)
	private String customerPassword;
	private static final long serialVersionUID = 1L;

	public CustomerEntity() {
		super();
	}   
	public long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}   
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}   
	public String getCustomerUserName() {
		return this.customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}   
	public String getCustomerFamily() {
		return this.customerFamily;
	}

	public void setCustomerFamily(String customerFamily) {
		this.customerFamily = customerFamily;
	}   
	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}   
	public String getCustomerPhone() {
		return this.customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}   
	public String getCustomerMobile() {
		return this.customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}   
	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerUserName="
				+ customerUserName + ", customerFamily=" + customerFamily + ", customerEmail=" + customerEmail
				+ ", customerPhone=" + customerPhone + ", customerMobile=" + customerMobile + ", customerPassword="
				+ customerPassword + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CustomerEntity))
			return false;
		CustomerEntity customerEntity=(CustomerEntity) obj;
		return (customerEntity.customerId==this.customerId||customerEntity.customerUserName.equals(this.customerUserName));
	}
	
   
}
