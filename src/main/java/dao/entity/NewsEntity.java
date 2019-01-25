package dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;

@Entity
@Table(name = "news_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({ @NamedQuery(name = "findAllNews", query = "SELECT a FROM NewsEntity a ORDER BY a.newsId DESC"),
		@NamedQuery(name = "findByNews", query = "SELECT u FROM NewsEntity u WHERE u.newsId=:v_newsId"), })
public class NewsEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "news_id")
	private long newsId;
	@Column(name = "category", length = 100, nullable = true)
	private String category;
	@Column(name = "title", length = 200, nullable = true)
	private String title;
	@Column(name = "author", length = 150, nullable = true)
	private String author;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = true)
	private Date date;
	@Column(name = "head", length = 500, nullable = true)
	private String head;
	@Column(name = "description", length = 5500, nullable = true)
	private String description;
	@Column(name = "important")
	private boolean important;
	@Column(name = "very_important")
	private boolean veryImportant;
	@Column(name = "parvane")
	private boolean parvane;
	@Column(name = "govahiname")
	private boolean govahiname;
	
	@Lob
	@Column(name = "imageSmall", nullable = true)
	private byte[] imageSmall;
	@Lob
	@Column(name = "imageBig1", nullable = true)
	private byte[] imageBig1;
	
	public long getNewsId() {
		return newsId;
	}

	public void setNewsId(long newsId) {
		this.newsId = newsId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public byte[] getImageSmall() {
		return imageSmall;
	}

	public void setImageSmall(byte[] imageSmall) {
		this.imageSmall = imageSmall;
	}

	public byte[] getImageBig1() {
		return imageBig1;
	}

	public void setImageBig1(byte[] imageBig1) {
		this.imageBig1 = imageBig1;
	}
	

	public boolean isImportant() {
		return important;
	}

	public void setImportant(boolean important) {
		this.important = important;
	}

	public boolean isVeryImportant() {
		return veryImportant;
	}

	public void setVeryImportant(boolean veryImportant) {
		this.veryImportant = veryImportant;
	}
	
	

	public boolean isParvane() {
		return parvane;
	}

	public void setParvane(boolean parvane) {
		this.parvane = parvane;
	}

	public boolean isGovahiname() {
		return govahiname;
	}

	public void setGovahiname(boolean govahiname) {
		this.govahiname = govahiname;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof NewsEntity))
			return false;
		NewsEntity newsEntity = (NewsEntity) obj;
		return ((newsEntity.newsId == this.newsId));
	}

}
