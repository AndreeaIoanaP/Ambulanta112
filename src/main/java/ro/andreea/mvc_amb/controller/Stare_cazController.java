package ro.andreea.mvc_amb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.andreea.mvc_amb.model.Stare_cazModel;
import ro.andreea.mvc_amb.service.repository.Stare_cazRepository;

@RestController
@RequestMapping("starecaz")
public class Stare_cazController {
	@Autowired
	private Stare_cazRepository stare_cazRepository;
	
	/*@RequestMapping("/")
	public Stare_caz Home() {
		// TODO Auto-generated method stub
		Stare_caz caz = new Stare_caz();		
		return caz;
	}*/
	
	@GetMapping("/{id}")
	public Stare_cazModel get(@PathVariable("id") Integer id) {
		return stare_cazRepository.getOne(id);
	}

}
