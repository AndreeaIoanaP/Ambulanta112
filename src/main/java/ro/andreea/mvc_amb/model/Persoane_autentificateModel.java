package ro.andreea.mvc_amb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name="persoane_autentificate")
public class Persoane_autentificateModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_autentificare;
	
	private String medic;
	private String personal_amb;
	private String operator;
	
	public Integer getId_autentificare() {
		return id_autentificare;
	}
	public void setId_autentificare(Integer id_autentificare) {
		this.id_autentificare = id_autentificare;
	}
	public String getMedic() {
		return medic;
	}
	public void setMedic(String medic) {
		this.medic = medic;
	}
	
	public String getPersonal_amb() {
		return personal_amb;
	}
	public void setPersonal_amb(String personal_amb) {
		this.personal_amb = personal_amb;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
}
