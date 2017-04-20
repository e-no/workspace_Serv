package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResisterUser1
 */
@WebServlet("/ResisterUser1")
public class ResisterUser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResisterUser1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		//フォアード先
		String forwardPath = null;

		//[action]値をリクエストパラメータから取得
		String action  = request.getParameter("action");
		if(action == null){ //登録の開始のリクエスト承認
			forwardPath = "WebContent/registerForm.jsp";
		}else if(action.equals("done")){
		HttpSession session =request.getSession();
		User resisterUser = (User)session.getAttribute("resisterUser");

		//登録処理の呼び出し
		ResisterUserLogic Logic = new ResisterUserLogic();
		Logic.execute(resisterUser);

		//不要となったセッションスコープ内のインスタンスを削除
		session.removeAttribute("resisterUser");

		//登録後のフォアード先を設定
		forwardPath = "WebContent/registerForm.jsp";

		}
	//設定されたフォアード先にフォアード
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
//		request.getRequestDispatcher("ResisterConfirm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		//登録するユーザーの情報を設定
		User resisterUser = new User(id,name,pass);

		HttpSession session =request.getSession();
		session.setAttribute("resisterUser",resisterUser);

		//フォアード
		RequestDispatcher dispather = request.getRequestDispatcher("WebContent/registerForm.jsp");
		dispather.forward(request, response);


		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
