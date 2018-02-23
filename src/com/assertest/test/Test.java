package com.assertest.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

public class Test {

	@org.junit.Test
	public void test() {
		try{
			InsertUsuario usuario = new InsertUsuario();
			usuario.insert(usuario);
			
		}catch(SQLException e){
			
		}
		fail("Not yet implemented");
	}

}
