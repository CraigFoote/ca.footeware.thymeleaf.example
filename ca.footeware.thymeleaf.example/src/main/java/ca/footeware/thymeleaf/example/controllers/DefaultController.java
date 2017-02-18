/**
 * 
 */
package ca.footeware.thymeleaf.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author footeware.ca
 *
 */
@Controller
public class DefaultController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getGreeting(Model model) {
		model.addAttribute("greeting", "Hello World!");
		return "index";
	}

	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	@ResponseBody
	public String getWeather() {
		return "Sunny!";
	}

	@RequestMapping(value = "/weather/{setting}", method = RequestMethod.POST)
	@ResponseBody
	public String setWeather(@PathVariable("setting") String setting) {
		return setting;
	}
}