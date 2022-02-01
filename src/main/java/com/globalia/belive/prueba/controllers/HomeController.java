package com.globalia.belive.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.globalia.belive.prueba.models.UserModel;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@Autowired
	private CacheManager cacheManager;

	@GetMapping (value = { "/" })
	public ModelAndView loadFormPage(HttpServletRequest request,Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("html/form-page");
		// Pasamos modelo a la vista
		model.addAttribute("userModel", new UserModel());

		return modelAndView;
	}

}
