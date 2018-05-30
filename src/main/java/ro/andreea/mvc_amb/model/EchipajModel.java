package ro.andreea.mvc_amb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name="echipaj")
public class EchipajModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer nr_echipaj;
	
	private String nr_amb;
	private String asistent;
	private String sofer;
	private String medic;
	public Integer getNr_echipaj() {
		return nr_echipaj;
	}
	public void setNr_echipaj(Integer nr_echipaj) {
		this.nr_echipaj = nr_echipaj;
	}
	public String getNr_amb() {
		return nr_amb;
	}
	public void setNr_amb(String nr_amb) {
		this.nr_amb = nr_amb;
	}
	public String getAsistent() {
		return asistent;
	}
	public void setAsistent(String asistent) {
		this.asistent = asistent;
	}
	public String getSofer() {
		return sofer;
	}
	public void setSofer(String sofer) {
		this.sofer = sofer;
	}
	public String getMedic() {
		return medic;
	}
	public void setMedic(String medic) {
		this.medic = medic;
	}
	

}
