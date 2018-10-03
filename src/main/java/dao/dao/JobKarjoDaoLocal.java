package dao.dao;

import javax.ejb.Local;

import dao.entity.JobKarjoEntity;

@Local
public interface JobKarjoDaoLocal {

	void insertToKarjoEntity(JobKarjoEntity jobKarjoEntity);

}
