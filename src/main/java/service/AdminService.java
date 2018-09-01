package service;

import javax.ejb.Stateful;
import javax.inject.Inject;

import dao.dao.AdminDaoLocal;
import dao.entity.AdminEntity;

/**
 * Session Bean implementation class AdminService
 */
@Stateful
public class AdminService implements AdminServiceLocal {

    /**
     * Default constructor. 
     */
    public AdminService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private AdminDaoLocal adminDaoLocal;

    
    @Override
    public void insertToAdmin(AdminEntity adminEntity){
    	adminDaoLocal.insertToAdmin(adminEntity);
    }
    @Override
    public AdminEntity findAdminByUsername(String adminUser){
    	return adminDaoLocal.findAdminByUsername(adminUser);
    }
}
