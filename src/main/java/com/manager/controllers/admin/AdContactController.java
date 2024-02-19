package com.manager.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "admin" })
public class AdContactController {
	// getList
	@RequestMapping(value = { "contact" }, method = RequestMethod.GET)
	public String TableContact() {
		return "admin/table/contact";
	}

}