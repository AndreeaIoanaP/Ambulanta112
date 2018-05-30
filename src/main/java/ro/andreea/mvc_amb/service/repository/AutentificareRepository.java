package ro.andreea.mvc_amb.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.andreea.mvc_amb.model.Persoane_autentificateModel;

public interface AutentificareRepository extends JpaRepository<Persoane_autentificateModel, Integer> {

	
}
