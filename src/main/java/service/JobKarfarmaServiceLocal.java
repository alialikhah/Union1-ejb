package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.JobKarfarmaEntity;
import dao.entity.JobKarjoEntity;

@Local
public interface JobKarfarmaServiceLocal {

	void insertToKarfarmaEntity(JobKarfarmaEntity jobKarfarmaEntity);

	List<JobKarfarmaEntity> findAllKarfarma();

	JobKarfarmaEntity findKarfarmaById(long karfarmaId);

	void updateKarfarma(JobKarfarmaEntity jobKarfarmaEntity);

	void deleteKarfarma(JobKarfarmaEntity jobKarfarmaEntity);


}
