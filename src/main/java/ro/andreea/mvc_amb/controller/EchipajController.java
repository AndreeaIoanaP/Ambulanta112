package ro.andreea.mvc_amb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.andreea.mvc_amb.model.EchipajModel;
import ro.andreea.mvc_amb.service.repository.EchipajRepository;

@RestController
@RequestMapping("echipaj")
public class EchipajController {
	@Autowired
	private EchipajRepository echipajRepository;
	
	/*@RequestMapping("/")
	public Echipaj Home() {
		// TODO Auto-generated method stub
		Echipaj echipaj = new Echipaj();		
		return echipaj;
	}*/
	
	@GetMapping("/{id}")
	public EchipajModel get(@PathVariable("id") Integer id) {
		return echipajRepository.getOne(id);
	}

	
}
