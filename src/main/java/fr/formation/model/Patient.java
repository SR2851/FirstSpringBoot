package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Patient {
	@Id
	@GeneratedValue
private long idPatient;
private String nomPatient;
private String prenomPatient;
private String maladie;
@JoinColumn(name="idMedecin")
@ManyToOne
private Medecin medecin;



public Medecin getMedecin() {
	return medecin;
}
public void setMedecin(Medecin medecin) {
	this.medecin = medecin;
}
public long getIdPatient() {
	return idPatient;
}
public void setIdPatient(long idPatient) {
	this.idPatient = idPatient;
}
public String getNomPatient() {
	return nomPatient;
}
public void setNomPatient(String nomPatient) {
	this.nomPatient = nomPatient;
}
public String getPrenomPatient() {
	return prenomPatient;
}
public void setPrenomPatient(String prenomPatient) {
	this.prenomPatient = prenomPatient;
}
public String getMaladie() {
	return maladie;
}
public void setMaladie(String maladie) {
	this.maladie = maladie;
}




public Patient(String nomPatient, String prenomPatient, String maladie, Medecin medecin) {
	super();
	this.nomPatient = nomPatient;
	this.prenomPatient = prenomPatient;
	this.maladie = maladie;
	this.medecin = medecin;
}
@Override
public String toString() {
	return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
			+ ", maladie=" + maladie + ", medecin=" + medecin + "]";
}
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}


}
