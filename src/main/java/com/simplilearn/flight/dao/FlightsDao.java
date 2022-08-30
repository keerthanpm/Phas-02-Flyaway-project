package com.simplilearn.flight.dao;

import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.simplilear.flight.model.AdminDetails;
import com.simplilear.flight.model.BookingInfo;
import com.simplilear.flight.model.Flight_Details;
import com.simplilear.flight.model.UserDetails;
import com.simplilearn.flight.util.HibernateUtil;


public class FlightsDao {
	
	
	public void saveFlight(Flight_Details flight) {
		Transaction transaction =null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.save(flight);
			transaction.commit();
			
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public List<Flight_Details> getAllFlights() {
		
        List < Flight_Details > flightList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
           
            // get an user object
System.out.println("1.from DAO");
            flightList = session.createQuery("from Flight_Details").list();
            
            
        } catch (Exception e) {
            
            
            e.printStackTrace();
        }
        return flightList;
    }
	
	
	public void saveUser(UserDetails fuser) {
		Transaction transaction =null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.save(fuser);
			transaction.commit();
			
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Flight_Details> getSerachedFlights(String from, String to, String date) {
		
        List < Flight_Details > searchflightList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
           Query q = session.createQuery("from Flight_Details where  flight_from=:n and flight_to = :m and fdate = :o");
           q.setParameter("n", from);
           q.setParameter("m", to);
           q.setParameter("o", date);

           searchflightList = q.list();
              
            // commit transaction
           
        } catch (Exception e) {
            
            
            e.printStackTrace();
        }
        return searchflightList;
    }
	
	public boolean adminValidate(String name, String ppassword) {
		String password = ppassword;
		boolean value = false;
		AdminDetails admin;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			admin = (AdminDetails) session.createQuery("FROM AdminDetails WHERE aname = :name").setParameter("name", name).uniqueResult();
			
			System.out.println(password);
			String p = admin.getApassword();
			System.out.println(p);
			System.out.println(admin);
			if(admin.getApassword().equals(password)) {
				System.out.println(admin);
				
			value = true;
			}else {
				value = false;
			}
			
		}catch (Exception e) {
            
            
            e.printStackTrace();
		}
		return value;
	}
	
	
	public void updateAdminPassword(AdminDetails adminde) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(adminde);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
	}
	

	public void saveBooking(BookingInfo book) {
		Transaction transaction =null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.save(book);
			transaction.commit();
			
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
