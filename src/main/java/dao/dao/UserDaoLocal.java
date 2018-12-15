package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.UserEntity;

@Local
public interface UserDaoLocal {

	void insertToUserEntity(UserEntity userEntity);

	UserEntity findUserByEmail(String email);

	UserEntity findUser(String userName) throws Exception;

	List<UserEntity> findAllUsers();

}
