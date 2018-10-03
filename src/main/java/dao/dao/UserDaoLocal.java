package dao.dao;

import javax.ejb.Local;

import dao.entity.UserEntity;

@Local
public interface UserDaoLocal {

	void insertToUserEntity(UserEntity userEntity);

	UserEntity findUserByEmail(String email);

}
