package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	DataSource dataSource;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		try {
			Class.forName("org.postgresql.Driver");
			//on classpath
		} catch(ClassNotFoundException e) {
			// not on classpath
			System.out.println(e.getLocalizedMessage());
		}
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}