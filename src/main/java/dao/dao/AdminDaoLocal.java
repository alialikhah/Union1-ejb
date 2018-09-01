package dao.dao;

import javax.ejb.Local;

import dao.entity.AdminEntity;

@Local
public interface AdminDaoLocal {

	void insertToAdmin(AdminEntity adminEntity);

	AdminEntity findAdminByUsername(String adminUser);

}
