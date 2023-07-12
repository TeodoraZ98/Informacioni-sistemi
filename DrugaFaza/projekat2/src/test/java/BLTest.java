import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class BLTest {
@Test
public void TestAsertions()
{
	//da li se vracaju korisnici
	KorisnikService k=new KorisnikServiceImpl();
	List<Korisnik> korisnici=k.spisakKorisnika();
	assertNotNull(korisnici);
//da li krisnik sa id-om 4 ima ime Pavle
	 Korisnik e1=k.getKorisnik(4);
     assertEquals(e1.getIme(),"Pavle");
     // dali je dobro proslo apdejtovanje plate 
     k.updateKorisnikRacun(4, 2000);
     Korisnik e2=k.getKorisnik(4);
     assertEquals(e2.getRacun(),2000);
//da li je dobro proslo apdejtovanje adrese korisnika
     k.updateKorisnikAdresa(4, "NIS");
     Korisnik k1=k.getKorisnik(4);
     assertEquals(k1.getAdresa(),"NIS");
     //da li je obrisan korisnik sa datim id-om
     k.deleteKorisnik(8);
     Korisnik k5=k.getKorisnik(8);
     assertNull(k5);
  
}
}
