package com.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;


import com.hibernate.mapping.object.genere.Personne;
import com.hibernate.mapping.object.genere.ZoneRef;

public class GestionZoneRef {
	public GestionZoneRef(){}
	
	public void InitZone()
	{
		ZoneRef p=new ZoneRef();
		p.setPrix(new Float(200));
		p.setZoneDebut(new Integer(3));
		p.setZoneFin(new Integer(5));
		ajouteZoneRef(p);
		p=new ZoneRef();
		p.setPrix(new Float(300));
		p.setZoneDebut(new Integer(1));
		p.setZoneFin(new Integer(3));
		ajouteZoneRef(p);
		p.setPrix(new Float(100));
		p.setZoneDebut(new Integer(5));
		p.setZoneFin(new Integer(7));
		ajouteZoneRef(p);
		p.setPrix(new Float(1000));
		p.setZoneDebut(new Integer(1));
		p.setZoneFin(new Integer(7));
		ajouteZoneRef(p);
		p.setPrix(new Float(700));
		p.setZoneDebut(new Integer(1));
		p.setZoneFin(new Integer(5));
		ajouteZoneRef(p);
	}
	
	public void ajouteZoneRef(ZoneRef p)
	{
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public List getZoneRef()
	{
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("From ZoneRef");		
		return query.list();
	}
	
	public ZoneRef getZoneRef(int id)
	{
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("From ZoneRef where zone_id="+id);	
		return (ZoneRef) query.list().get(0);
	}
	
	public static void main(String [] args)
	{
		GestionZoneRef ajout=new GestionZoneRef();
		ajout.InitZone();
		List mesZoneRef=ajout.getZoneRef();
		ZoneRef zTmp=null;
		for (Iterator it=mesZoneRef.iterator();it.hasNext();)
			{zTmp=(ZoneRef)it.next();System.out.println("zone_deb : "+zTmp.getZoneDebut()+"zone_fin : "+ zTmp.getZoneFin());}
	}
	
}
