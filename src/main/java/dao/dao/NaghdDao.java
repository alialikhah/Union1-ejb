package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.MashahirEntity;
import dao.entity.NaghdOBaresiEntity;

/**
 * Session Bean implementation class NaghdDao
 */
@Stateless
public class NaghdDao implements NaghdDaoLocal {

    /**
     * Default constructor. 
     */
    public NaghdDao() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    @Override
    public void insertToNaghd(NaghdOBaresiEntity naghdOBaresiEntity) {
    	entityManager.persist(naghdOBaresiEntity);
    }
    
    @SuppressWarnings("unchecked")
    @Override
	public List<NaghdOBaresiEntity> findAllNaghd(){
    	return entityManager.createNamedQuery("findAllNaghd").getResultList();
    }
    
    @Override
    public void deleteNaghdEntity(NaghdOBaresiEntity naghdOBaresiEntity){
    	NaghdOBaresiEntity naghdOBaresiEntity2=new NaghdOBaresiEntity();
    	naghdOBaresiEntity2=entityManager.merge(naghdOBaresiEntity);
    	entityManager.remove(naghdOBaresiEntity2);
    }
    @Override
    public NaghdOBaresiEntity findNagdByID(long naghdId) {
    	return (NaghdOBaresiEntity) entityManager.createNamedQuery("findNaghdById").setParameter("v_naghdId", naghdId).getSingleResult();
    }

}
