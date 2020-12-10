package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager implements ServicioPersona{
	
	ServicioPersona serv;
	
	public PersonaManager(){
		ServicioPersonaBDD serv = new ServicioPersonaBDD();
	}
	
	//Este método devuelve un null pointer porque la instancia de ServicioPersona es null
	//Me vi obligado a implementar la interfaz para poder utilizar sus métodos y no obtener la excepción
	public void insertarPersona(Persona persona){
		try {
			ServicioPersonaArchivos srvArchivos = new ServicioPersonaArchivos();
			srvArchivos.insertar(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean insertar(Persona persona) {
		System.out.println("Insertar");
		return true;
	}

	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean eliminar(Persona persona) {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}
