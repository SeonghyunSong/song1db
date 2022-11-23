package cs.dit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class LController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); 
		String uri = request.getRequestURI(); //������ �ּ� �޾ƿ�
		String com = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf(".do")); //�ּ�â�� ������/�� .do���̿� ���� �޾Ƽ� com�� ����
		String viewPage = null;
		
		OrderService service = null;
		
		switch (com.trim()){
		case "list":
			service = new OListService();
			service.execute(request, response);//OListService�� ���ٰ� ����Ʈ�� �ٽ� ��
			viewPage = "/WEB-INF/view/list.jsp";
			break;
		case "insertForm":
			service = new OListService();
			service.execute(request, response);//OListService�� ���ٰ� ����Ʈ�� �ٽ� ��
			viewPage = "/WEB-INF/view/insertForm.jsp";
			break;
		case "insert":
			service = new OInsertService();
			service.execute(request, response);//OInsertService�� ���ٰ� ����Ʈ�� �ٽ� ��
			viewPage = "/WEB-INF/view/list.do";
			break;
		case "index":
			viewPage = "/WEB-INF/view/index.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(viewPage); //��Ʈ�ѷ��� ��� ������ �� �ְ��ϴ� �޼ҵ�
		rd.forward(request, response); //rd�� request�� response �� ����
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

}