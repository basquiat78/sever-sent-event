package io.basquiat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * View Controller
 * 
 * created by basquiat
 *
 */
@Controller
public class ViewController {

	/**
	 * index html render controller
	 * @param model
	 * @return String
	 */
	@GetMapping("/")
	public String index(final Model model) {
		return "index";
	}

}
