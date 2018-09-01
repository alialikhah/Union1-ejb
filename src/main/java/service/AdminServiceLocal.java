package service;

import javax.ejb.Local;

import dao.entity.AdminEntity;

@Local
public interface AdminServiceLocal {

	void insertToAdmin(AdminEntity adminEntity);

	AdminEntity findAdminByUsername(String adminUser);

}
