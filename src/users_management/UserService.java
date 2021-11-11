package users_management;

import java.util.LinkedList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class UserService {
	private static List<User> users = new LinkedList<>();
	static {
	    users.add(new User(1L,"Oussama ABDELWAHED","pwd1"));	
        users.add(new User(2L,"Jawher Abdelwahed","pwd2"));	
	}
	
    @WebMethod()
    public User get(@WebParam(name="id") Long id) {
    	System.out.println("Endpoint 'get' has been requested");
    	User u=null;
    	for(User us: users) {
    		if(us.getId() == id) {
    			u = us;
    		    break;
    		}
    	}
    	return u;
    }
    
    @WebMethod
    public void create(@WebParam(name="user") User u) {
    	users.add(u);
    }
    
    @WebMethod
    public boolean update(@WebParam(name="user") User u) {
    	User us = get(u.getId());
    	if(us==null)
    		return false;
    	
    	us.setFullName(u.getFullName());
    	us.setPassword(u.getPwd());
    	return true;
    }
    
    @WebMethod
    public boolean delete(@WebParam(name="id") Long id) {
    	boolean res=false;
    	for(int i=0;i<users.size();i++) {
    		if(users.get(i).getId() == id) {
    			res = true;
    			users.remove(i);
    			break;
    		}
    	}
    	return res;
    }
}
