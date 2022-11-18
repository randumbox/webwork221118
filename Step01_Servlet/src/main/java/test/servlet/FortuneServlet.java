package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//3. 어떤 경로 요청을 처리할 것 인지 경로 설정 (반드시 / 로 시작해야 한다.)
@WebServlet("/fortune")
public class FortuneServlet extends HttpServlet{
//1. HttpServlet 클래스를 상속
//2. service() 메소드 오버라이드	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//여기에서 원하는 내용을 응답해 준다. //요청 / 응답 에 해당하는 객체

		//응답 인코딩 설정
	    resp.setCharacterEncoding("utf-8");
	      //응답 컨텐트 설정
	    resp.setContentType("text/html; charset=utf-8");
	    //클라이언트의 웹브라우저에 문자열을 출력할수 있는 객체의 참조값 얻어내기
	    PrintWriter pw = resp.getWriter();
	    pw.println("<!doctype html>");
	    pw.println("<html>");
	    pw.println("<head>");
	    pw.println("<meta charset=\"utf-8\">");
	    pw.println("<title>오늘의 운세 페이지</title>");
	    pw.println("</head>");
	    pw.println("<body>");
	    
	    //오늘의 운세 5가지를 미리 준비 해둔다.
	    String[] fortunes= {"차에 치여 사망", "맨홀 밟고 전치12주", "로또 1등", "집에만 계세요"};
	    
	    Random random = new Random();
	    //0~4 사이의 랜덤한 정수 얻어내기
	    int ranNum=random.nextInt(4);
	    
	    pw.println("<p> 오늘의 운세 :"+fortunes[ranNum]+" </p>");
	    pw.println("</body>");
	    pw.println("</html>");
	    pw.close();//닫아주기
	    
	    
	}
	
}
