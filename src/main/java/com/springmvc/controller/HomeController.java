package com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.dao.EmpDao;
import com.springmvc.dao.UserDao;
import com.springmvc.entity.Emp;
import com.springmvc.entity.User;

@Controller
public class HomeController {
    
    @Autowired
    private EmpDao empDao;
    
    @Autowired
    private UserDao userDao;

    @RequestMapping(path = "/home")
    public String home(Model m) {
        
        List<Emp> list = empDao.getAllEmp();
        m.addAttribute("empList", list);
        
        return "home";
    }
    
    @RequestMapping(path = "/addEmp")
    public String addEmp() {
        return "add_emp";
    }
    
    @RequestMapping(path = "/createEmp", method = RequestMethod.POST)
    public String createEmp(@ModelAttribute Emp emp, HttpSession session) {
        
        System.out.println(emp);
        
        int id = empDao.saveEmp(emp);
        session.setAttribute("msg", "Employee added successfully!");
        
        return "redirect:/addEmp";
    }
    
    @RequestMapping(path = "/editEmp/{id}")
    public String editEmp(@PathVariable int id, Model m) {
        
        Emp emp = empDao.getEmpById(id);
        m.addAttribute("emp", emp);
        
        return "edit_emp";
    }
    
    @RequestMapping(path = "/updateEmp", method = RequestMethod.POST)
    public String updateEmp(@ModelAttribute Emp emp, HttpSession session) {
        
        empDao.update(emp);
        session.setAttribute("msg", "Employee details updated successfully!");
        
        return "redirect:/home";
    }
    
    @RequestMapping(path = "/deleteEmp/{id}")
    public String deleteEmp(@PathVariable int id, HttpSession session) {
        
        empDao.deleteEmp(id);
        session.setAttribute("msg", "Employee deleted successfully!");
        
        return "redirect:/home";
    }
    
    @RequestMapping("/register")
    public String registerPage() {
        return "register";
    }
    
    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @RequestMapping(path = "/createUser", method = RequestMethod.POST)
    public String register(@ModelAttribute User user, HttpSession session) {
        
        System.out.println(user);
        
        userDao.saveUser(user);
        session.setAttribute("msg", "You have successfully registered!");
        
        return "redirect:/register";
    }
    
    @RequestMapping(path = "/userlogin", method = RequestMethod.POST)
    public String login(@RequestParam("email") String em, @RequestParam("password") String pwd, HttpSession session) {
        
        User user = userDao.loginUser(em, pwd);
        
        if (user != null) {
            session.setAttribute("loginuser", user);
            session.setAttribute("msg", "Welcome back, " + user.getFullName() + "! You have successfully logged in.");
            return "profile";
        } else {
            session.setAttribute("msg", "Invalid email or password. Please try again.");
            return "redirect:/login";
        }
    }
    
    @RequestMapping("/myProfile")
    public String myProfile() {
        return "profile";
    }
    
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        
        HttpSession session = request.getSession();
        session.removeAttribute("loginuser");
        session.setAttribute("msg", "You have successfully logged out.");
        
        return "login";
    }
}
