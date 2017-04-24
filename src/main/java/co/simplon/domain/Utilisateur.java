package co.simplon.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "Type can't empty!")
	private String nom;
	
	@NotBlank(message = "Type can't empty!")
	private String prenom;
	
	@NotBlank(message = "Type can't empty!")
	private String mot_de_passe;
	
	private String mail_perso;
	
	private String mail_responsable;
	
	//Entité Maitre
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	//name = table de joiture;type_id = foreign key de la table actuelle; role_id = fk de la table opposé
	@JoinTable(name="utilisateur_role", joinColumns = {
			@JoinColumn(name = "utilisateur_id")},inverseJoinColumns = {@JoinColumn(name ="role_id")
			})
	//@JsonManagedReference
	private List <Role> roles ;
	
}
