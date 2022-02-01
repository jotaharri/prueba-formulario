package com.globalia.belive.prueba.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.globalia.belive.prueba.models.UserModel;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@PostMapping (value = { "create" })
	public ModelAndView createUser(HttpServletRequest request,Model model, UserModel userModel) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("html/data-user");
		// Pasamos modelo a la vista
		model.addAttribute("userModel", userModel);

		return modelAndView;
	}

}
