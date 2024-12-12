package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home Method Call");
        return "index";
    }

    /*@RequestMapping("/add")
    public String add(HttpServletRequest request, HttpSession httpSession){
        System.out.println("In add method");
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result =num1+num2;

        httpSession.setAttribute("result", result);
        System.out.println(result);
        return "result.jsp";
    }*/

    /*@RequestMapping("/add")
    public String add(@RequestParam("numOne") int num, int num2, HttpSession httpSession){
        System.out.println("Into the request param add method");
        int result =num+num2;

        httpSession.setAttribute("result", result);
        System.out.println(result);

        return "result.jsp";
    }*/

    /* (These API needs ".properties" files)
    @RequestMapping("/add")
    public String add(@RequestParam("numOne") int num, int num2, Model model){
        System.out.println("Into the request param with model obj's add method");
        int result =num+num2;

        model.addAttribute("result", result);
        System.out.println(result);

        return "result";
    }*/

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("numOne") int num, int num2, ModelAndView modelAndView){
        System.out.println("Into the request param with 'modelandview' obj's add method");
        int result =num+num2;

        modelAndView.addObject("result", result);
        modelAndView.setViewName("result");
        System.out.println(result);

        return modelAndView;
    }


}