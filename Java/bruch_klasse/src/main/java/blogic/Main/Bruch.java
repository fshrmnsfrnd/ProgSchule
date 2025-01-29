package blogic.Main;

public class Bruch {
    
	private int zaehler = 0;
	private int nenner = 1;


	private void kuerzen(){
		int temp;
		int a = this.zaehler;
		int b = this.nenner;
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		this.zaehler /= a;
		this.nenner /= a;
	}


	public final boolean setWert(int z, int n){
		if (this.nenner != 0) {
			this.zaehler = z;
			this.nenner = n;
			kuerzen();
			return true;
		}
		return false;
	}

	public double getWert() {
		return (double)this.zaehler / this.nenner;
	}

	public void printWert() {
            double a = (double)this.zaehler / this.nenner;
		System.out.println(a);
	}
        
        public Bruch(int z, int n) {
            setWert(z, n);
	}
}
