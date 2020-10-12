package article.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.dao.ArticleDao;
import article.dao.impl.WriteArticleImpl_Jdbc;
import article.model.AllArticleBean;

/**
 * Servlet implementation class ArticleShow
 */
@WebServlet("/ArticleShow")
public class ArticleShow extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ArticleShow() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleDao articleDao = new WriteArticleImpl_Jdbc();
		String articletypesIdStr = request.getParameter("articletypesId");
		int articletypesId = Integer.parseInt(articletypesIdStr);
		Collection<AllArticleBean> collection = articleDao.getAllArticles(articletypesId);
		
		if (request.getParameter("one") != null) {
			
		}else if (request.getParameter("two") != null) {
			
		}else {
			System.out.println("404");
		}
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
