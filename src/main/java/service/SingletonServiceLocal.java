package service;

import javax.ejb.Local;

@Local
public interface SingletonServiceLocal {

	long getOnlineUser();

	void setOnlineUser(long onlineUser);

}
