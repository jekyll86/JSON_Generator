package GSON;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import model.Arma;
import model.Persona;

import DAO.ArmaDAO;
import DAO.PersonaDAO;

import com.google.gson.Gson;

public class PersonaGSON {

	public static void main(String[] args) {

		PersonaDAO userDAO = new PersonaDAO(Persona.class);

		List<Persona> users = null;

		try {
			users = userDAO.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Gson gson = new Gson();
		String usersJson = gson.toJson(users);
		System.out.println(usersJson);	

		try {
			FileWriter writer = new FileWriter("users.json");
			writer.write(usersJson);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	

	}
}