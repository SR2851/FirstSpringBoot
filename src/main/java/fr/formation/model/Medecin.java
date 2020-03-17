package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Medecin {
	@Id
	@GeneratedValue
private long idMedecin;
private String nomMedecin;
private String prenomMedecin;
private String specialite;
@JoinColumn(name="idHopital")
@ManyToOne
private Hopital hopital;



public Hopital getHopital() {
	return hopital;
}
public void setHopital(Hopital hopital) {
	this.hopital = hopital;
}
public long getIdMedecin() {
	return idMedecin;
}
public void setIdMedecin(long idMedecin) {
	this.idMedecin = idMedecin;
}
public String getNomMedecin() {
	return nomMedecin;
}
public void setNomMedecin(String nomMedecin) {
	this.nomMedecin = nomMedecin;
}
public String getPrenomMedecin() {
	return prenomMedecin;
}
public void setPrenomMedecin(String prenomMedecin) {
	this.prenomMedecin = prenomMedecin;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}

@Override
public String toString() {
	return "Medecin [idMedecin=" + idMedecin + ", nomMedecin=" + nomMedecin + ", prenomMedecin=" + prenomMedecin
			+ ", specialite=" + specialite + ", hopital=" + hopital + "]";
}
public Medecin(String nomMedecin, String prenomMedecin, String specialite, Hopital hopital) {
	super();
	this.nomMedecin = nomMedecin;
	this.prenomMedecin = prenomMedecin;
	this.specialite = specialite;
	this.hopital = hopital;
}
public Medecin() {
	super();
	// TODO Auto-generated constructor stub
}



}
