package com.assertest.bbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	
	protected Connection conexion;
	
	Conector(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
					
	}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e){
		e.printStackTrace();
	}

	}
	public Connection getConectio(){
		 return conexion;
	}
		public void setConectio(Connection conexion){
			this.conexion = conexion;
		}	
}

	
	
	
