package article.dao;

import article.model.ArticleBean;

public interface ArticleDao {

	public int saveArticle(ArticleBean ab);
	public int deleteArticle(int no);
}
