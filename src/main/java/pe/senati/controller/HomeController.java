package pe.senati.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
	public HomeController() {}

	@GetMapping("/home")
	public String home_GET() {
		return "home";
	}
}