package com.example.springmvc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.Alien;

// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
    
	@Autowired
	AlienRepo repo;
	
	@GetMapping("/")
    public String home()
    {
        System.out.println("Home Page requested...");
        return "index"; //metadata for file path and extension is stored in application.properties
    }

//    @PostMapping("/add")
//    // 3 ways to process this request
//    // 1. 
//    // public String add(HttpServletRequest reqBody) {
//    //     try {
//    //         int num1 = Integer.parseInt(reqBody.getParameter("num1"));
//    //         int num2 = Integer.parseInt(reqBody.getParameter("num2"));
//    //         System.out.println(num1 + num2);
//    //         HttpSession session = reqBody.getSession();
//    //         session.setAttribute("num3", num1 + num2);
//    //         return "result.jsp";    
//    //     } catch (Exception e) {
//    //         return "error.jsp";
//    //     }
//    // }
//
//    // 2.
//    // public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session) {
//    //     try {
//    //         System.out.println(num1 + num2);
//    //         session.setAttribute("num3", num1 + num2);
//    //         return "result.jsp";    
//    //     } catch (Exception e) {
//    //         return "error.jsp";
//    //     }
//    // }
//
//    // 3.
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//        System.out.println(num1 + num2);
//        ModelAndView mv = new ModelAndView();
//        try {
//            mv.setViewName("result");
//            mv.addObject("num3", num1 + num2);
//
//        } catch (Exception e) {
//            mv.setViewName("error");
//        }
//        return mv;
//    }

    // @RequestMapping("addAlien")
    // public String addAlien(Alien a, Model m){
    //     m.addAttribute("alien", a);
    //     return "result";
    // }
    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien){
        // m.addAttribute("alien", a);
        return "result";
    }
    
    @GetMapping("getAliens")
    public String getAliens(Model m){
    	m.addAttribute("alien", repo.findAll());
    	return "result";
    }
}
