package co.simplon.userdto;

import lombok.Data;

@Data
public class UserDto {

	private long id;
	
	private String firstname;
	
	private String lastname;
			
	private String persomail;
	
	private RoleDto roledto;
}
