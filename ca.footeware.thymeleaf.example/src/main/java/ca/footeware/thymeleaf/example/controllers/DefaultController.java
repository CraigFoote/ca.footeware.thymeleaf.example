/**
 * 
 */
package ca.footeware.thymeleaf.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private static final Logger LOG = LoggerFactory.getLogger(DefaultController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getGreeting(Model model) {
		model.addAttribute("greeting", "Hello World!");
		LOG.info("Returning greeting to index");
		return "index";
	}

	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	@ResponseBody
	public String getWeather() {
		LOG.info("Returning 'snow'.");
		return "Snow!";
	}

	@RequestMapping(value = "/weather/{forecast}", method = RequestMethod.POST)
	@ResponseBody
	public String setWeather(@PathVariable("forecast") String setting) {
		LOG.info("Received " + setting);
		return setting;
	}

	@RequestMapping(value = "/weather/{forecast}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteWeather(@PathVariable("forecast") String setting) {
		LOG.info("Deleting " + setting);
		return;
	}
}
