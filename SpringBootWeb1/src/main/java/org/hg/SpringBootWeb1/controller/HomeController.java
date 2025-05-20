package org.hg.SpringBootWeb1.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.hg.SpringBootWeb1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        // System.out.println("Home method called");
        return "index.jsp";
    }

    // @RequestMapping("add")
    // public String add(HttpServletRequest req, HttpSession session) {

    // int num1=Integer.parseInt(req.getParameter("num1"));
    // int num2=Integer.parseInt(req.getParameter("num2"));
    // int result=num1+num2;
    // session.setAttribute("result", result);

    // return "result.jsp";
    // }

    // @RequestMapping("add")
    // public String add(int num1, int num2, Model model) {
    //     int result = num1 + num2;
    //     model.addAttribute("result", result);

    //     return "result.jsp";
    // }

    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView mv) {
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName( "result.jsp");

        return mv;
    }

    @RequestMapping("addStudent")
    public String addStudent(Student student) {
        // System.out.println("Adding student");
        return "welcomePage.jsp";
    }
    
    @ModelAttribute("course")
    public String courseName(){
        return "JAVA";
    }
}
