package dao.dao;

import java.util.List;

import javax.ejb.Local;

import dao.entity.SliderEntity;

@Local
public interface SliderDaoLocal {

	void insertToSlider(SliderEntity sliderEntity);

	List<SliderEntity> findAllSlider();

	void deleteSlider(SliderEntity sliderEntity);

	SliderEntity findSliderById(long sliderId);

}
