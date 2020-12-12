package com.clearminds.impl;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.clearminds.exceptions.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	ServicioPersona srv;
	
	public static String leerPropiedad(String leer) {
		String propiedad = null;
		try {
			File file = new File("./config.properties");
			Properties p = new Properties();
			p.load(new FileReader(file));
			propiedad = p.getProperty(leer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propiedad;
	}

	public PersonaManager(){
		try {
			Class<?> clase = Class.forName(leerPropiedad("clase2"));
			srv = (ServicioPersona)clase.newInstance();			
		} catch (InstantiationException e) {
			e.printStackTrace();
			System.out.println("Error al obtener una instancia de persona");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertarPersona(Persona persona) throws InstanceException {
		try {
			srv.insertar(persona);			
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de persona");
		}
	}	
	
}
