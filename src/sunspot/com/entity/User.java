package sunspot.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

	// mobile no is used as userid
	@Id
	@Column(name = "userId", unique = true, nullable = false)
	private long userId;
	
	@Column(name = "role",nullable = false)
	private String role;

	@Column(name = "username",nullable = false)
	private String userName;
	
	@Column(name = "password",nullable = false)
	private String password;
		
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}