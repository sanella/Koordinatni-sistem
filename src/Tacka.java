public class Tacka {
	private double koordinataX;
	private double koordinataY;
	
	public Tacka() {
		this.koordinataX = 0;
		this.koordinataY = 0;
	}

	public Tacka(double koordinataX, double koordinataY) {
		this.koordinataX = koordinataX;
		this.koordinataY = koordinataY;
	}

	public Tacka(Tacka other) {
		this.koordinataX = other.koordinataX;
		this.koordinataY = other.koordinataY;
	}

	public String toString() {
		String tacka = "(" + koordinataX + koordinataY + ")";
		return tacka;

	}

	public  double udaljenost(Tacka other) {
		double d = 0;
		double dio = (this.koordinataX - other.koordinataX) * (this.koordinataX - other.koordinataX) + (this.koordinataY - other.koordinataY)
				* (this.koordinataY - other.koordinataY);
		return d = Math.sqrt(dio);

	}

	public boolean equals(Tacka other){
		if(this.koordinataX == other.koordinataX && this.koordinataY == other.koordinataY){
			System.err.println("Nije moguce izracunati udlajenost jer si unio istu tacku!");
			//throw new IllegalArgumentException(" Nije moguce izracunati udlajenost jer si unio istu tacku!");
		}
		return false;	
	}
}
