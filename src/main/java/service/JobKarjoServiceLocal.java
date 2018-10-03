package service;

import javax.ejb.Local;

import dao.entity.JobKarjoEntity;

@Local
public interface JobKarjoServiceLocal {

	void insertToKarjoEntity(JobKarjoEntity jobKarjoEntity);

}
