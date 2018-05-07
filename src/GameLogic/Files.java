package GameLogic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.swing.filechooser.FileSystemView;

public class Files {
	public static File directory = new File(FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath()
			+ File.separatorChar + ".PalindromeGame");
	public static File Users = new File(directory.getAbsolutePath() + "users.obj");

	public static void makeFiles() {
		try {
			if (Users.exists() != true) {
				System.out.println(Users.createNewFile());
			}
		} catch (IOException e) {
			Users.mkdirs();
			makeFiles();
		}
	}

	public static void serialDump() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Users));
			oos.writeObject(UserService.users);
			oos.close();
		} catch (IOException e) {
			makeFiles();
		}
	}

	@SuppressWarnings("unchecked")
	public static Map<String, User> getFromFile() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Users));
			Map<String, User> m = (Map<String, User>) ois.readObject();
			ois.close();
			return m;
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
			makeFiles();
			return null;
		}
	}
}
