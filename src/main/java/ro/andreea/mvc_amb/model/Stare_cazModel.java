package ro.andreea.mvc_amb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name="stare_caz")
public class Stare_cazModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_stare_caz;
	
	private String solicitare_falsa;
	private String anulare_pe_parcurs;
	private String plecare_alt_mijloc;
	private String neasigurat;
	private String asigurat;
	private String domiciliu;
	private String predare_alt_echipaj;
	private String predare_camera_garda;
	private String predat_UPU;
	public Integer getId_stare_caz() {
		return id_stare_caz;
	}
	public void setId_stare_caz(Integer id_stare_caz) {
		this.id_stare_caz = id_stare_caz;
	}
	public String getSolicitare_falsa() {
		return solicitare_falsa;
	}
	public void setSolicitare_falsa(String solicitare_falsa) {
		this.solicitare_falsa = solicitare_falsa;
	}
	public String getAnulare_pe_parcurs() {
		return anulare_pe_parcurs;
	}
	public void setAnulare_pe_parcurs(String anulare_pe_parcurs) {
		this.anulare_pe_parcurs = anulare_pe_parcurs;
	}
	public String getPlecare_alt_mijloc() {
		return plecare_alt_mijloc;
	}
	public void setPlecare_alt_mijloc(String plecare_alt_mijloc) {
		this.plecare_alt_mijloc = plecare_alt_mijloc;
	}
	public String getNeasigurat() {
		return neasigurat;
	}
	public void setNeasigurat(String neasigurat) {
		this.neasigurat = neasigurat;
	}
	public String getAsigurat() {
		return asigurat;
	}
	public void setAsigurat(String asigurat) {
		this.asigurat = asigurat;
	}
	public String getDomiciliu() {
		return domiciliu;
	}
	public void setDomiciliu(String domiciliu) {
		this.domiciliu = domiciliu;
	}
	public String getPredare_alt_echipaj() {
		return predare_alt_echipaj;
	}
	public void setPredare_alt_echipaj(String predare_alt_echipaj) {
		this.predare_alt_echipaj = predare_alt_echipaj;
	}
	public String getPredare_camera_garda() {
		return predare_camera_garda;
	}
	public void setPredare_camera_garda(String predare_camera_garda) {
		this.predare_camera_garda = predare_camera_garda;
	}
	public String getPredat_UPU() {
		return predat_UPU;
	}
	public void setPredat_UPU(String predat_UPU) {
		this.predat_UPU = predat_UPU;
	}
	

}
