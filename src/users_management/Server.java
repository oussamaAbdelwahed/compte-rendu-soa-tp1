package users_management;

import javax.xml.ws.Endpoint;

public class Server {
    private static final String URL="http://localhost:8086/";
	public static void main(String[] args) {
		System.out.println("Running SERVER...");
		Endpoint.publish(URL, new UserService());
	}

}
