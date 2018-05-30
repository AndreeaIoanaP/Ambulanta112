package ro.andreea.mvc_amb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.andreea.mvc_amb.model.SolicitareModel;
import ro.andreea.mvc_amb.service.repository.SolicitareRepository;

@RestController
@RequestMapping("solicitare")
public class SolicitareController {
	@Autowired
	private SolicitareRepository solicitareRepository;
	
	/*@RequestMapping("/")
	public Solicitare Home() {
		// TODO Auto-generated method stub
		Solicitare sol = new Solicitare();		
		return sol;
	}*/
	
	@GetMapping("/{id}")
	public SolicitareModel get(@PathVariable("id") Integer id) {
		return solicitareRepository.getOne(id);
	}

}
