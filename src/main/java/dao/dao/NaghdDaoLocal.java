package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.NaghdOBaresiEntity;

@Local
public interface NaghdDaoLocal {

	void insertToNaghd(NaghdOBaresiEntity naghdOBaresiEntity);

	List<NaghdOBaresiEntity> findAllNaghd();

	void deleteNaghdEntity(NaghdOBaresiEntity naghdOBaresiEntity);

	NaghdOBaresiEntity findNagdByID(long naghdId);

}
