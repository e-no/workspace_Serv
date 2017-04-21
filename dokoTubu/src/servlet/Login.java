package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		User user = new User (name ,pass);

		LoginLogic loginLogic = new LoginLogic();
		boolean isLogin = loginLogic.execute(user);

		//ログイン処理成功
		out.print("OK");
		if(isLogin){
			//USER情報をセッションスコープに格納
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);
		}
		//ログイン画面にフォアード
		RequestDispatcher dispather = request.getRequestDispatcher("/WEB-INF/jsp/LoginResult.jsp");
		dispather.forward(request, response);
	}
}
