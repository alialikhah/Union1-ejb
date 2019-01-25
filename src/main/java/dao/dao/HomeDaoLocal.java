package dao.dao;

import javax.ejb.Local;

import dao.entity.HomeEntity;

@Local
public interface HomeDaoLocal {

	void updateHomeEntity(HomeEntity homeEntity);

	HomeEntity findHomeEntityById(long homeId);

	void inserToHomeEntity(HomeEntity homeEntity);

}
