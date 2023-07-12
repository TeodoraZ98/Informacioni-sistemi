 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
 
@Entity
@Table(name = "korisnik")
public class Korisnik {
 
    

	@TableGenerator(name = "kor_generator", table = "zid1_generator", pkColumnName = "ime_generatora", valueColumnName = "vrednost_gen", allocationSize = 1, pkColumnValue = "kor_generator")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "kor_generator")
    @Column(name = "korid",updatable=false,nullable=false)

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column*/
private int id;
 
    @Column(name = "ime")
    private String ime;
    @Column(name="prezime")
    private String prezime;
    @Column(name = "adresa")
    private String adresa;
 
 
    @Column(name = "racun")
    private int racun;
   
 
    public Korisnik() {
 
    }
 
    public Korisnik(String ime,String prezime, String adresa, int racun) {
        this.setIme(ime);
        this.setPrezime(prezime);
        this.setAdresa(adresa);
        this.setRacun(racun);
       
    }
 
    public int getId() {
        return id;
    }
 
    
    
    public int getRacun() {
        return racun;
    }
 
    public void setRacun(int racun) {
        this.racun = racun;
    }
  
 
    public String getIme() {
        return ime;
    }
 
    public void setIme(String ime) {
        this.ime = ime;
    }
  public String getPrezime()
  {
	  return prezime;
  }
  public void setPrezime(String prezime)
  {
	  this.prezime=prezime;
  }
    public String getAdresa() {
        return adresa;
    }
 
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
 
  
    
    
     @Override
     public String toString() {
	
	        return ime + ";"+prezime+" " + ";" + id+";"+adresa;
	
	    }
}

