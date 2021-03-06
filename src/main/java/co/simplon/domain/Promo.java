package co.simplon.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Promo {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		
		@NotBlank(message = "Name can't empty!")
		private String nom;
		
		@NotBlank(message = "Name can't empty!")
		private Date date_debut;
		
		@NotBlank(message = "Name can't empty!")
		private Date date_fin;
				
//		@OneToMany(mappedBy = "promo")
//		private List <Session> sessions;
		
//		@OneToMany(mappedBy = "promo")
//		private List <Evenement> evenements;
		
}
