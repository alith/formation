/**
 * 
 */
package com.excilys.formation.jdbc;

import java.sql.*;

/**
 * @author excilys
 *
 */
public class JoueurDAO {
	
	/**
	 * 
	 */
	public JoueurDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Joueur login(String login, String password) {
		Joueur result = null;
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formation_jdbc", "root", "root"); //j'ai drop la table joueurs, il faut reconstruire la db..
			Statement stmt = conn.createStatement();															// et pas dans la db mysql
			ResultSet rs = stmt.executeQuery("SELECT * from joueurs");
			while (rs.next()) {
				if (rs.getString(2).equals(login) && rs.getString(3).equals(password)) {
					String aux;
					result = new Joueur();
					aux = rs.getString(2);
					if (aux != null) result.setLogin(aux);
					aux = rs.getString(3);
					if (aux != null) result.setPassword(aux);
					aux = rs.getString(4);
					if (aux != null) result.setPrenom(aux);
					aux = rs.getString(5);
					if (aux != null) result.setNom(aux);					
					aux = rs.getString(6);
					if (aux != null) result.setDateNaissance(aux);
					aux = rs.getString(7);
					if (aux != null) result.setEmail(aux);
					aux = rs.getString(8);
					if (aux != null) result.setTelephone(aux);
					aux = rs.getString(9);
					if (aux != null) result.setPoste(aux);
				}
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String [] args) {
		JoueurDAO jdao= new JoueurDAO();
		System.out.println(jdao.login("admin","admin"));
		System.out.println(jdao.login("lol","admin"));
		System.out.println(jdao.login("sblanco","sblanco"));
		System.out.println(jdao.login("ribanez","ribanez"));
	}

}
