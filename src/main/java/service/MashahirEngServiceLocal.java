package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.MashahirEngEntity;

@Local
public interface MashahirEngServiceLocal {

	MashahirEngEntity findMashahirEngById(long mashahirEngId) throws Exception;

	void insertToMashahirEng(MashahirEngEntity mashahirEngEntity);

	List<MashahirEngEntity> findAllMashahirEng() throws Exception;

	void deleteMashahirEngEntity(MashahirEngEntity mashahirEngEntity);

	void updateMashahirEng(MashahirEngEntity mashahirEngEntity);

	List<MashahirEngEntity> findMashahirEngByName(String mashahirEngName) throws Exception;

}
