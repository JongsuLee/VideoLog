package dev.web.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import dev.web.model.User;

@RestController
public class MainController {
	
	@RequestMapping("/login")
	public ModelAndView third(@RequestParam("userId") String userId,@RequestParam("passwd") String passwd) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("main.jsp");	//이동시킬 페이지명을 문자열값으로 작성
		modelAndView.addObject("userId", userId);
		modelAndView.addObject("passwd", passwd);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoLog");	
		EntityManager em = emf.createEntityManager();	
		
		TypedQuery<User> query = em.createQuery("select u from User u where userid = :userid and passwd = :passwd", User.class);	//SELECT * FROM STUDENT WHERE id = 1;
		query.setParameter("userid", userId);
		query.setParameter("passwd", passwd);
		User user = query.getSingleResult();	//SELECT * FROM STUDENT WHERE id = 1;
		System.out.println(user);
		//학생 인스턴스(변환된 엔티티)를 통해서 전공명 확인
		
		return modelAndView;
	}

}
