package dao.dao;

import java.io.Serializable;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.AdminEntity;

/**
 * Session Bean implementation class AdminDao
 */
@Stateful
public class AdminDao implements AdminDaoLocal , Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor. 
     */
    public AdminDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @Override
    public void insertToAdmin(AdminEntity adminEntity){
    	entityManager.persist(adminEntity);
    }
    @Override
    public AdminEntity findAdminByUsername(String adminUser){
    	return (AdminEntity) entityManager.createNamedQuery("findByUsername").setParameter("v_adminUsername", adminUser).getSingleResult();
    }
    
    
    
    
    

}
