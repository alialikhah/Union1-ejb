package service;

import javax.ejb.Local;

import dao.entity.HomeEntity;

@Local
public interface HomeServiceLocal {

	void updateHomeEntity(HomeEntity homeEntity);

	HomeEntity findHomeEntity(long homeId);

	void inserToHomeEntity(HomeEntity homeEntity);

}
