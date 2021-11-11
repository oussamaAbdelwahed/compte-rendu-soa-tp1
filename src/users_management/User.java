package users_management;

import javax.xml.bind.annotation.XmlTransient;


public class User {
    private String fullName;
    private Long id;
    private String password;

    public User() {}
	public User(Long id,String fullName,  String password) {
		super();
		this.fullName = fullName;
		this.id = id;
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
    @XmlTransient
	public String getPwd() {
		return password;
	}
	

	public String getPassword() {
		return "";
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
