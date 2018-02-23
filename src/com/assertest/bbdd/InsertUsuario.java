package com.assertest.bbdd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.assertest.bbdd.Conector;

public class InsertUsuario extends Conector {
	
	public void insert(Usuario usuario) throws SQLException {
		
//		try {
			PreparedStatement pst = super.conexion.prepareStatement("INSERT INTO usuarios (nombre, apellido, edad) values(?,?,?)");
			pst.setString(1, usuario.getNombre());
			pst.setString(2, usuario.getApellido());
			pst.setInt(3, usuario.getEdad());
			
			java.util.Date utilDate = usuario.getFechaNacimiento();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			
			pst.setDate(5, sqlDate);
			
			pst.execute();
			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
	}

}
