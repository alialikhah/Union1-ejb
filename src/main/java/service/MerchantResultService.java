package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.MerchantResultDaoLocal;
import dao.entity.MerchantEntity;

/**
 * Session Bean implementation class MerchantResultService
 */
@Stateless
public class MerchantResultService implements MerchantResultServiceLocal {

	/**
	 * Default constructor.
	 */
	public MerchantResultService() {
		// TODO Auto-generated constructor stub
	}

	@Inject
	private MerchantResultDaoLocal merchantResultDaoLocal;
	@Override
	public List<MerchantEntity> findMerchantByRaste(String raste) {
		return merchantResultDaoLocal.findMerchantByRaste(raste);
	}

}
