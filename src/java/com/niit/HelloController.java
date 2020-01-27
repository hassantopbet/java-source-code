/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.niit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author khadijatPc
 */
@Controller
public class HelloController {
    
    //"/" Root Request
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Welcome all to NIIT";        
    }
    
    @RequestMapping("/hello")
    @ResponseBody
    public String hellMap(){
        return "Hello All";
    }
    
    //"/name" is called View Resolver
    @RequestMapping(value ="/name", method = RequestMethod.GET)    
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("helloworld");
        mv.addObject("name","Khadijat");
        return mv;        
    }
    
    @RequestMapping(value ="/helloCustomer", method = RequestMethod.GET)    
    public String printCustomer(ModelMap model){
        model.addAttribute("message","Hello welcome to NIIT");
        return "helloworld";
    }
    
    //you need to call this on url in the browser:
    //http://localhost:8080/ClassWork2_FristSpring/addCustomer?names=bisola
    @RequestMapping(value ="/addCustomer", method = RequestMethod.GET)    
    public ModelAndView addCus(@PathParam("name") String names){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("helloworld");
        mv.addObject("name", names);
        return mv;        
    }
    
    //this method load the view which is login.jsp
     @RequestMapping(value = "/Login.soft", method=RequestMethod.GET)
    public ModelAndView getStudentForm(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
    
    //Method for connecting the jsp page with controller
    @RequestMapping(value = "/submitLogin.soft", method=RequestMethod.POST)
    public ModelAndView submitStudentForm(@RequestParam("studentName") String name, @RequestParam("studentLocation") String location){
        ModelAndView mv = new ModelAndView("loginSuccess");
        mv.addObject("msg", "Your information has been submitted by you Name: "+ name + "  Location: " + location);
        return mv;
    }
   
    
} 