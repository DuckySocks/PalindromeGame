package GameLogic;

//import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserService {

	// ObjectMapper OM = new ObjectMapper();
	FileOutputStream outputStream = null;
	PrintStream fileWriter;
	FileReader fileReader;

	public UserService(String filename) {
		/*File file = new File(filename);
		try {
			outputStream = new FileOutputStream(file);
			fileWriter = new PrintStream(file);
			fileReader = new FileReader(file);
			System.out.println(file.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		users = Files.getFromFile();
	}

	public static void main(String[] args) {
		UserService userService = new UserService("player");
		userService.newUser("Natalia", "1234");
		System.out.println(userService.login("Natalia", "1234"));
	}

	public static Map<String, User> users = new HashMap<>();

	public void newUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		users.put(username, user);
		// persist(user);
	}

	public boolean login(String username, String password) {
		// getUserFromFile();
		if (users.containsKey(username)) {
			if (users.get(username).password.equals(password))
				return true;
		}
		return false;
	}
}

/*
 * public class User { String username; String password;
 * 
 * public String getUsername() { return username; }
 * 
 * public void setUsername(String username) { this.username = username; }
 * 
 * public String getPassword() { return password; }
 * 
 * public void setPassword(String password) { this.password = password; } }
 * 
 * public void persist(User user) { // try { //
 * fileWriter.println(OM.writeValueAsString(user)); // } catch (Exception e) {
 * // e.printStackTrace(); // }
 * 
 * }
 * 
 * // public void getUserFromFile() { // users.clear(); // String line; // try {
 * // BufferedReader bufferreader = new BufferedReader(fileReader); // // //
 * while ((line = bufferreader.readLine()) != null) { // /** // Your
 * implementation //
 **/
//
// User user = OM.readValue(line, User.class);
// users.put(user.username, user);
// }
//
// } catch (FileNotFoundException ex) {
// ex.printStackTrace();
// } catch (IOException ex) {
// ex.printStackTrace();
// }
//
// }*/