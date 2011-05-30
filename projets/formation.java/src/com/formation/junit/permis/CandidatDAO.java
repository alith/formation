/**
 * 
 */
package com.formation.junit.permis;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author excilys
 *
 */
public class CandidatDAO {
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public CandidatDAO () {
	}
	
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatsPermis", "root", "root");
		} catch (ClassNotFoundException e) {
			//il faudrait loguer
			throw new RuntimeException("Driver non trouvé",e);
		} catch (SQLException e) {
			//il faudrait loguer
			throw new RuntimeException("Probleme avec la base de données: ",e);
		}
	}
	
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			//il faudrait loguer
			throw new RuntimeException("Probleme avec la base de données: ",e);
		}
	}
	
	public void register(Candidat c) {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT max(IDCandidat) from CANDIDAT ");
			int maxId = 0;
			while (rs.next()) {
				maxId = rs.getInt(1) + 1;
			}
			rs.close();
			StringBuilder query =  new StringBuilder();
			query.append("insert into CANDIDAT (IdCandidat, NomCandidat, NumIdCandidat, ddnCandidat, codeObtenu) values (\"");
			query.append(maxId).append("\", \"").append(c.getNom()).append("\", ");
			query.append("\"").append(c.getNumId()).append("\", ");
			query.append("\"").append(c.getDateNaissanceFormatteeSQL()).append("\", ");
			if (c.isCodeObtenu()) {
				query.append("\"").append(1).append("\")");
			} else {
				query.append("\"").append(0).append("\")");
			}
			stmt.execute(query.toString());
			stmt.close();
			c.setId(maxId);
		} catch (SQLException e) {//il faudrait loguer
			System.out.println(" Probleme lors de l'execution de la requete:");
			e.printStackTrace();
		}
	}
	
	public Candidat findById(int id) {
		Candidat result = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * from CANDIDAT WHERE IdCandidat = " + id);
			while (rs.next()) {
				result = new Candidat();
				int iAux = rs.getInt(1);
				if (!rs.wasNull()) result.setId(iAux);
				String sAux = rs.getString(2);
				if (!rs.wasNull()) result.setNom(sAux);
				iAux = rs.getInt(3);
				if (!rs.wasNull()) result.setNumId(iAux);
				Date dAux =	rs.getDate(4);
				if (!rs.wasNull()) {
					result.setDateNaissance(dAux);
				}
				iAux = rs.getInt(5);
				if (!rs.wasNull()) {
					if (iAux == 1) result.setCodeObtenu(true);
					if (iAux == 0) result.setCodeObtenu(false); //inutile car false par default et null impossible.
				}
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {//il faudrait loguer
			System.out.println(" Probleme lors de l'execution de la requete:");
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<Candidat> findByNumId(int numId) {
		ArrayList<Candidat> result = new ArrayList<Candidat>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * from CANDIDAT WHERE NumIdCandidat = " + numId);
			while (rs.next()) {
				Candidat current = new Candidat();
				int iAux = rs.getInt(1);
				if (!rs.wasNull()) current.setId(iAux);
				String sAux = rs.getString(2);
				if (!rs.wasNull()) current.setNom(sAux);
				iAux = rs.getInt(3);
				if (!rs.wasNull()) current.setNumId(iAux);
				Date dAux =	rs.getDate(4);
				if (!rs.wasNull()) {
					current.setDateNaissance(dAux);
				}
				iAux = rs.getInt(5);
				if (!rs.wasNull()) {
					if (iAux == 1) current.setCodeObtenu(true);
					if (iAux == 0) current.setCodeObtenu(false); //inutile car false par default et null impossible.
				}
				result.add(current);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {//il faudrait loguer
			System.out.println(" Probleme lors de l'execution de la requete:");
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<Candidat>  findByName(String name) {
		ArrayList<Candidat> result = new ArrayList<Candidat>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * from CANDIDAT WHERE NomCandidat LIKE \"" + name + "\"");
			while (rs.next()) {
				Candidat current = new Candidat();
				int iAux = rs.getInt(1);
				if (!rs.wasNull()) current.setId(iAux);
				String sAux = rs.getString(2);
				if (!rs.wasNull()) current.setNom(sAux);
				iAux = rs.getInt(3);
				if (!rs.wasNull()) current.setNumId(iAux);
				Date dAux =	rs.getDate(4);
				if (!rs.wasNull()) {
					current.setDateNaissance(dAux);
				}
				iAux = rs.getInt(5);
				if (!rs.wasNull()) {
					if (iAux == 1) current.setCodeObtenu(true);
					if (iAux == 0) current.setCodeObtenu(false); //inutile car false par default et null impossible.
				}
				result.add(current);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {//il faudrait loguer
			System.out.println(" Probleme lors de l'execution de la requete:");
			e.printStackTrace();
		}
		return result;
	}
	
	public void update(Candidat c) {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * from CANDIDAT WHERE IdCandidat = " + c.getId());
			StringBuilder query =  new StringBuilder();
			boolean exists = rs.first();
			rs.close();
			if (exists) {
				query.append("update CANDIDAT SET NomCandidat = \"").append(c.getNom()).append("\", ");
				query.append("NomCandidat = \"").append(c.getNom()).append("\", ");
				query.append("NumIdCandidat = \"").append(c.getNumId()).append("\", ");
				query.append("ddnCandidat = \"").append(c.getDateNaissanceFormatteeSQL()).append("\", ");
				if (c.isCodeObtenu()) query.append("codeObtenu = \"1\""); else query.append("codeObtenu = \"0\"");
				query.append("WHERE IdCandidat = \"").append(c.getId()).append("\"");
			} else {
				register(c);
			}
			rs = stmt.executeQuery(query.toString());
			rs.close();
			stmt.close();
		} catch (SQLException e) {//il faudrait loguer
			System.out.println(" Probleme lors de l'execution de la requete:");
			e.printStackTrace();
		}
	}
	
	public void delete (Candidat c) {
		try {
			stmt = conn.createStatement();
			StringBuilder query =  new StringBuilder();
			query.append("DELETE FROM CANDIDAT ");
			query.append("WHERE IdCandidat = \"").append(c.getId()).append("\"");
			stmt.execute(query.toString());
			stmt.close();
		} catch (SQLException e) {//il faudrait loguer
			System.out.println(" Probleme lors de l'execution de la requete:");
			e.printStackTrace();
		}
	}
	
}
