package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.JobKarjoEntity;

@Local
public interface JobKarjoDaoLocal {

	void insertToKarjoEntity(JobKarjoEntity jobKarjoEntity);

	List<JobKarjoEntity> findAllKarjo();

	void deleteKarjo(JobKarjoEntity karjoEntity);

	JobKarjoEntity findKarjoById(long karjoId);

	void updateKarjo(JobKarjoEntity jobKarjoEntity);

}
