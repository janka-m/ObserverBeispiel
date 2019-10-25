package ObserverBeispiel;
import java.util.ArrayList;
import java.util.List;

public class Daten {
	private int[] zahlen;
	private List<Beobachter> beobachterListe;

	public Daten() {
		this.beobachterListe = new ArrayList<>();
		zahlen = new int[] { 5, 9, 13 };
	}

	public void registrieren(Beobachter beobachter) {
		this.beobachterListe.add(beobachter);
	}

	public int[] getDaten() {
		return zahlen;
	}

	public void setDaten(int[] zahlen) {
		this.zahlen = zahlen;
		// Beobachter benachrichtigen
		for (Beobachter b : beobachterListe) {
			b.update();
		}

	}
	public void abmelden(Beobachter beobachter) {
		this.beobachterListe.remove(beobachter);
	}

}
