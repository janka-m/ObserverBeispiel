package ObserverBeispiel;

public class Main {
	public static void main(String[] args) {
		Daten daten = new Daten();
		Balkendiagramm balkendiagramm = new Balkendiagramm(daten);
		Kreisdiagramm kreisdiagramm = new Kreisdiagramm(daten);
		
		daten.setDaten(new int[] {20,28,31});
		daten.abmelden(kreisdiagramm);
		
		daten.setDaten(new int[] {100,1,17});
		
	}
}
