package com.zent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zent.bo.UserBO;
import com.zent.dto.UserDTO;
import com.zent.service.IUserService;
import com.zent.service.UserService;
import com.zent.util.DTOUtil;

@Controller
public class UserController {
	@Autowired
	IUserService userService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		userService.findAll();
		return "";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute("user", new UserDTO());
		return "user-add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String getAdd(@ModelAttribute("user") UserDTO user) {
		UserBO uBO = DTOUtil.map(user, UserBO.class);
		return "user-add";
	}
}
