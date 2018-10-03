package service;

import javax.ejb.Local;

import dao.entity.UserEntity;

@Local
public interface UserServiceLocal {

	void insertToUserEntity(UserEntity userEntity);

	UserEntity findUserByEmail(String email);

}
