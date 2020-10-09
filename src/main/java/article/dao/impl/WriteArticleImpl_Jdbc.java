package article.dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.annotation.MultipartConfig;
import javax.sql.DataSource;

import article.dao.ArticleDao;
import article.model.ArticleBean;

@MultipartConfig

public class WriteArticleImpl_Jdbc implements Serializable, ArticleDao {
	private static final long serialVersionUID = 1L;
	public static final String JNDI_DB_NAME = "java:comp/env/jdbc/BookDataSQLver";
	DataSource ds = null;
	
	public WriteArticleImpl_Jdbc() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup(JNDI_DB_NAME);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("BookDaoImpl_Jdbc()#建構子發生例外: " 
										+ ex.getMessage());
		}
	}
	
	// 新增一筆記錄---
		public int saveArticle(ArticleBean ab) {
			int n = 0;

//			String sql = "INSERT INTO Article " 
//					+ " (id, title, ACTIVITYS_ID, SHOW_ARTICLE, "
//					+ " MEMBER_ID, articletypes_id) " 
//					+ " VALUES (?, ?, ?, ?, ?, ?)";
			
			String sql = "INSERT INTO Article " 
					+ " (title, ACTIVITYS_ID, SHOW_ARTICLE, "
					+ " MEMBER_ID, articletypes_id) " 
					+ " VALUES (?, ?, ?, ?, ?)";

//			InputStream blobStream = null;
			try (
				Connection connection = ds.getConnection();
				PreparedStatement pStmt = connection.prepareStatement(sql);
			) {
//				pStmt.setInt(1, ab.getId());
//				pStmt.setString(2, ab.getTitle());
//				pStmt.setInt(3, ab.getActivitysId());
//				pStmt.setInt(4, ab.getShowArticle());
//				pStmt.setInt(5, ab.getMemberId());
//				pStmt.setInt(6, ab.getArticleType());
				
				
				pStmt.setString(1, ab.getTitle());
				pStmt.setInt(2, ab.getActivitysId());
				pStmt.setInt(3, ab.getShowArticle());
				pStmt.setInt(4, ab.getMemberId());
				pStmt.setInt(5, ab.getArticleType());
				
								
				n = pStmt.executeUpdate();
			} catch (SQLException ex) {
				ex.printStackTrace();
				throw new RuntimeException("WriteArticleImpl_Jdbc()#addArticle()發生例外: " 
											+ ex.getMessage());
			}finally {
				
			}
			return n;
		}		
}
