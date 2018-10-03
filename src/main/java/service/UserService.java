package service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.UserDaoLocal;
import dao.entity.UserEntity;

/**
 * Session Bean implementation class UserService
 */
@Stateless
public class UserService implements UserServiceLocal {

    /**
     * Default constructor. 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private UserDaoLocal userDaoLocal;
    @Override
    public void insertToUserEntity(UserEntity userEntity) {
    	userDaoLocal.insertToUserEntity(userEntity);
    }
    
    @Override
    public UserEntity findUserByEmail(String email) {
    	return userDaoLocal.findUserByEmail(email);
    }
}
