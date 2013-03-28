import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

public class PersonaGSON {

	public static void main(String[] args) {

		PersonaDAO userDAO = new PersonaDAO(Persona.class);
		ArmaDAO armaDAO = new ArmaDAO(Arma.class);
		// User u = new User();
		List<Persona> users = null;
		List<Arma> arme = null;
		try {

			users = userDAO.findAll();
			arme = armaDAO.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Gson gson = new Gson();
		String usersJson = gson.toJson(users);
		String armeJson = gson.toJson(arme);
		System.out.println(usersJson);
		System.out.println(armeJson);

		try {
			FileWriter writer = new FileWriter("users.json");
			writer.write(usersJson);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer1 = new FileWriter("arme.json");
			writer1.write(armeJson);
			writer1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
