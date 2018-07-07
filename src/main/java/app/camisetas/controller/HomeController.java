package app.camisetas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.camisetas.model.Camiseta;
import app.camisetas.service.ICamisetasService;

@Controller
public class HomeController {
	
	@Autowired
	private ICamisetasService camisetasService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome() {
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String goAdd() {
		Camiseta camiseta = new Camiseta();
		camiseta.setMarca("Under Armor");
		camiseta.setTalle('M');
		camiseta.setColor("Blanco/Rojo");
		camiseta.setPrecio(85000.0);
		System.out.println(camiseta);
		camisetasService.insert(camiseta);
		return "home";
	}
}
