package service;

import java.util.List;

import javax.ejb.Local;

import dao.entity.NewsEntity;

@Local
public interface NewsServiceLocal {

	void insertToNews(NewsEntity newsEntity);

	void updateNews(NewsEntity newsEntity);

	NewsEntity findNewsById(long newsId);

	List<NewsEntity> findAllNews();

	void deleteNews(NewsEntity newsEntity);

}
