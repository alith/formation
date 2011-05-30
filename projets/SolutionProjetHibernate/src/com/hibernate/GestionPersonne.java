package com.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import com.hibernate.mapping.object.genere.Personne;

public class GestionPersonne {
	public GestionPersonne(){}
	public void ajoutePersonne(Personne p)
	{
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public List getPersonne()
	{
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("From Personne");		
		return query.list();
	}
	
	public List getPersonneByCriteria(int ageMin)
	{
		Session session=HibernateUtil.currentSession();
		Criteria critere=session.createCriteria(Personne.class);
		critere.add(Restrictions.gt("Age",new Integer(ageMin)));
		return critere.list();
	}
	
	public List getPersonneByQuery(int ageMin)
	{
		Session session=HibernateUtil.currentSession();
		Query query=session.createQuery("From Personne where Age>"+ageMin);	
		return query.list();
	}
	
	public static void main(String [] args)
	{
		GestionPersonne ajout=new GestionPersonne();
		Personne p=new Personne();
		p.setNom("Dupont");
		p.setAge(new Integer(18));
		p.setAdresse("45 avenue la couane 13600 La Ciotat");
		p.setPrenom("Valentin");
		ajout.ajoutePersonne(p);
		List  mesPersonnes=ajout.getPersonne();
		Personne pTmp = null;
		for (Iterator it=mesPersonnes.iterator();it.hasNext();)
			{pTmp=(Personne) it.next();System.out.println(pTmp.getNom());}
	}
}
