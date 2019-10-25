package ObserverBeispiel;

public class Kreisdiagramm implements Beobachter{
private Daten daten;
	
	public Kreisdiagramm(Daten daten) {
		this.daten = daten;
		this.daten.registrieren(this);
	}
	
	@Override
	public void update() {
		int[] zahlen = daten.getDaten();
		System.out.println("Kreisdiagramm:");
		for (int i : zahlen) {
			System.out.println(i);
		}
		
}
}
