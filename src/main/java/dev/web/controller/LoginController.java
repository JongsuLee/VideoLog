package dev.web.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dev.web.model.User;

@Controller
public class LoginController {
	
	@RequestMapping("/member/login")
	public ModelAndView third(@RequestParam("userId") String userId,@RequestParam("passwd") String passwd, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("../main.jsp");	//이동시킬 페이지명을 문자열값으로 작성
		modelAndView.addObject("userId", userId);
		modelAndView.addObject("passwd", passwd);
		
		System.out.println(123);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoLog");	
		EntityManager em = emf.createEntityManager();	
//		userId = "ARI";
//		passwd = "1234";
		
		TypedQuery<User> query = em.createQuery("select u from User u where USERID = :userid and PASSWD = :passwd", User.class);	//SELECT * FROM STUDENT WHERE id = 1;
		query.setParameter("userid", userId);
		query.setParameter("passwd", passwd);
		User user = query.getSingleResult();	//SELECT * FROM STUDENT WHERE id = 1;
		System.out.println(user);
		request.setAttribute("login", user);
		//학생 인스턴스(변환된 엔티티)를 통해서 전공명 확인
		
		return modelAndView;
	}

}
