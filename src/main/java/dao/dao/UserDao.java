package dao.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.UserEntity;

/**
 * Session Bean implementation class UserDao
 */
@Stateless
public class UserDao implements UserDaoLocal {

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

}
