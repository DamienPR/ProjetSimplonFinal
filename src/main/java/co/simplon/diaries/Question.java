package co.simplon.diaries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import co.simplon.users.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String content;
	
    @ManyToOne
    private Diary diary ;
    
	@OneToOne
	private Answer answer;

	@ManyToOne
	private Role role;

}
