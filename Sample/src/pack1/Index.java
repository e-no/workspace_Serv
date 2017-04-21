package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();

		ServletContext application = this.getServletContext();
		SiteEv siteEv = (SiteEv) application.getAttribute("siteEv");

		if(siteEv == null){
			siteEv = new SiteEv();
		}

		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		//サイトの評価処理
		SiteEvLogic siteEvLogic = new SiteEvLogic();
		if(action != null&&action.equals("like") ){	siteEvLogic.like(siteEv);
		}else if(action != null&&action.equals("dislike") ){	siteEvLogic.dislike(siteEv);
		}


		//アプリケーションスコープに評価を保存
		application.setAttribute("siteEv", siteEv);

		//フォアード
		RequestDispatcher dispather = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		dispather.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
