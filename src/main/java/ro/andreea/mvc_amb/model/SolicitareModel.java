package ro.andreea.mvc_amb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name="solicitare")

public class SolicitareModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer nr_solicitare;
	
	private String nume_solicitant;
	private String adresa_solicitare;
	private Date data_solicitarii;
	private Time ora_solicitarii;
	private String motivul_solicitarii;
	private String reper;
	private String detalii_solicitare;
	private String nume_paciunt;
	private float varsta;
	private String sex_pacient;
	private Integer nr_echipaj;
	private String cod;
	private String tel_solicitant;
	private Integer id_autentificare;
	private Time confirmare_solicitare;
	
	public Integer getNr_solicitare() {
		return nr_solicitare;
	}
	public void setNr_solicitare(Integer nr_solicitare) {
		this.nr_solicitare = nr_solicitare;
	}
	public String getNume_solicitant() {
		return nume_solicitant;
	}
	public void setNume_solicitant(String nume_solicitant) {
		this.nume_solicitant = nume_solicitant;
	}
	public String getAdresa_solicitare() {
		return adresa_solicitare;
	}
	public void setAdresa_solicitare(String adresa_solicitare) {
		this.adresa_solicitare = adresa_solicitare;
	}
	public Date getData_solicitarii() {
		return data_solicitarii;
	}
	public void setData_solicitarii(Date data_solicitarii) {
		this.data_solicitarii = data_solicitarii;
	}
	public Time getOra_solicitarii() {
		return ora_solicitarii;
	}
	public void setOra_solicitarii(Time ora_solicitarii) {
		this.ora_solicitarii = ora_solicitarii;
	}
	public String getMotivul_solicitarii() {
		return motivul_solicitarii;
	}
	public void setMotivul_solicitarii(String motivul_solicitarii) {
		this.motivul_solicitarii = motivul_solicitarii;
	}
	public String getReper() {
		return reper;
	}
	public void setReper(String reper) {
		this.reper = reper;
	}
	public String getDetalii_solicitare() {
		return detalii_solicitare;
	}
	public void setDetalii_solicitare(String detalii_solicitare) {
		this.detalii_solicitare = detalii_solicitare;
	}
	public String getNume_paciunt() {
		return nume_paciunt;
	}
	public void setNume_paciunt(String nume_paciunt) {
		this.nume_paciunt = nume_paciunt;
	}
	public float getVarsta() {
		return varsta;
	}
	public void setVarsta(float varsta) {
		this.varsta = varsta;
	}
	public String getSex_pacient() {
		return sex_pacient;
	}
	public void setSex_pacient(String sex_pacient) {
		this.sex_pacient = sex_pacient;
	}
	public Integer getNr_echipaj() {
		return nr_echipaj;
	}
	public void setNr_echipaj(Integer nr_echipaj) {
		this.nr_echipaj = nr_echipaj;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getTel_solicitant() {
		return tel_solicitant;
	}
	public void setTel_solicitant(String tel_solicitant) {
		this.tel_solicitant = tel_solicitant;
	}
	public Integer getId_autentificare() {
		return id_autentificare;
	}
	public void setId_autentificare(Integer id_autentificare) {
		this.id_autentificare = id_autentificare;
	}
	public Time getConfirmare_solicitare() {
		return confirmare_solicitare;
	}
	public void setConfirmare_solicitare(Time confirmare_solicitare) {
		this.confirmare_solicitare = confirmare_solicitare;
	}

}
