package com.projet.BackendPfe.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value="Expert")

public class Expert extends User {
	protected String gender ;
	protected long telephone ;
	@ManyToOne
	private AdminMedicalManager admin;
	 @OneToMany(targetEntity=Consultation.class, mappedBy = "expert",fetch=FetchType.LAZY)
		private List<Consultation>liste1=new ArrayList<Consultation>();
	public Expert( String username, String email, String password, 
			String gender, long telephone , byte[] image, LocalDate date_inscription , String role   ) {
		super(username,email,password,image , date_inscription , role );
		this.gender=gender;
		this.telephone=telephone;
	
	
	}
	public Expert( String username, String email, String password, 
			String gender, long telephone , byte[] image , AdminMedicalManager admin , LocalDate date_inscription , String role   ) {
		super(username,email,password,image , date_inscription ,  role );
		this.gender=gender;
		this.telephone=telephone;
		this.admin= admin ; 
	
	}

	public Expert(byte[]image) {
		this.image=image ;
	}
	public Expert() {
		super();
	}
	public LocalDate getDate_inscription() {
		return date_inscription;
	}

	 public String getGender() {
			return gender;
		}
		
		public void setGender(String gender) {
			this.gender = gender;
		}

	public  byte[] getImage() {
		return image ; 
	}
	public  void setImage(byte[] image) {
		this.image = image;
	}
		public long getTelephone() {
			return telephone;
		}

		public void setTelephone(long telephone) {
			this.telephone = telephone;
		}

		public String getUsername(){
			return super.getUsername();
		}
		

		public void setUsername(){
			 super.setUsername(super.getUsername());
			 
		}
		public String getEmail(){
			return super.getEmail();
		}
		

		public void setEmail(){
			 super.setEmail(super.getEmail());
		}
		
		
		public String getPassword(){
			return super.getPassword();
		}
		
		public void setPassword(){
			super.setPassword(super.getPassword());
		}	

		

	

@Override
	public String toString() {
		return "Expert [gender=" + gender + ", telephone=" + telephone + ", id=" + id + ", username=" + username
				+ ", email=" + email + ", password=" + password + ", image=" + image + "]";
	}
public AdminMedicalManager getAdmin() {
	return admin;
}
public void setAdmin(AdminMedicalManager admin) {
	this.admin = admin;
}
}
