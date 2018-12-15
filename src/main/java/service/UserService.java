package service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.UserDaoLocal;
import dao.entity.UserEntity;

/**
 * Session Bean implementation class UserService
 */
@Stateless
public class UserService implements UserServiceLocal , Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1635454742261465501L;
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
    
    @Override
    public UserEntity findUser(String userName) throws Exception {
    	return userDaoLocal.findUser(userName);
    }
    
    @Override
	public List<UserEntity> findAllUsers(){
    	return userDaoLocal.findAllUsers();
    }
}
