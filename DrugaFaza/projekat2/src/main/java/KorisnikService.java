import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface KorisnikService {

	public void addKorisnik(String adresa, String ime,String prezime, String racun);
    public void deleteKorisnik(String bid);
    public void updateKorisnik(String aid, String aadresa);
    public List<Korisnik> spisakKorisnika();
    public Korisnik getKorisnik(int id);
    public void updateKorisnikRacun(int id, int racun);
	//public void sendGET(String ckid) throws IOException;
    public void updateKorisnikAdresa(int id, String s);
    public void deleteKorisnik(int id);
	
}
