package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.SliderEntity;

/**
 * Session Bean implementation class SliderDao
 */
@Stateless
public class SliderDao implements SliderDaoLocal {

    /**
     * Default constructor. 
     */
    public SliderDao() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    @Override
    public void insertToSlider(SliderEntity sliderEntity) {
    	entityManager.persist(sliderEntity);
    }
    
    @SuppressWarnings("unchecked")
    @Override
	public List<SliderEntity> findAllSlider(){
    	return entityManager.createNamedQuery("findAllSlider").getResultList();
    }
    
    @Override
    public void deleteSlider(SliderEntity sliderEntity) {
    	SliderEntity sliderEntity2=new SliderEntity();
    	sliderEntity2=entityManager.merge(sliderEntity);
    	entityManager.remove(sliderEntity2);
    }
    @Override
    public SliderEntity findSliderById(long sliderId) throws Exception {
    	try {
    	return (SliderEntity) entityManager.createNamedQuery("findSliderById").setParameter("v_sliderId", sliderId).getSingleResult();
    	}catch(Exception exception) {
    		throw new Exception();
    	}
    	}
    @Override
    public void updateSlider(SliderEntity sliderEntity) {
    	entityManager.merge(sliderEntity);
    }
    
    
}
