package ro.andreea.mvc_amb.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.andreea.mvc_amb.model.Persoane_autentificateModel;
import ro.andreea.mvc_amb.service.repository.AutentificareRepository;

@RestController
@RequestMapping("persoane")
public class Persoane_autentificateController {
	
	@Autowired
	private AutentificareRepository autentificareRepository;
	
	/*@RequestMapping("/")
	public Persoane_autentificate Home() {
		// TODO Auto-generated method stub
		Persoane_autentificate connex = new Persoane_autentificate();		
		return connex;
	}*/
	
	@GetMapping("/{id}")
	public String get(@PathVariable("id") Integer id, Map<String, Object> model) {
		Persoane_autentificateModel persoane_autentificateModel = autentificareRepository.getOne(id);
		model.put("persoane", persoane_autentificateModel);
		
		return "Persoane_autentificate";
	}
}
