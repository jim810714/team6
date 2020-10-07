package article.model;

import java.io.Serializable;

public class ArticleBean implements Serializable {

	private int id;
	private String title;
	private int activitysId;
	private int articleType;
	private int showArticle;
	private int memberId;
	/**
	 * 
	 */
	public ArticleBean() {
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the activitysId
	 */
	public int getActivitysId() {
		return activitysId;
	}


	/**
	 * @param activitysId the activitysId to set
	 */
	public void setActivitysId(int activitysId) {
		this.activitysId = activitysId;
	}


	/**
	 * @return the articleType
	 */
	public int getArticleType() {
		return articleType;
	}


	/**
	 * @param articleType the articleType to set
	 */
	public void setArticleType(int articleType) {
		this.articleType = articleType;
	}


	/**
	 * @return the showArticle
	 */
	public int getShowArticle() {
		return showArticle;
	}


	/**
	 * @param showArticle the showArticle to set
	 */
	public void setShowArticle(int showArticle) {
		this.showArticle = showArticle;
	}


	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}


	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	/**
	 * @param id
	 * @param title
	 * @param activitysId
	 * @param articleType
	 * @param showArticle
	 * @param memberId
	 */
	public ArticleBean(int id, String title, int activitysId, int articleType, int showArticle, int memberId) {
		this.id = id;
		this.title = title;
		this.activitysId = activitysId;
		this.articleType = articleType;
		this.showArticle = showArticle;
		this.memberId = memberId;
	}
	
}
