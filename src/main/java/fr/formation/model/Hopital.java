package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hopital {
	@Id
	@GeneratedValue
private long idHopital;
private String nomHopital;
private String villeHopital;
private String adresseHopital;
private double capacite;
public long getIdHopital() {
	return idHopital;
}
public void setIdHopital(long idHopital) {
	this.idHopital = idHopital;
}
public String getNomHopital() {
	return nomHopital;
}
public void setNomHopital(String nomHopital) {
	this.nomHopital = nomHopital;
}
public String getVilleHopital() {
	return villeHopital;
}
public void setVilleHopital(String villeHopital) {
	this.villeHopital = villeHopital;
}
public String getAdresseHopital() {
	return adresseHopital;
}
public void setAdresseHopital(String adresseHopital) {
	this.adresseHopital = adresseHopital;
}
public double getCapacite() {
	return capacite;
}
public void setCapacite(double capacite) {
	this.capacite = capacite;
}
@Override
public String toString() {
	return "Hopital [idHopital=" + idHopital + ", nomHopital=" + nomHopital + ", villeHopital=" + villeHopital
			+ ", adresseHopital=" + adresseHopital + ", capacite=" + capacite + "]";
}
public Hopital(String nomHopital, String villeHopital, String adresseHopital, double capacite) {
	super();
	this.nomHopital = nomHopital;
	this.villeHopital = villeHopital;
	this.adresseHopital = adresseHopital;
	this.capacite = capacite;
}
public Hopital() {
	super();
	// TODO Auto-generated constructor stub
}




	
	
}
