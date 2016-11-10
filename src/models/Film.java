package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Film {
	@Id
	public long id;
	
	@Column
	public short annee;
	
	@Column
	public String titre;
	
	@Column
	public String genre;
	
	@Column
	public String resume;

	@ManyToOne
	@JoinColumn(name="code_pays")
	public Pays pays;
}
