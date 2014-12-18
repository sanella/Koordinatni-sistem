
public class TestTacka {
public static void main(String[] args) {
	Tacka prva = new Tacka();
	Tacka druga= new Tacka(3.0, 3.0);
	Tacka treca = new Tacka(druga);
	
	System.out.println(prva.toString());
	System.out.println(druga.toString());
	System.out.println(treca.toString());
	
	System.out.println(prva.equals(druga));
	System.out.println(druga.equals(treca));
	
	System.out.println(prva.udaljenost(druga));
	System.out.println(druga.udaljenost(treca));
}
}