package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.SliderDaoLocal;
import dao.entity.SliderEntity;

/**
 * Session Bean implementation class SliderService
 */
@Stateless
public class SliderService implements SliderServiceLocal {

    /**
     * Default constructor. 
     */
    public SliderService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private SliderDaoLocal sliderDaoLocal;

    @Override
    public void insertToSlider(SliderEntity sliderEntity) {
    	sliderDaoLocal.insertToSlider(sliderEntity);
    }
    
    @Override
	public List<SliderEntity> findAllSlider(){
    	return sliderDaoLocal.findAllSlider();
    }
    
    @Override
    public void deleteSlider(SliderEntity sliderEntity) {
    	sliderDaoLocal.deleteSlider(sliderEntity);
    }
    
    @Override
    public SliderEntity findSliderById(long sliderId) {
    	return sliderDaoLocal.findSliderById(sliderId);
    }
    
}
