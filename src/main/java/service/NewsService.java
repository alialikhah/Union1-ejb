package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.dao.NewsDaoLocal;
import dao.entity.NewsEntity;

/**
 * Session Bean implementation class NewsService
 */
@Stateless
public class NewsService implements NewsServiceLocal {

    /**
     * Default constructor. 
     */
    public NewsService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private NewsDaoLocal newsDaoLocal;
    
    @Override
    public void insertToNews(NewsEntity newsEntity) {
    	newsDaoLocal.insertToNews(newsEntity);
    }
    
    @Override
    public void updateNews(NewsEntity newsEntity) {
    	newsDaoLocal.updateNews(newsEntity);
    }
    @Override
    public NewsEntity findNewsById(long newsId) {
       return newsDaoLocal.findNewsById(newsId);
    }

    @Override
	public List<NewsEntity> findAllNews(){
    	return newsDaoLocal.findAllNews();
    }
    
    @Override
    public void deleteNews(NewsEntity newsEntity) {
    	newsDaoLocal.deleteNews(newsEntity);
    }
    
    
}
