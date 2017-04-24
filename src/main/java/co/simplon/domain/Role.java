package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

// Lié a Lombok, permet de faire tous les getters/setters

@Data

//Lié a jpa ( dit que c'est une table )
//@Table ( si nom different de table name ="" )

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Role {
	
	
	//lié à jpa,permet d'identifier la primary key
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "Name can't empty!")
	private String nom;
	
	//Entité esclave lié par List <Role> roles
	@ManyToMany(mappedBy = "roles")
	//@JsonBackReference
	private List <Utilisateur> utilisateurs;
	
// Methode utile pour integrer la derniere maj	
//	@UpdateTimestamp
//	private Timestamp derniereMaj;

}
