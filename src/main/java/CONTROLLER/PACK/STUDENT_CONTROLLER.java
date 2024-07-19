package CONTROLLER.PACK;

import java.util.List;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import STUDENT_ENTITY.Student;
import Student_dao.Student_dao;

@Controller
public class STUDENT_CONTROLLER {
	
	Student_dao dao=new Student_dao();
	
	@RequestMapping("/student_register")
	
	
	public ModelAndView student_register()
	{
		Student s=new Student();
		
		ModelAndView mav=new ModelAndView("Student_register");
		mav.addObject("student",s);
		
		return mav;
		
	}
	@RequestMapping("/student_save")
	public ModelAndView save_student(@ModelAttribute("student") Student s)
	{
		
		dao.save_student(s);
		ModelAndView mav=new ModelAndView("Home");
		mav.addObject("save","Save student successfully");
		return mav;
		
	}

	@RequestMapping("/view_all_student")
	public ModelAndView view()
	{
		
	List<Student> all_students=	dao.view_all_students();
		ModelAndView mav=new ModelAndView("view_all_students");
		
		mav.addObject("view_students",all_students);
		
		return mav;
	}
	
	@RequestMapping("/Delete_student")
	public ModelAndView delete_student()
	{
		List<Student> all_students=	dao.view_all_students();
		ModelAndView mav=new ModelAndView("delete_student");
		
		mav.addObject("view_students",all_students);
		
		return mav;
	}
	
	@RequestMapping("/delete_student")
	public ModelAndView deletestudent_byid( @RequestParam("id") int id)
	{
		
		dao.delete_studentbyid(id);
		
		List<Student> all_students=	dao.view_all_students();
		ModelAndView mav=new ModelAndView("delete_student");
		
		mav.addObject("view_students",all_students);
		
		return mav;
	}
	
	@RequestMapping("/Edit_student")
	public ModelAndView edit_student()
	{
		List<Student> all_students=	dao.view_all_students();
		ModelAndView mav=new ModelAndView("Edit_student");
		
		mav.addObject("view_students",all_students);
		
		return mav;
	}
	
	@RequestMapping("/Edit_student_inf")
	public ModelAndView edit_student_by_id(@RequestParam("id") int id)
	{
	Student s=dao.find_by_id(id);
	
	ModelAndView mav=new ModelAndView("update_student");
	mav.addObject("edit_student",s);
		
		return mav;
	}
	
	@RequestMapping("/update_student")
	public ModelAndView update_student(ServletRequest req)
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String e_mail=req.getParameter("E_mail");
		long phone=Long.parseLong(req.getParameter("phoneno"));
		String address=req.getParameter("Address");
		String gender=req.getParameter("gender");
		String dateofbirth=req.getParameter("Dateofbirth");
		
		Student s=dao.find_by_id(id);
		s.setId(id);
		s.setName(name);
		s.setE_mail(e_mail);
		s.setPhoneno(phone);
		s.setAddress(address);
		s.setGender(gender);
		s.setDateofbirth(dateofbirth);
		
		dao.updatestudent(s);
		
		ModelAndView mav=new ModelAndView("redirect:/Edit_student");
		
		return mav;
	}
}
