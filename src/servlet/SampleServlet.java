package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] luckArray = { "Linuxテスト対策", "paiza", "TODOアプリ作成","履歴書作成" };
		int index = new Random().nextInt(4);
		String luck = luckArray[index];

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today = sdf.format(date);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>TODOアプリ出力画面</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>TODOアプリケーション</h1>");
		out.println("<h2>伊藤麗哉のTODOリスト</h2>");
		out.println("<table border='1'>");
		out.println("<tr><th>No</th><th>重要度</th><th>内容</th><th>期日</th></tr>");
		out.println("<tr><td>1</td><td>"+(index + 1)+"</td><td>"+luck+"</td><td>"+today+"</td></tr>");
		out.println("</body>");
		out.println("</html>");
	}

}
