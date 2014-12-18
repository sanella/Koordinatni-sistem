import javax.print.attribute.standard.MediaSize.Other;



public class Krug {
	private Tacka centar;
	private double radijus;
	
	Krug(Tacka centar, double radijus){
		this.centar = new Tacka();
		this.radijus = 0.0;
	}
	
	Krug(double x, double y, double radijus){
		this.centar = new Tacka (x, y);
		this.radijus = radijus;
	}
	
	Krug(Krug other){
		this.centar= other.centar;
		this.radijus = other.radijus;
	}
	
	public String toString() {
		String krug = "(" +centar.toString() + ")" + radijus;
		return krug;

	}
	
	public boolean equals(Krug other){
		if(this.centar.equals(other.centar) && this.radijus == other.radijus)
			System.err.println("Unio si dvije iste tacke");
		return false;
	}
	
	public int polozajTacke(Tacka testna){
		if(centar.udaljenost(testna) > this.radijus)
			return -1;
		if(centar.udaljenost(testna) < this.radijus)
			return 1;
		if(centar.udaljenost(testna) == this.radijus)
			return 0;
		
		return 2;
	}
	
	public String polozajKrugova(Krug drugi){
		
		double sumaRadijusa = this.radijus + drugi.radijus;
		if(centar.udaljenost(drugi.centar) < sumaRadijusa)
			return "Sijeku se";
		if (centar.udaljenost(drugi.centar) > sumaRadijusa)
			return "Ne sijeku se";
		return null;
	}
	
}
