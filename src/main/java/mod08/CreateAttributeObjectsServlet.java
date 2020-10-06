package mod08;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mod08.model.CustomerBean;
import mod08.service.Mod08Service;

/**
 * Servlet implementation class CreateAttributeObjectsServlet
 */
@WebServlet("/abc/def")
public class CreateAttributeObjectsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		Mod08Service service = new Mod08Service();
		String case01 = service.getSingleString(); // "快樂學JSP^^^^^^^^^^^"
		CustomerBean case02 = service.getJavaBean();
		request.setAttribute("StringToken",case01);
		request.setAttribute("BeanToken",case02);
		
		Map<String,Object> case03 = new HashMap<String, Object>();
		case03.put("key001","key001對應的值");
		case03.put("key002",case02);
		request.setAttribute("MapToken", case03);
		
		
		RequestDispatcher rd =request.getRequestDispatcher("/mod08/ShowAttributeObject01.jsp"); 
		rd.forward(request, response);
		return;
	}




}
