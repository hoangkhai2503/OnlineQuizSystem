package com.manager.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manager.service.CodeTestService;

@Controller
@RequestMapping({ "admin" })
public class AdCodeTestController {
	@Autowired
	private CodeTestService codeTestService;
	// getList
	@RequestMapping(value = { "codetest" }, method = RequestMethod.GET)
	public String TableCodeTest(ModelMap modelMap) {
		modelMap.put("codetests", codeTestService.findAll());
		return "admin/table/codetest";
	}

}