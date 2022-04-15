package com.projet.BackendPfe.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Consultation {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne()
	protected Generaliste generaliste;
	@ManyToOne()
	protected Expert expert;
	@ManyToOne()
	protected Patient patient;
	@Column(name = "image1Droite", length = 1000000)
	  protected byte[] image1_Droite;
	  @Column(name = "image2Droite", length = 1000000)
	  protected byte[] image2_Droite;
	@Column(name = "image3Droite", length = 1000000)
	  protected byte[] image3_Droite;
	@Column(name = "image4Droite", length = 1000000)
	  protected byte[] image4_Droite;
	@Column(name = "image5Droite", length = 1000000)
	  protected byte[] image5_Droite;
	@Column(name = "image1Gauche", length = 1000000)
	  protected byte[] image1_Gauche;
	  @Column(name = "image2Gauche", length = 1000000)
	  protected byte[] image2_Gauche;
		@Column(name = "image3Gauche", length = 1000000)
		  protected byte[] image3_Gauche;
		@Column(name = "image4Gauche", length = 1000000)
		  protected byte[] image4_Gauche;
		@Column(name = "image5Gauche", length = 1000000)
		  protected byte[] image5_Gauche;

	public byte[] getImage1_Droite() {
		return image1_Droite;
	}
	public void setImage1_Droite(byte[] image1_Droite) {
		this.image1_Droite = image1_Droite;
	}
	public byte[] getImage2_Droite() {
		return image2_Droite;
	}
	public void setImage2_Droite(byte[] image2_Droite) {
		this.image2_Droite = image2_Droite;
	}
	public byte[] getImage3_Droite() {
		return image3_Droite;
	}
	public void setImage3_Droite(byte[] image3_Droite) {
		this.image3_Droite = image3_Droite;
	}
	public byte[] getImage4_Droite() {
		return image4_Droite;
	}
	public void setImage4_Droite(byte[] image4_Droite) {
		this.image4_Droite = image4_Droite;
	}
	public byte[] getImage5_Droite() {
		return image5_Droite;
	}
	public void setImage5_Droite(byte[] image5_Droite) {
		this.image5_Droite = image5_Droite;
	}
	public byte[] getImage1_Gauche() {
		return image1_Gauche;
	}
	public void setImage1_Gauche(byte[] image1_Gauche) {
		this.image1_Gauche = image1_Gauche;
	}
	public byte[] getImage2_Gauche() {
		return image2_Gauche;
	}
	public void setImage2_Gauche(byte[] image2_Gauche) {
		this.image2_Gauche = image2_Gauche;
	}
	public byte[] getImage3_Gauche() {
		return image3_Gauche;
	}
	public void setImage3_Gauche(byte[] image3_Gauche) {
		this.image3_Gauche = image3_Gauche;
	}
	public byte[] getImage4_Gauche() {
		return image4_Gauche;
	}
	public void setImage4_Gauche(byte[] image4_Gauche) {
		this.image4_Gauche = image4_Gauche;
	}
	public byte[] getImage5_Gauche() {
		return image5_Gauche;
	}
	public void setImage5_Gauche(byte[] image5_Gauche) {
		this.image5_Gauche = image5_Gauche;
	}


	
public Consultation() {}
public Consultation(Generaliste generaliste, Patient patient,
		byte[] image1_Droite , byte[] image2_Droite , byte[] image3_Droite , byte[] image4_Droite , byte[] image5_Droite) {
	super();
	this.generaliste = generaliste;
	this.patient = patient;
	this.image1_Droite=image1_Droite ; 
	this.image2_Droite=image2_Droite ; 
	this.image3_Droite=image3_Droite ; 
	this.image4_Droite=image4_Droite;
	this.image5_Droite=image5_Droite ; 
}
public Consultation(Patient patient, Generaliste generaliste, 
		byte[] image1_Gauche , byte[] image2_Gauche , byte[] image3_Gauche , byte[] image4_Gauche , byte[] image5_Gauche) {
	super();
	this.generaliste = generaliste;
	this.patient = patient;
	this.image1_Gauche=image1_Gauche ; 
	this.image2_Gauche=image2_Gauche ; 
	this.image3_Gauche=image3_Gauche ; 
	this.image4_Gauche=image4_Gauche;
	this.image5_Gauche=image5_Gauche ; 
}
	public Consultation(Generaliste generaliste, Patient patient, Expert expert  ,
			byte[] image1_Droite , byte[] image2_Droite , byte[] image3_Droite , byte[] image4_Droite , byte[] image5_Droite) {
		super();
		this.generaliste = generaliste;
		this.patient = patient;
		this.expert = expert;
		this.image1_Droite=image1_Droite ; 
		this.image2_Droite=image2_Droite ; 
		this.image3_Droite=image3_Droite ; 
		this.image4_Droite=image4_Droite;
		this.image5_Droite=image5_Droite ; 
	}
	public Consultation(Patient patient ,Generaliste generaliste, Expert expert  ,
	byte[] image1_Gauche , byte[] image2_Gauche , byte[] image3_Gauche , byte[] image4_Gauche , byte[] image5_Gauche) {
		super();
		this.generaliste = generaliste;
		this.patient = patient;
		this.image1_Gauche=image1_Gauche ; 
		this.image2_Gauche=image2_Gauche ; 
		this.image3_Gauche=image3_Gauche ; 
		this.image4_Gauche=image4_Gauche;
		this.image5_Gauche=image5_Gauche ; 
	}
		public Generaliste getGeneraliste() {
		return generaliste;
	}
	public void setGeneraliste(Generaliste generaliste) {
		this.generaliste = generaliste;
	}
	public Expert getExpert() {
		return expert;
	}
	public void setExpert(Expert expert) {
		this.expert = expert;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	/*@OneToMany(targetEntity=ImageConsultation.class, mappedBy = "consultation")
	private List<ImageConsultation>liste1=new ArrayList<ImageConsultation>();*/
/*@OneToMany(mappedBy="dataConsult",fetch=FetchType.LAZY)
private Collection<Consultation>consultation;*/
}
