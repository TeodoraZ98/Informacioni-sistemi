

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


@Remote(KorisnikService.class)

@Stateless
public class KorisnikServiceImpl implements KorisnikService {
	//@PersistenceContext(name = "FirmaProjekat")
	private EntityManager em;
	public KorisnikServiceImpl()
{
   EntityManagerFactory emf = Persistence
         .createEntityManagerFactory("projekat2");
em = emf.createEntityManager();
}
	
	public void addKorisnik(String adresa, String ime,String prezime, String racun) {
try{

    int ra=Integer.parseInt(racun);

    Korisnik z1 = new Korisnik(ime,prezime,adresa,ra);
    em.persist(z1);
 
        } catch(Exception ex) {
	
	System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
	
	}  
    
  }
	   
	    public Korisnik getKorisnik(int id) {
	       Korisnik k = em.find(Korisnik.class, id);
	       return k;
	    }

public void deleteKorisnik(String bid) {
try{
 
    int kid=Integer.parseInt(bid);
    Korisnik k1 =em.find(Korisnik.class, kid);
    em.getTransaction().begin();
    em.remove(k1);
    em.getTransaction().commit();
        } catch(Exception ex) {
	
	System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
	
	}  
   
  }
     

public void updateKorisnik(String aid, String aadresa) {
try{

	em.getTransaction().begin();
    int kid=Integer.parseInt(aid);
    Korisnik k1 =em.find(Korisnik.class, kid);
    System.out.println(aadresa);
    k1.setAdresa(aadresa);
    em.getTransaction().commit();

    
       
        } catch(Exception ex) {
	
	System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
	
	}  
    
  }


public void updateKorisnikAdresa(int id, String s)
{
	Korisnik k1=em.find(Korisnik.class, id);
	em.getTransaction().begin();
	k1.setAdresa(s);
	em.getTransaction().commit();
}
public void updateKorisnikRacun(int id, int racun) {
   Korisnik Korisnik = em.find(Korisnik.class, id);
   em.getTransaction().begin();
   Korisnik.setRacun(racun);
   em.getTransaction().commit();
}
public void deleteKorisnik(int id) {
	Korisnik Korisnik = em.find(Korisnik.class, id);
	em.getTransaction().begin();
	em.remove(Korisnik);
	em.getTransaction().commit();
}


public List<Korisnik> spisakKorisnika() {

	List<Korisnik> sviKorisnici = em.createQuery("SELECT k FROM Korisnik k", Korisnik.class).getResultList();
	return sviKorisnici;
}
}