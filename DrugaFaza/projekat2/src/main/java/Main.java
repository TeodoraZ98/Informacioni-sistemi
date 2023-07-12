
import java.io.IOException;
import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import javax.ejb.EJB;



public class Main {
		public static void main(String[] args) {
			
			KorisnikService ks = new KorisnikServiceImpl();
			ks.deleteKorisnik("17");
			
			//KorisnikService ks1 = new KorisnikServiceImpl();
			//ks1.addKorisnik("Nema", "Veljko", "Stojadinovic", "1000");
			
			//KorisnikService ks2 = new KorisnikServiceImpl();
			//ks2.updateKorisnik("20", "KoZna");
			
			//KorisnikService ks3 = new KorisnikServiceImpl();
			//ks3.updateKorisnikAdresa(20, "aaaaaaaaaaaaa");
			
			//KorisnikService ks4 = new KorisnikServiceImpl();
			//ks4.deleteKorisnik(20);
			
			KorisnikService ks5 = new KorisnikServiceImpl();
			List<Korisnik> korisnici = ks5.spisakKorisnika();
			System.out.println(korisnici.size());
			assertNotNull(korisnici);
			
			}

}