package com.clearminds.test;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {

		try {
			PersonaManager pm = new PersonaManager();
			Persona persona = new Persona("Juan", "Manzano", 25);	
			//Si utilizo pm.insertarPersona devuelve un null, porque la instancia de la interfaz es null
			pm.insertarPersona(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
