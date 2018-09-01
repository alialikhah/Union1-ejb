package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.MashahirEngEntity;

@Local
public interface MashahirEngDaoLocal {

	MashahirEngEntity findMashahirEngById(long mashahirEngId) throws Exception;

	void insertToMashahirEng(MashahirEngEntity mashahirEngEntity);

	List<MashahirEngEntity> findAllMashahirEng() throws Exception;

	void deleteMashahirEntity(MashahirEngEntity mashahirEntity);

	void updateMashahirEng(MashahirEngEntity mashahirEngEntity);

}
