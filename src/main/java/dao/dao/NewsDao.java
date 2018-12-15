package dao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.entity.NewsEntity;

/**
 * Session Bean implementation class NewsDao
 */
@Stateless
public class NewsDao implements NewsDaoLocal {

	/**
	 * Default constructor.
	 */
	public NewsDao() {
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(unitName = "aliUnit")
	private EntityManager entityManager;

	@Override
	public void insertToNews(NewsEntity newsEntity) {
		entityManager.persist(newsEntity);
	}

	@Override
	public void updateNews(NewsEntity newsEntity) {
		entityManager.merge(newsEntity);
	}

	@Override
	public NewsEntity findNewsById(long newsId) {
		return (NewsEntity) entityManager.createNamedQuery("findByNews").setParameter("v_newsId", newsId)
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NewsEntity> findAllNews() {
		return entityManager.createNamedQuery("findAllNews").getResultList();
	}
	

	@Override
	public void deleteNews(NewsEntity newsEntity) {
		NewsEntity newsEntity2 = new NewsEntity();
		newsEntity2 = entityManager.merge(newsEntity);
		entityManager.remove(newsEntity2);
	}

}
