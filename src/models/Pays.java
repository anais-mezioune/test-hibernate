package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pays {
	@Id
	String code;
	
	@Column
	String nom;
	
	@Column
	String langue;
	
	public Pays(){
		
	}
	public Pays(String code,String nom,String langue){
		this.code = code;
		this.nom = nom;
		this.langue = langue;
	}
	

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
