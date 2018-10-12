package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    // request = 사용자가 입력한 정보가 넘어온다.
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password"); // request에 있는 parameter 값
		
		// Build HTML code -> html code를 만들어 클라이언트에게 넘겨주는 작업
		PrintWriter out = response.getWriter();
		String htmlResponse = "<html>";
		htmlResponse += "<h2> your name is " + username +"<br/>";
		htmlResponse += "your password is " + password +"</h2>";
		htmlResponse += "</html>";
		out.print(htmlResponse);
	}

}
