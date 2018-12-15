package dao.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.UserEntity;

/**
 * Session Bean implementation class UserDao
 */
@Stateless
public class UserDao implements UserDaoLocal ,Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 6708877396035894630L;

	/**
     * Default constructor. 
     */
    public UserDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @Override
    public void insertToUserEntity(UserEntity userEntity) {
    	entityManager.persist(userEntity);
    }
    @Override
    public UserEntity findUserByEmail(String userName) {
    	return (UserEntity) entityManager.createNamedQuery("findUserByName").setParameter("v_userName",userName).getSingleResult();
    }
    @Override
    public UserEntity findUser(String userName) throws Exception {
    	try {
    	return (UserEntity) entityManager.createNamedQuery("findUserByName").setParameter("v_userName", userName).getSingleResult();
    	}catch (Exception e) {
			throw new Exception();
		}
    	}
    
    @SuppressWarnings("unchecked")
    @Override
	public List<UserEntity> findAllUsers(){
    	return entityManager.createNamedQuery("findAllUsers").getResultList();
    }
    

}
