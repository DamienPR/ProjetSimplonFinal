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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;
//Lombok pour creer auto les getter/setter
@Getter
@Setter
//Dit a hibernate que ca correspond a une table
@Entity
//Evite de boucler à l'infini dans manyTomany
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@Table ( si nom different de table name ="" )
public class Utilisateur {
	
	//Cle primaire
	@Id
	//Previent que la cle est genere  automatiquement
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String username;
		
	private String password;
	
// Methode utile pour integrer la derniere maj	
// @UpdateTimestamp
// private Timestamp derniereMaj;
	
	//Entité Maitre
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	//name = table de joiture;type_id = foreign key de la table actuelle; role_id = fk de la table opposé
	@JoinTable(name="utilisateur_role", joinColumns = {
			@JoinColumn(name = "utilisateur_id")},inverseJoinColumns = {@JoinColumn(name ="role_id")
			})
//	@JsonManagedReference
	private List <Role> roles ;
//	@ManyToOne
//	private Role role;
}
