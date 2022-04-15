package com.projet.BackendPfe.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@DiscriminatorValue(value="AdminMedicalManager")

public class AdminMedicalManager extends User {
	@OneToMany(mappedBy = "admin"/* , cascade = CascadeType.ALL*/)
	@JsonProperty(access =Access.WRITE_ONLY)
	private List<Expert>liste_experts=new ArrayList<Expert>();


	public List<Expert> getListe_experts() {
		return liste_experts;
	}
	public void setListe_experts(List<Expert> liste_experts) {
		this.liste_experts = liste_experts;
	}
	public AdminMedicalManager (String username, String email, String password  , byte[] image  , 
			LocalDate date_inscription , String role) {
		super( username,  email,  password ,  image , date_inscription , role);
	}
		public AdminMedicalManager() {}
		
		public AdminMedicalManager(byte[] image) {
			this.image = image ;
		}
		public LocalDate getDate_inscription() {
			return date_inscription;
		}
	
		public String getUsername(){
			return super.getUsername();}
		
		public void setUsername(){
			 super.setUsername(super.getUsername());	}	 
		
		public String getEmail(){
			return super.getEmail();}
		
		public void setEmail(){
			 super.setEmail(super.getEmail());}
		
		public String getPassword(){
			return super.getPassword();}
		
		public void setPassword(){
			 super.setPassword(super.getPassword());}
		
		public void setImage(){
			 super.setImage(super.getImage());}
		
		public byte[] getImage(){
			return super.getImage();}
		
}
