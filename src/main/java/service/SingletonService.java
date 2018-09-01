package service;

import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Session Bean implementation class SingletonService
 */
@Singleton
@Startup
public class SingletonService implements SingletonServiceLocal {

    /**
     * Default constructor. 
     */
    public SingletonService() {
        // TODO Auto-generated constructor stub
    }
    
    private long onlineUser;
    @Override
	public long getOnlineUser() {
		return onlineUser;
	}
    @Override
	public void setOnlineUser(long onlineUser) {
		this.onlineUser += onlineUser;
	}
    
    

}
