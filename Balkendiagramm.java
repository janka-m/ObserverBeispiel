package ObserverBeispiel;

public class Balkendiagramm implements Beobachter {
	private Daten daten;
	
	public Balkendiagramm(Daten daten) {
		this.daten = daten;
		this.daten.registrieren(this);
	}
	
	@Override
	public void update() {
		int[] zahlen = daten.getDaten();
		System.out.println("Balkendiagramm:");
		for (int i : zahlen) {
			System.out.println(i);
		}
		
}
}
