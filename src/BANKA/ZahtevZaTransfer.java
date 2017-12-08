package BANKA;

public abstract class ZahtevZaTransfer implements Cloneable {

	//private static int agid=0;
	//private int id=++agid;
	protected Racun primalac,uplatilac;
	protected double iznos;
	protected Datum dpodnosenja;
	
	public ZahtevZaTransfer(Racun pr,Racun up,double iz,Datum dp){
		primalac=pr; uplatilac=up;
		iznos=iz; dpodnosenja=dp;
	}

	public double getIznos() {
		return iznos;
	}
	
	public Datum getDpodnosenja() {
		return dpodnosenja;
	}
	
	public abstract String vrsta();
	public abstract double provizija();
	
	
	public abstract void izvrsi();
	/*public ZahtevZaTransfer clone(){//moze da se izvrsi kopiranje ali se ne kopiraju racuni
		ZahtevZaTransfer zzt=null;
		try {
			zzt=(ZahtevZaTransfer) super.clone();
			zzt.id=agid++;
			zzt.dpodnosenja=new Datum(dpodnosenja.getDan(),dpodnosenja.getMes(),dpodnosenja.getGod());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zzt;
	}
	*/
	public String toString(){
		return vrsta();
	}
		
	//	primalac.promeniStanje(iznos);
		
	
	
	
		
	
}
