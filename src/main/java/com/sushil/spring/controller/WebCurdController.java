package com.sushil.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sushil.spring.bean.User;
import com.sushil.spring.service.UserService;

@Controller
@RequestMapping("/")
public class WebCurdController {
	
	@Autowired
	UserService userService;
	
	   @GetMapping(value = "/index")
	    public String getUserList(Model model) {
	        System.out.println("Fetching User with id ");
	       // userService.getUser();
	        model.addAttribute("listUser",  userService.getUser());
	        return "index";
	    }
	   
	   @PostMapping(value="/userAdd")
	   public String addShambhu(@ModelAttribute("user") User user) {
	        System.out.println("Addning user "+user.getName());
	        userService.createUser(user);
	        return "redirect:/index";
	    }
	   
	   @GetMapping(value = "/editUser/{id}")
	    public String getUserById(Model model, @PathVariable("id") Long id) {
	        System.out.println("Fetching User with id "+id);
	        model.addAttribute("user",  userService.findById(id)); 
	        return "/edit";
	    }
	   
	   @GetMapping(value = "/deleteUser/{id}")
	   public String deleteUser( @PathVariable("id") long id) {
		   userService.deleteUserById(id);
	        return "redirect:/index";
	    }
}
