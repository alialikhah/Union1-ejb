package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.MojtameEntity;

@Local
public interface MojtameServiceLocal {

	void insertToMojtame(MojtameEntity mojtameEntity);

	List<MojtameEntity> findAllMojtame();

	void deleteMojtameEntity(MojtameEntity mojtameEntity);

	MojtameEntity findMojtameById(long mojtameId);

	void updateMojtama(MojtameEntity mojtameEntity);

	List<MojtameEntity> findMojtamaByTitle(String mojtamaTitle) throws Exception;

}
