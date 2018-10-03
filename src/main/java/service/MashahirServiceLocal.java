package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.MashahirEntity;

@Local
public interface MashahirServiceLocal {

	MashahirEntity findMashahirById(long mashahirId) throws Exception;

	void insertToMashahir(MashahirEntity mashahirEntity);

	List<MashahirEntity> findAllMashahir() throws Exception;

	void deleteMashahirEntity(MashahirEntity mashahirEntity);

	void updateMashahir(MashahirEntity mashahirEntity);

	List<MashahirEntity> findMashahirByName(String mashahirName) throws Exception;

}
