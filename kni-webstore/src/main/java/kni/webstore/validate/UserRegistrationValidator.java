package kni.webstore.validate;

import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@FieldMatchUser.List({ 
	@FieldMatchUser(first = "password", second = "confirmPassword", message = "Hasla musza byc takie same!") ,
	@FieldMatchUser(first = "email", second = "confirmEmail", message = "Podane maile nie sa takie same!") 
})
public class UserRegistrationValidator {
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Email
	private String confirmEmail;
	@NotEmpty
	private String password;
	@NotEmpty
	private String confirmPassword;
	@AssertTrue
	private boolean terms;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public boolean isTerms() {
		return terms;
	}
	public void setTerms(boolean terms) {
		this.terms = terms;
	}
	
}
