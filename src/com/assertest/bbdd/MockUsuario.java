package com.assertest.bbdd;

import java.util.ArrayList;

public class MockUsuario{
	
	//simula una base de datos
	// http://www.jtech.ua.es/j2ee/publico/lja-2012-13/sesion04-apuntes.html#Pruebas+con+base+de+datos
	
	  ArrayList<Usuario> listaUsuarios;
	  boolean falloConexion;
	  public MockUsuarioDAO(boolean falloConexion) {
		  listaUsuarios = new ArrayList<Usuario>();
		    this.falloConexion = falloConexion;
		  }
		     
		  private void compruebaConexion() throws DAOException {
		    if(falloConexion) {
		      throw new DAOException("Fallo al conectar a la BD");
		    }       
		  }

}
