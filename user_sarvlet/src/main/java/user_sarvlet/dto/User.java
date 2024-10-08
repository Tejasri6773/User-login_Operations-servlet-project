package user_sarvlet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastName;
	@Column(unique=true)
	private String email;
	private String password;
	private long phone;
	private int age;
	private String gender;
	public User(String firstname, String lastName, String email, String password, long phone, int age, String gender) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}
	public User(int id, String firstname, String lastName, String email, String password, long phone, int age,
			String gender) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	

}
