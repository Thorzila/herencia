package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona {

	public boolean insertar() {
		System.out.println("Insertando persona en la bdd");
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en la bdd");
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en la bdd");
		return true;
	}
	
}
