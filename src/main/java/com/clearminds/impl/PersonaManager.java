package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	ServicioPersona srv;

	public PersonaManager(){
		try {
			Class<?> clase = Class.forName("com.clearminds.interfaces.ServicioPersona");
			srv = (ServicioPersona)clase.newInstance();			
		} catch (InstantiationException e) {
			e.printStackTrace();
			System.out.println("Error al obtener una instancia de persona");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertarPersona(Persona persona){
		srv.insertar(persona);
	}	
	
}
